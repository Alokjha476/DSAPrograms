package Alpha4Batch.BitwiseOpt;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Odd_Even {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getithBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearithBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;

    }

    public static int updateIBit(int n, int i, int newbit) {
//        if (newbit == 0) {
//            return clearithBit(n, i);
//        } else {
//           return setithBit(n, i);
//        }
        // find the clear bit
        n = clearithBit(n, i);
        int Bitmask = newbit << i;
        return n | Bitmask;

    }

    public static int clearLastBit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;


    }

    public static int clearRangeBit(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int Bitmask = a | b;
        return n & Bitmask;

    }

    public static boolean checknoPower(int n) {
        return (n & (n - 1)) == 0;
//        if ((n& n-1) == 0){
//            return true;
//        }
//        return false;
    }

    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            // Check out Least significant bit(LSB)
            if ((n & 1) != 0) {  // == 0 then no change in count
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n, int m) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {  // to check the LSB if the LSb should 1
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
       // return ans% m; // find the modular exponentiation
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3, 2));
    }
}
