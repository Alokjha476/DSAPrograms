package Alpha4Batch.Programs;

public class Fibonacci_Loop {
    public  static void swap(){
        String s = "Neeraj";
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.println(s.charAt(i));

        }

    }
    public static void main(String[] args) {
        swap();
        int n = 10;
        int firstTerm = 0; int secondTerm = 1;
        System.out.println(firstTerm + " " + secondTerm);
        for (int i = 0; i <=n ; i++) {
            int nextTurm = firstTerm+secondTerm; // 1
            firstTerm = secondTerm;
            secondTerm = nextTurm;
            System.out.println(nextTurm);

        }
    }
}
