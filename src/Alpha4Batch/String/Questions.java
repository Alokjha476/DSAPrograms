package Alpha4Batch.String;
// Question 1-
public class Questions {
    public static boolean isPalindrome(String str) {
        // for half
        for (int i = 0; i < str.length() ; i++) {  // Linear time complexity O(n)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {  // n-1-0
                // not a palindrome
                return false;
            }
        }
        return true;
    }


    // question 2-   c
    public static float shortestPath(String path){
        int x = 0 , y = 0; // Origin point
        for (int i = 0; i <path.length() ; i++) {
            char dir = path.charAt(i);
            if (dir == 'N'){
                y++;
            }
           else if (dir == 'S'){
                y--;
            } else if (dir == 'E') {
               x++;

            } else  {
               x--;

            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (int) Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str = "racecar";
       // String str = "Alok ";
        // Call Q1
        System.out.println(isPalindrome(str));
        // Call Q2
//        String path = "WNEENESENNN";
//        System.out.println(shortestPath(path));

    }
}
