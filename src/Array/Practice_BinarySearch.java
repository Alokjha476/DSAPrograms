package Array;

public class Practice_BinarySearch {
    public static int binary(int number[], int key){
        int start = 0;
        int end = number.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (number[mid] == key){
                return mid;
            }
            if (number[mid] < key){  // right
                start = mid +1;  // if will go in 2nd half then start will  be update with mid
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]= {2,4,6,8,10,12,14,16};
        int key = 12;       // index is 5
        System.out.println("the mid is "  +binary(number,key));

    }
}
