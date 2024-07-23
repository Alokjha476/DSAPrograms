package Coding_Question;
// Compression the string
public class StringCompression {
    public static StringBuilder compression(String str){
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            Integer count = 1;
            while (i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;

            }
            newString.append(str.charAt(i));
            if (count>1){
                newString.append(count.toString());

            }
        }
        return newString;

    }

    public static void main(String[] args) {
        String str = "aaall";
        System.out.println(compression(str));

    }
}
