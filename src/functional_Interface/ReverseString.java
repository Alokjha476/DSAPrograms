package functional_Interface;

public class ReverseString {
    public static void reverseString(String str) {
        StringBuffer str2 = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            char charAt = str.charAt(i);
            str2.append(charAt);
        }
        System.out.println(str2);

    }

    public static void main(String[] args) {
        String str = "Neeraj";
        reverseString(str);

    }
}
