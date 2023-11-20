package Alpha4Batch.Programs;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1600;
        boolean a = (year % 4) == 0;
        boolean b = ((year % 100 == 0) && (year % 400 == 0));
        if (year == 0) System.out.println("terminate");
        else if(a && b) System.out.println("It is Leap year");
        else System.out.println("NOT a leap year");
    }
}




