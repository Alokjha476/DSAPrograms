

public class Main {
    public static void display1(int a){
        System.out.println("one");

    }
    public static void display(String str){
        int a =Integer.parseInt(str);
        System.out.println(a);
    }

    public static void main(String[] args) {
        display1(1);
        display("one");
//        display(123); // one two three
//        display("one", "two", "three"); // 1 2 3


    }


}


