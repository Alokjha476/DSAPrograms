package Alpha4Batch.Programs;

public class SumOfDigit {
    public static void sum(int number) {
        int sum = 0;
        int sumofdigit = sum;
        while (number > 0) {

            int lastDigit = number % 10;
            sumofdigit = sumofdigit + lastDigit;
            number = number / 10;

        }
        System.out.println(sumofdigit);

    }

    public static void main(String[] args) {
        sum(465);

    }
}
