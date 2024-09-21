package Alpha4Batch.String;

public class Compression {
    public static StringBuilder check(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            int count = 1;
           while (i <str.length()-1 && str.charAt(i) == str.charAt(i+1)){
               count++;
               i++;
           }
           sb.append(str.charAt(i));
            if (count>0){
                sb.append(count);
            }
        }
        return new StringBuilder(sb.toString());
    }
    public static void main(String[] args) {
        String str = "aaabbbccd";
        System.out.println(check(str));

    }
}
