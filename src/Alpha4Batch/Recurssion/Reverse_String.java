package Alpha4Batch.Recurssion;

public class Reverse_String {
    public static String  rev(String string ){
        // base case
        if (string == null || string.isEmpty()){
            System.out.println(string);
        }
        String newString = "";
            for (int i = string.length()-1; i >= 0 ; i--) {
               newString = newString+ string.charAt(i);
            }
            return newString;
    }
    public void revese(String s){
        int n = s.length();
        if (s== null || s.isEmpty()){
            System.out.println(s);
        }
        else {
            System.out.print(s.charAt(n-1));
            // function cal
            revese(s.substring(0,n-1)); // recursion
        }

    }
    public static void main(String[] args) {
        String s = "alok";

        Reverse_String rs = new Reverse_String();
       // rs.revese(s);
        System.out.println(rev(s));

    }
}
