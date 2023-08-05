package BackTracking;

public class GridWays {
    public static int countWay(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // cond for last cells
            return 1;
            // corner case
        } else if (i == n || j == m) {  // cond for cross boundry
            return 0;
        }
        // kaam
        int w1 = countWay(i + 1, j, n, m);  // down  got 3 way
        int w2 = countWay(i, j + 1, n, m); // right got 3 way
        int totalWays = w1 + w2;
        return totalWays; // 6 way
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.print("Total way :");
        System.out.println(countWay(0, 0, n, m));
    }
}
