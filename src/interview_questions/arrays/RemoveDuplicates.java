package interview_questions.arrays;

import java.util.*;
class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 7, 6, 6, 5, 5};
        Arrays.sort(a);
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[a.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.print(a[i] + "   ");
        }
    }
}
