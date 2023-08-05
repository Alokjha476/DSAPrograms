package Array;

public class Linear_Search {
    public static int getlargestNum(int number[]) {
        int largest = Integer.MIN_VALUE; // -infinity  // last conditon 7
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {   // 2 < 0
                // update number
                largest = number[i];
            }
            if (number[i] < smallest){
                // update number
                smallest = number[i];
            }

        }
        System.out.println("Smallest value is =" + smallest);
       return largest;


    }

    public static void main(String[] args) {
        int number[] = {2, 4, 3, 5, 6, 7};
       System.out.println("Largest number is = " +getlargestNum(number));


    }
}