package Alpha4Batch.String;
import java.util.Scanner;

public class NumberConvertString {

    public static void checkNumber(Integer num) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven"};

        String str = Integer.toString(num);
        int[] numberArray = convertStringToArray(str);
        for (int i = 0; i <numberArray.length ; i++) {
            System.out.print(numberArray[i] + " ");

        }

        // print data type
       // System.out.println(numberArray+ " data type" + numberArray.getClass().getSimpleName());
      // numberArray = 1 2 3 4 5

//        for (int i : numberArray) {
//            if (arr[i].equals(arr[0])){
//                System.out.println(arr[0]);
//            }
//            else if (arr[i].equals(arr[1])){
//                System.out.println(arr[1]);
//            }
//            else if (arr[i].equals(arr[2])){
//                System.out.println(arr[2]);
//            }
//            else if (arr[i].equals(arr[3])){
//                System.out.println(arr[3]);
//            }
//            else if (arr[i].equals(arr[4])){
//                System.out.println(arr[4]);
//            }
//
//        }


        for (int i = 0;  i <numberArray.length ; i++) {

            numberArray[i] = Integer.parseInt(arr[numberArray[i]]);

            System.out.println(numberArray[i]);

        }



    }
    // convert number string into array
    public static int[] convertStringToArray(String str){
        int [] numberArray = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            numberArray[i] = Character.getNumericValue(str.charAt(i));
        }
        return numberArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        checkNumber(num);



    }
}
