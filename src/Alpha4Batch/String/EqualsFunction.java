package Alpha4Batch.String;
//String Intern Pool or String Constant Pool
//Whenever we create a string the string object occupies some space in the heap memory
public class EqualsFunction {
    public static void main(String[] args) {
        String s1 = "Alok";  // store in constent poll/String pool
        String s2 = "Alok"; //store in constent poll/String pool
        String s5 = "Dog";
        String s3 = new String("Alok").intern();// store in Heap memory but intern mathed compare value
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));



    }
}
