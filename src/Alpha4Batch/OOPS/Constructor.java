package Alpha4Batch.OOPS;
// Parameterized constructor
// non parameterized constructor
public class Constructor {
    public static void main(String[] args) {
        Studnt s1 = new Studnt(); // call default or non-parameterized constructor
        Studnt s2 = new Studnt("Alok", 99, 24);
        Studnt s3 = new Studnt("Neeraj");
        Studnt s4 = new Studnt(5);
    }
}
class Studnt {
    // Non parameterized cons.
    Studnt(){
        System.out.println("Constructer is called .......");
    }
    Studnt(String name, int rollnum , int age){
        System.out.println(name);
        System.out.println(rollnum);
        System.out.println(age);

    }
    Studnt(String name){
        System.out.println(name);

    }
    Studnt(int rollno){
        System.out.println(rollno);

    }
}
