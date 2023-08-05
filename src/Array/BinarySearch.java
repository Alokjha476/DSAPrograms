package Array;

// array must be Ordered list or sorted array(Ascending or discending orderd)
public class BinarySearch {
    public static int Searching(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) { // found
                return mid;
            }
            if (number[mid] < key) { // right or 2nd half
                start = mid + 1;        // update first
            } else {      // left or 1st half
                end = mid - 1;   //update end
            }

        }
        return  -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("The index value of key 10 =" +Searching(number,key));

    }
}
