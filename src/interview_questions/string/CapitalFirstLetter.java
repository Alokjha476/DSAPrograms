package interview_questions.string;

public class CapitalFirstLetter {
    public static String capital(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        char ch = str.toUpperCase().charAt(0);
        stringBuilder.append(ch);
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length()-1){
                while (str.charAt(i) == ' '){
                    stringBuilder.append(str.charAt(i));
                    i++;
                }
                stringBuilder.append(str.toUpperCase().charAt(i));
            }
            else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString().trim();
    }
    public static void main(String[] args) {
        String  str = "  m n i s AL ok Kumar";
        System.out.println(capital(str).trim());


    }
}
