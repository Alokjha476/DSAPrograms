package Coding_Question;

public class ReverseString {
    public static void reverseSwap(String str){

        char [] array = str.toCharArray();
        int startIdx = 0;
        int lastIdx = array.length-1;
     while (startIdx< lastIdx){

         char temp = array[startIdx];
         array[startIdx] =array[lastIdx];
         array[lastIdx] = temp;
         startIdx++;
         lastIdx--;

     }

     String newString = new String(array);
        System.out.println(newString);



    }



    public static void reverseString(String str) {
        StringBuffer str2 = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            char charAt = str.charAt(i);
            str2.append(charAt);
        }
        System.out.println(str2);

    }

    public static void main(String[] args) {
        String str = "Neeraj";
        //reverseString(str);
        reverseSwap(str);



    }
}
