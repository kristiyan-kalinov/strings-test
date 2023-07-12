import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static String doubleChar(String str) {
        StringBuilder ph = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            ph.append(str.charAt(i));
            ph.append(str.charAt(i));
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static int countCode(String str) {
        int count = 0;
        for(int i = 0; i <= str.length() - 4; i++) {
            if(str.substring(i, i + 4).matches("co[a-z]e")) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static boolean bobThere(String str) {
        boolean flag = false;
        for(int i=0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).matches("b[a-z0-9]b")) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
        return flag;
    }

    public static boolean xyBalance(String str) {
      boolean flag = true;
      for(int i=0; i<str.length(); i++) {
          if(str.charAt(str.length() - 1) == 'x') {
              flag = false;
              break;
          }
          if(str.charAt(i) == 'x') {
              for(int k=i+1; k<str.length(); k++) {
                  if(str.charAt(k) == 'y') {
                      flag = true;
                      break;
                  }
                  else flag = false;
              }
          }
      }
      System.out.println(flag);
      return flag;
    }

    public static int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length() - 1; i++) {
            if(str.startsWith("hi", i)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static boolean catDog(String str) {
        boolean flag = false;
        int countCat = 0;
        int countDog = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.startsWith("cat", i)) {
                countCat++;
            }
            if(str.startsWith("dog", i)) {
                countDog++;
            }
        }
        if(countCat == countDog) {
            flag = true;
        }
        System.out.println(flag);
        return flag;
    }

    public static boolean endOther(String a, String b) {
        boolean flag = false;
        if(a.length() > b.length()) {
            if(a.substring(a.length() - b.length()).equalsIgnoreCase(b)) {
                flag = true;
            }
        }
        else {
            if(b.substring(b.length() - a.length()).equalsIgnoreCase(a)) {
                flag = true;
            }
        }
        System.out.println(flag);
        return flag;
    }

    public static boolean xyzThere(String str) {
        boolean flag = false;
        if(str.contains("xyz")) {
            for(int i=0; i<=str.length() - 3; i++) {
                if(str.startsWith("xyz", i)) {
                    if(i == 0) {
                        flag = true;
                        break;
                    }
                    else if(str.charAt(i-1) != '.') {
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
        return flag;
    }

    public static String mixString(String a, String b) {
        StringBuilder ph = new StringBuilder();
        if(a.length() > b.length()) {
            for(int i=0; i<a.length(); i++) {
                ph.append(a.charAt(i));
                if(i<b.length()) {
                    ph.append(b.charAt(i));
                }
            }
        }
        else {
            for(int i=0; i<b.length(); i++) {
                if(i<a.length()) {
                    ph.append(a.charAt(i));
                }
                ph.append(b.charAt(i));
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static String repeatEnd(String str, int n) {
        StringBuilder ph = new StringBuilder();
        if(n >= 0 && n <= str.length()) {
            for(int i=0; i<n; i++) {
                ph.append(str.substring(str.length() - n));
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static String repeatFront(String str, int n) {
        StringBuilder ph = new StringBuilder();
        if(n >= 0 && n <= str.length()) {
            for(int i=n; i>=0; i--) {
                ph.append(str, 0, i);
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringJoiner joiner = new StringJoiner(sep);
        for(int i=0; i<count; i++) {
            joiner.add(word);
        }
        System.out.println(joiner);
        return joiner.toString();
    }

    public static boolean prefixAgain(String str, int n) {
        StringBuilder prefix = new StringBuilder(str.substring(0, n));
        boolean flag = false;
        if(n >= 1 && n <= str.length()) {
            for(int i=n; i<=str.length()-n; i++) {
                if(str.substring(i, i + n).contentEquals(prefix)) {
                    flag = true;
                }
            }
        }
        System.out.println(flag);
        return flag;
    }

    public static boolean xyzMiddle(String str) {
        boolean flag = false;
        int leftIndex, rightIndex;
        for(int i=str.length()/2-2; i<str.length()/2; i++) {
            if(str.length() >= 3 && i >= 0) {
                if(str.startsWith("xyz", i)) {
                    leftIndex = i;
                    rightIndex = i + 2;
                    if(Math.abs(str.substring(0, leftIndex).length() - str.substring(rightIndex+1).length()) == 1
                            || Math.abs(str.substring(0, leftIndex).length() - str.substring(rightIndex+1).length()) == 0) {
                        flag = true;
                    }
                }
            }
        }
        System.out.println(flag);
        return flag;
    }

    public static String getSandwich(String str) {
        StringBuilder ph = new StringBuilder();
        int leftIndex = -1, rightIndex;
        if(str.matches(".*bread.*bread.*")) {
            for(int i=0; i<str.length()-5; i++) {
                if(str.startsWith("bread", i)) {
                    leftIndex = i;
                    break;
                }
            }
            if(leftIndex != -1) {
                for(int k=str.length()-5;k>=leftIndex + 5;k--) {
                    if(str.startsWith("bread", k)) {
                        rightIndex = k;
                        ph.append(str, leftIndex + 5, rightIndex);
                        break;
                    }
                }
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static boolean sameStarChar(String str) {
        boolean flag = true;
        for(int i=1; i<str.length()-1; i++) {
            if(str.charAt(i) == '*') {
                char leftChar = str.charAt(i-1);
                char rightChar = str.charAt(i+1);
                if(leftChar != rightChar) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);
        return flag;
    }

    public static String oneTwo(String str) {
        StringBuilder ph = new StringBuilder();
        int helper = str.length();
        if(str.length()>=3) {
            for(int i=0;i<str.length();i+=3) {
                if(helper/3>0) {
                    ph.append(str.charAt(i+1));
                    ph.append(str.charAt(i+2));
                    ph.append(str.charAt(i));
                    helper-=3;
                }
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static String zipZap(String str) {
        StringBuilder ph = new StringBuilder(str);
        if(str.length()>=3) {
            for(int i=0; i<=ph.length()-3; i++) {
                if(ph.substring(i, i + 3).matches("z[a-z]p")) {
                    ph.deleteCharAt(i+1);
                }
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static String starOut(String str) {
        StringBuilder ph = new StringBuilder(str);
        if(ph.length()>1) {
            for(int i=ph.length()-2;i>0;i--) {
                if(ph.charAt(i) == '*') {
                    if(ph.charAt(i+1) != '*') {
                        ph.setCharAt(i+1, '@');
                    }
                    ph.setCharAt(i, '@');
                    if(ph.charAt(i-1) != '*') {
                        ph.setCharAt(i-1, '@');
                    }
                }
            }
            if(ph.charAt(0) == '*') {
                ph.setCharAt(0, '@');
                if(ph.charAt(1) != '*') {
                    ph.setCharAt(1, '@');
                }
            }
            if(ph.charAt(ph.length()-1) == '*') {
                ph.setCharAt(ph.length()-1, '@');
                if(ph.charAt(ph.length()-2) != '*') {
                    ph.setCharAt(ph.length()-2, '@');
                }
            }
            for(int k=ph.length()-1; k>=0; k--) {
                if(ph.charAt(k) == '@') {
                    ph.deleteCharAt(k);
                }
            }
        }
        else if(ph.length() == 1) {
            if(ph.charAt(0) == '*') {
                ph.deleteCharAt(0);
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static String plusOut(String str, String word) {
        StringBuilder ph = new StringBuilder(str);
        List<Integer> helper = new ArrayList<>();
        if(str.contains(word)) {
            for(int i=0; i<=str.length()-word.length(); i++) {
                if(str.startsWith(word, i)) {
                    for(int k=0; k<word.length(); k++) {
                        helper.add(i + k);
                    }
                }
            }
            for(int t=0; t<str.length(); t++) {
                if(!helper.contains(t)) {
                    ph.setCharAt(t, '+');
                }
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static String wordEnds(String str, String word) {
        StringBuilder ph = new StringBuilder();
        for(int i=0; i<=str.length()-word.length(); i++) {
            if(str.startsWith(word, i)) {
                if(i-1>=0) {
                    ph.append(str.charAt(i-1));
                }
                if(i+word.length()<str.length()) {
                    ph.append(str.charAt(i+word.length()));
                }
            }
        }
        System.out.println(ph);
        return ph.toString();
    }

    public static void main(String[] args) {
        //multiple line string
//        System.out.printf("""
//        Get busy living
//        or
//        get busy dying.
//        --Stephen King""");

        //empty and blank strings
//        String nullString = null;
//        String emptyString = "";
//        String blankString = " ";
//
//        System.out.println(nullString == null || nullString.isEmpty());
//        System.out.println(emptyString.isEmpty());
//        System.out.println(blankString.isEmpty());
//        System.out.println(blankString.isBlank());

        //remove last char of a string
//        String chop = "test1231";
//        System.out.println((chop == null || chop.length() == 0) ? null : (chop.substring(0, chop.length() - 1)));

        //count of a specific char in a string
//        String countable = "elephant";

//        char specificChar = 'e';
//        int count = 0;
//
//        for(int i = 0; i < countable.length(); i++) {
//            if(countable.charAt(i) == specificChar) {
//                count++;
//            }
//        }
//        System.out.println(count);

//        long count = countable.chars().filter(ch -> ch == 'e').count();
//        System.out.println(count);

        //split string
//        String[] splitted = "peter,james,thomas".split(",");
//
//        String[] splittedDot = "192.168.1.178".split("\\.");

        //palindrome
//        String name = "racecar";
//        StringBuilder clean = new StringBuilder(name);
//        StringBuilder reverse = clean.reverse();
//        System.out.println(reverse.toString().equals(name));

        //comparing strings
//        String string1 = "using equals ignore case";
//        String string2 = "USING EQUALS IGNORE CASE";
//
//        System.out.println(string1.equalsIgnoreCase(string2));

        //new line
//        String line1 = "Humpty Dumpty sat on a wall.";
//        String line2 = "Humpty Dumpty had a great fall.";
//        String rhyme = line1 + "\n" + line2;
//        String rhyme2 = line1 + System.lineSeparator() + line2;
//        System.out.println(rhyme);
//        System.out.println(rhyme2);

//        doubleChar("Hi-There");
//        countCode("cozexxcope");
//        bobThere("bac");
//        xyBalance("");
//        countHi("hihi");
//        catDog("1cat1cadodog");
//        endOther("abc", "abXabc");
//        xyzThere("abcxyz");
//        xyzThere("abc.xyz");
//        xyzThere("xyz.abc");
//        xyzThere("abcxy");
//        xyzThere("xyz");
//        xyzThere("xy");
//        xyzThere("x");
//        xyzThere("");
//        xyzThere("abc.xyzxyz");
//        xyzThere("abc.xxyz");
//        xyzThere(".xyz");
//        xyzThere("12.xyz");
//        xyzThere("12xyz");
//        xyzThere("1.xyz.xyz2.xyz");
//        mixString("xxxx", "There");
//        repeatEnd("Hello", 1);
//        repeatFront("Ice Cream", 2);
//        repeatSeparator("This", "And", 1);
//        prefixAgain("abXYabc", 3);
//        xyzMiddle("AxyzBBB");
//        getSandwich("xxbreadyy");
//        sameStarChar("*xa*az");
//        oneTwo("1234567890");
//        zipZap("zipXzap");
//        starOut("");
//        plusOut("12xy34xyabcxy", "xy");
//        wordEnds("XY1XY", "XY");
    }
}