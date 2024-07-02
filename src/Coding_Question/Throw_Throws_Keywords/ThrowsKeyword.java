package Coding_Question.Throw_Throws_Keywords;

public class ThrowsKeyword {
    public static void divideNum(int n, int m) throws ArithmeticException {
        try {
            int divide = m / n;
            System.out.println(divide);
        } catch (Exception e) {

            System.out.println("not divided by 0");
        }
    }

    public static void main(String[] args) {
        divideNum(0, 10);

    }
}
