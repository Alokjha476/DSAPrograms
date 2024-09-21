package interview_questions.string;

public class ReverseSentence {
    public static StringBuilder reverse(String sentence){
        StringBuilder sb = new StringBuilder();
        String [] word =sentence.split(" ");
        for (int i = word.length-1; i >= 0 ; i--) {
            sb.append(word[i]).append(" ");
        }
        return new StringBuilder(sb.toString().trim());
    }
    public static void main(String[] args) {
        String sentence = "This is my book.";
        System.out.println(reverse(sentence));
    }
}
