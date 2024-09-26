package interview_questions.string;

public class Occurrence {
    public static String findOccurrence(String str) {

        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char ch = str.charAt(i);
            while (i < str.length() - 1 && ch == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 0) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbc";
        System.out.println(findOccurrence(str));

    }
}
