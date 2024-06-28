package functional_Interface;

public class StringPalandrom {
    public static boolean isPalandrom(String str) {
        int n = str.length() - 1;
        for (int i = 0; i <= n; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }

    // while loop
    public static boolean ispalandrom1(String str1) {
        int startIndex = 0;
        int lastIndex = str1.length() - 1;
        while (startIndex < lastIndex) {
            char ch = str1.charAt(startIndex);
            char ch1 = str1.charAt(lastIndex);
            if (ch != ch1) {
                return false;
            } else {
                startIndex++;
                lastIndex--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "pop";
       // System.out.println(isPalandrom(str));
        System.out.println(ispalandrom1(str));

    }
}
