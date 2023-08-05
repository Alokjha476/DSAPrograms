package Alpha4Batch.String;

public class Stringbuilder {
    public static void stringBuild() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");  // dont make any double copy
        // time Comp is O(26) only
        for (char ch = 'A'; ch <= 'Z'; ch++) {

            sb.append(" " + ch);  // add the character

        }
        System.out.println(sb);

    }

    // time comp O(26 * n^2) very worst time complexity
    public static void AtoZ(){
        String str = "";
        for (char ch = 'A'; ch <= 'Z' ; ch++) {
            str += ch;  // str = A+AB+ABC...........ABCDEFGHIJKLMNOPQRSTUVWXYZ;

        }
        System.out.println(str);

    }
    public static void main(String[] args) {
        stringBuild();// Output -  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        AtoZ();// Output -ABCDEFGHIJKLMNOPQRSTUVWXYZ

    }
}
