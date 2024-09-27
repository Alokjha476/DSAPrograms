package Alpha4Batch.Programs;

public class Fibonacci_Loop {
    public static void main(String[] args) {

        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");
        for (int i = 0; i < n; i++) {
            int nextTurm = firstTerm + secondTerm; // 1
            firstTerm = secondTerm;
            secondTerm = nextTurm;
            System.out.print(nextTurm + " ");

        }
    }
}
