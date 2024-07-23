package Dynamic_Programing;
// Time coplexity O(n)
public class Fibonicci {
    public static int fib(int n , int[] newArr){
        // base case
        if (n ==0 || n ==1 ){
            return n;
        }
        // fib(n) is already calculated
        if (newArr[n] != 0){
            return newArr[n];
        }
        newArr[n] = fib(n-1, newArr)+ fib(n-2, newArr);
        return newArr[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] newArr = new int[n+1]; // 5+1 = 6
        System.out.println(fib(n,newArr));
    }
}
