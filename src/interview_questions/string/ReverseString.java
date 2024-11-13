package interview_questions.string;

// Problem: Reverse the characters in a string.
public class ReverseString {
    public static String reverseString(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        return str1;
    }

    public static String reverseByStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "racing car";
        String str1 = " ";
        System.out.println(reverseString(str));
        System.out.println(reverseByStringBuilder(str));
    }
}
