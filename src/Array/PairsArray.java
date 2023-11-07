package Array;

public class PairsArray {
    public static void pairsArr(int number[]){
        int tp = 0; // find the total pair

        for (int i = 0; i < number.length ; i++) {
            //current
            int current = number[i];// 2,4,6,8,10
            for (int j = i+1 ; j < number.length ; j++) { // 4,6,8,10

                System.out.print("("+ current+","+ number[j]+")");
                tp++;


            }
            System.out.println();

        }
        System.out.println("Total pairs is :" +tp);

    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        pairsArr(number);

    }
}
