package Alpha4Batch.Throw_Throws_Keywords;

public class ThrowKeyword {
    public static void checkNum(int num) {
        if (num < 1) {
           // System.out.println("wrong");
            throw new ArithmeticException("number is negative can't calculate square");

        } else {
            System.out.println("number multiply " + "=" + (num * num));
        }


    }

    public static void main(String[] args) {

        checkNum(-3);

    }


}
