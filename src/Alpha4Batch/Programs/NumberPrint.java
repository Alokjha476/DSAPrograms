package Alpha4Batch.Programs;

public class NumberPrint {
    public static void main(String[] args) {
//        int a = 10;
//                int b =1;
//        System.out.println(b/a);    // divide 0
//        System.out.println(b%a);  // reminder 1


        for (int number = 1; number <= 100; number++) {
            if (number % 10 == 0 && number > 0) {
                System.out.println(number + "");
            } else {
                System.out.print(number + " ");
            }
        }
    }
}
