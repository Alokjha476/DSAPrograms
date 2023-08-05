package Alpha4Batch.OOPS;

public class Student {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("ALok ");
        // System.out.println(s.name);// default access modifier
        System.out.println(s.getName());// private access modifier
        s.setRollno(5);
        //System.out.println(s.rollno);// default access modifier
        System.out.println(s.getRollno()); // private access modifier
    }
}
class Student1 {
    private String name;
    private int rollno;
    private String subjects;

    void setName(String name) {
        this.name = name;
    }

    void setRollno(int rollno) {
        this.rollno = rollno;
    }

    String getName() {
        return this.name;
    }
    int getRollno() {
        return this.rollno;
    }
}

