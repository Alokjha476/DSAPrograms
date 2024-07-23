package Coding_Question.Throw_Throws_Keywords;

public class
ThrowsKeyword {
    public static void divideNum(int n, int m) throws ArithmeticException {
//        try {
//            int divide = m / n;
//            System.out.println(divide);
//        } catch (Exception e) {
//
//            System.out.println("not divided by 0");
//        }

        try {
            if (n< m){
                System.out.println(n + m);

            }
            else throw new ArithmeticException();

        }
        catch (ArithmeticException e){
            System.out.println("n not biggest from m");
        }
    }

    public static void main(String[] args) {
        divideNum(11, 10);


    }
}
