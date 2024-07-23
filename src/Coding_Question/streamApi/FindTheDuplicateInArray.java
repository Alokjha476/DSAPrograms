package Coding_Question.streamApi;

public class FindTheDuplicateInArray {
    public static int findDuplicate(int [] array){
        int num = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] == array[i-1]){

                array[num] = array[i];
                System.out.println(array[num]);
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int [] array= {1,1,2,3,4,5,5};
        System.out.println(findDuplicate(array));


    }
}
