package Array;

public class Practice_linear_BinarySearch {
    public static int linSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int laregst_smallestFind(int number[]) {
        int largest = Integer.MIN_VALUE;   // -infinity
        int smallest = Integer.MAX_VALUE; // + infinity
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
            if (number[i]<smallest){
                smallest = number[i];
            }
        }
        System.out.println("The smallest number is :" +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16}; // index 0 to 7
//        int key = 12;
//      int index =   linSearch(number,key);
//      if (index == -1){
//          System.out.println("Array number is not exist");
//      }
//      else {
//          System.out.println("The index number is :" +index);
//      }
        System.out.println("The largest number is : "+laregst_smallestFind(number));
    }
}
