package interview_questions.arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
    // to find the missing number by j
        int j = 1;// 2,3
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == j){
                j++;
            }
        }
        System.out.println(j);
    }
}

