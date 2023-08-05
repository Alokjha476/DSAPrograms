package Alpha4Batch.OOPS;

public class Overridding {
    public static void main(String[] args) {
        B1 b = new B1();
        System.out.println(b.sum(1,3));
        System.out.println(b.sum(2,4));

    }
}
class A1{
    int sum(int  a ,int b ){
        return a+b;
    }
}
class B1 extends A1{
    int sum(int a, int b){
        return a*b;

    }

}


