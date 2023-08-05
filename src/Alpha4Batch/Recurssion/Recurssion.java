package Alpha4Batch.Recurssion;

public class Recurssion {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void decOrder(int n) {
        // Base case
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        decOrder(n - 1);
    }

    public static void increasingOrder(int n) {
        if (n == 100) {
            System.out.println(100);
            return;
        }
        System.out.print(n + " ");
        increasingOrder(n + 1);

    }

    // 2nd method
    public static void increaOrd1(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        increaOrd1(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;

    }

    public static int calcSum(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Fn = n + Snm1;
        return Fn;
    }

    public static int fabboSerieas(int n) {

        // 0,1,1,2,3,5,8,13,21
        // fn = fn-1 + fn-2
        if (n == 1 || n == 0) {
            return n;
        }

//        // find the fn-1
//        int fnm1 = fabboSerieas(n-1);
//        // find fn-2
//        int fnm2 = fabboSerieas(n-2);
//        // from this // fn = fn-1 + fn-2
        // int fn = fnm1+ fnm2;
        return fabboSerieas(n - 1) + fabboSerieas(n - 2);  // last two number Sum
    }
//public static void printfab(int count){
//        if (count > 0){
//            n3 = n1 + n2;
//            n1 = n2 ;
//            n2 = n3;
//            System.out.print(n3 + " ");
//            printfab(count -1);
//        }
//    }

    public static boolean isSorted(int[] arr, int i) {
        // Base case
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        // for true
        // check if above condition true
        return isSorted(arr, i + 1);
    }

    public static int firstOcurane(int[] arr, int i, int key) {
        // Base case
        if (i == arr.length) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return firstOcurane(arr, i + 1, key);
    }

    public static int lastOcurane(int[] arr, int key, int i) {
        // Base case
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOcurane(arr, key, i + 1);
        if (isfound != -1) {//reverse //if(isfound == -1 && arr[i] == key) return i;
            return isfound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isfound; //reverse
    }

    public static int powerCal(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
//        int xnm1 = powerCal(x, n - 1);
//        int fn = x * xnm1;
//        return fn;
        return x * powerCal(x, n - 1);
    }

    public static int optimizedPower(int x, int n) { // time complexity O(log n)
        // base case
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n / 2);
        int halfpowerSqr = halfpower * halfpower;
        // for odd power case
        if (n % 2 != 0) {
            return x * halfpowerSqr;
        }
        // for even power case
        return halfpowerSqr;
    }

    public static int tilingProblem(int n) { // 2 * n floor size
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // work - Take the choice
        // Vertical choice
        int verticle = tilingProblem(n - 1);
        // horizontal choice
        int horizontal = tilingProblem(n - 2);
        // total ways
        int totalWays = verticle + horizontal;

        return totalWays;
    }

    // coming in googls interviews
    public static void removeDuplicatesString(String str, int idx, StringBuilder newString, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        // kaam// find the   and check it map array it already exist or not
        char currChar = str.charAt(idx);
        // currchar -'a' tells index number of the character  p-a = 15; again p -a = 15;
        if (map[currChar - 'a']) {
            // duplicate
            removeDuplicatesString(str, idx + 1, newString, map);
        } else {

            // exist in map array then set it true
            map[currChar - 'a'] = true;
            removeDuplicatesString(str, idx + 1, newString.append(currChar), map); // newString.append(currChar) add the string
        }
    }

    public static int friendPairProb(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        //kaam
        // for Single frnd
        int fnm1 = friendPairProb(n - 1);
        // for 3 frnd
        int fnm2 = friendPairProb(n - 2);
        int PairWays = (n - 1) * fnm2;
        // total n frnds
        int totalfrnd = fnm1 * PairWays;

        // calling fn
        return totalfrnd;
    }

    // coming in paytm interviews
    // for two consucative 1 means 11 not allowed in this print string
    public static void binaryString(int n, int lastplace, String str) { // 11
        //Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        //kaaam
//        if (lastplace == 0) {
//            // sit 0 n chair
//            binaryString(n - 1, 0, str + "0");        // function call
//            binaryString(n - 1, 1, str + "1");        // function call
//        } else {
//            binaryString(n - 1, 0, str + "0");        // function call
//        }
        binaryString(n - 1, 0, str + "0"); // for 1 and 0
        if (lastplace == 0) {
            binaryString(n - 1, 1, str + "1"); // for only 1;
        }
    }

    public static void printBinary(int n, int lastplace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        // for 1 choice
       /* if (lastplace == 1){
            printBinary(n-1,1,str+"1");
            printBinary(n-1,0,str+"0");
        }
        else {
            printBinary(n-1,1,str+"1");
        }*/
        printBinary(n - 1, 1, str + "1");
        if (lastplace == 1) {
            printBinary(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        // printBinary(3,0,new String(""));
        //binaryString(3, 0, new String(""));
        // System.out.println(friendPairProb(3));

        /*String str = "appnnacollege";
        removeDuplicatesString(str, 0, new StringBuilder(" "), new boolean[26]); */
//        System.out.println(tilingProblem(4));
//        System.out.println(optimizedPower(2, 5));
        //System.out.println(powerCal(2, 10));
       /* int arr[] = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9};
        System.out.println(lastOcurane(arr, 7, 4));*/
        /* int count = 10;
        System.out.print(n1 + " " + n2 + " ");
        printfab(count-2);// manage the printing number */

   /* int arr[] = {1,2,3,4,5,9,7,8};
    System.out.println(isSorted(arr,0));*/

    }
}
