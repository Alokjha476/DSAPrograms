package Alpha4Batch.String;

public class Count {

    public static void count(String s){

        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String s = "ApnaCollege";
        count(s);


    }
}
