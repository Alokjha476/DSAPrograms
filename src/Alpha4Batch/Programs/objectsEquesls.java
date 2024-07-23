package Alpha4Batch.Programs;
class  A{

    String str = "String";

}

public class objectsEquesls {
    public static void main(String[] args) {

        A a = new A();
        A a1 = new A();

        if (a.equals(a1)){
            System.out.println("True");
        }

        else {
            System.out.println("objects is not equals");
        }



    }

}



