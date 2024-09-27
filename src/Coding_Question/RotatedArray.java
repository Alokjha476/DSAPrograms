package Coding_Question;

public class RotatedArray {
    public static int findElement(int[] arr1, int si, int ei, int target) {
        // base case
        if (si > ei) {
            return -1;
        }
        // work
        // find the mid
        int mid = si + (ei - si) / 2;
        if (arr1[mid] == target) {
            return mid;
        }
        // Line 1
        if (arr1[si] <= arr1[mid]) {
            // case 1
            if (arr1[si] <= target && target <= arr1[mid]) {
                return findElement(arr1, si, mid - 1, target);
            } else
                return findElement(arr1, mid + 1, ei, target);
        } else {
            if (arr1[mid] <= target && target <= arr1[ei]) {
                return findElement(arr1, mid + 1, ei, target);
            } else
                return findElement(arr1, si, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 1, 2, 3, 4, 5};
        int idx = findElement(arr, 0, arr.length - 1, 5);
        System.out.println(idx);
    }
}
