package BackTracking;

public class Permutation {
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // kaam = recurssion
        for (int i = 0; i < str.length(); i++) {
            // current position pr index i =0;
            char curr = str.charAt(i);
            // for delete the string
            // "abcde" = "ab" + "de" = "abde" ; deduct c
            String newstr = str.substring(0, i) + str.substring(i + 1); // curr gayab ho jayega
            findPermutation(newstr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        findPermutation(str, " ");
    }
}
  // time complexity =  O(n * n!)  because input 3 string 3! = 3*2*1 = 6 permutation , and in sabhi parmutation ko nikalne m lga time = n
//  Space complexity = O(n)