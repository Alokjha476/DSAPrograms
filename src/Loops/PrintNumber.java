package Loops;

public class PrintNumber {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 0; i <5 ; i++) {

            for (int j = 0; j <i+1 ; j++) {

                System.out.print(number);
                number++;
                
            }
            System.out.println();
            
        }
    }
}
