package BackTracking;

//time complexity - O(n)
public class GridWayOptimizedCode {
    public static int fac1(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        return n * fac1(n - 1);
    }
    public static int fac2(int m) {
        if (m == 0) {
            return 1;
        }
        //kaam
        return m * fac1(m - 1);
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(fac1(n) + fac2(m) / (fac1(n) * fac2(m)));
    }
}