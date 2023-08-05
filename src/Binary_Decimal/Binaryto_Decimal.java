package Binary_Decimal;

public class Binaryto_Decimal {
    public static void binNum(int binnum) {
        int mynum = binnum;
        int decimal = 0;
        int power = 0;
        while (binnum > 0) {
            int lastdigit = binnum % 10;  // for find the last digit
            decimal = decimal + (lastdigit * (int) Math.pow(2, power)); // logic
            power++;  // increse power when binnum is not be 0;
            binnum = binnum / 10;     //for remove the last digit
        }
        System.out.println("Binary number is :" + mynum + " " + "Of desimal :" + decimal);

    }

    public static void DectoBin(int num) {
        int mynum = num;
        int pow = 0;
        int binNum = 0;
        while (num > 0) {
            int reminder = num % 2;  // Reminder
            binNum = binNum + (reminder * (int) Math.pow(10, pow));  // logic
            pow++; // increase 10 ki power
            num = num / 2;   // it will be zero after dividing and dividing

        }
        System.out.println("your decimal number is :" + mynum + " " + "And binary number is : "+ binNum);
    }

    public static void main(String[] args) {
         binNum(1001);      //Output = Binary number is :1001 Of desimal :9
        DectoBin(5); //Output = your decimal number is :5 And binary number is : 101


    }
}
