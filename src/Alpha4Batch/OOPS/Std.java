package Alpha4Batch.OOPS;

public class Std {
    public static void main(String[] args) {
        Std1 s1 = new Std1();
        s1.name = "Alok";
        s1.rollno = 5;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 99;
        Std1 s2 = new Std1(s1); // copy
        s1.marks[2] = 98;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
class Std1 {
    int rollno;
    String name;
    String pass;
    int marks[];

    // Copy Constructor & Shallow copy constructor ||find the changed value in shallow
//    Std1(Std1 s1) { // S1 all propert copy in s2 from this const
//        marks = new int[3];
//        this.name = s1.name;
//        this.rollno = s1.rollno;
//        this.marks = s1.marks; // not copy full array but reference copy only
//    }
    // Deep copy constructor // find the unchanged value
    Std1(Std1 s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        // copy the value 0ne by one ||
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
    Std1() {
        marks = new int[3];
        System.out.println("Constructor is called....");
    }

    Std1(int rollno) {
        marks = new int[3];
        this.rollno = rollno;
    }

    Std1(String name) {
        marks = new int[3];
        this.name = name;
    }
}
