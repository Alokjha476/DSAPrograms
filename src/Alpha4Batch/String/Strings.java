package Alpha4Batch.String;

public class Strings {
    public static void main(String[] args) {

        String Firstname = "Alok";
        String Secondname = "kumar";
        String name = Firstname + " "+ Secondname;  // concatenate
        System.out.println(name.length()); // calculate length 11
        System.out.println(name.charAt(2));  // char of 2nd index will be o.
        //print all char
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));

        }
    }
}
