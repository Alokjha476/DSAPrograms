package Array;

import java.util.Arrays;
import java.util.Collections;

public class MaxTime {
    public static void main(String[] args) {
        int h1 = 0;
        int h2 = 0;
        int h3 = 0;
        int h4 = 0;
        boolean h1flag = true;
        boolean h2flag = true;
        boolean h3flag = true;
        boolean h4flag = true;

        Integer[] arr = {5,4,1,5};
        Arrays.sort(arr, Collections.reverseOrder()); // 5,5,4,1
        for (Integer integer : arr) {
            if (integer >= 0 && integer <= 9) {
                // for 0,1,2
                if (integer <= 2 && h1flag) {
                    h1 = integer;
                    h1flag = false;
                    continue;
                }
                // for 0,3 --> 23 : --
                if (integer <= 3 && h2flag) {
                    h2 = integer;
                    h2flag = false;
                    continue;
                }
                // for 0,5
                if (integer <= 5 && h3flag) {
                    h3 = integer;
                    h3flag = false;
                    continue;
                }
                if (h4flag) {
                    h4 = integer;
                    h4flag = false;
                }
            } else {
                throw new RuntimeException("Invalid Number : number is greater than 9 or less than 0");
            }
        }
        String time =""+ h1 + h2 + ":" + h3 + h4;

        System.out.println(time);

    }
}
