package Alpha4Batch.OOPS;

public class Super_ThisKeyword {
    public static void main(String[] args) {
        Horses h = new Horses();
        System.out.println(h.name);
        System.out.println(h.sum("Alok",5));
    }
}
class Animals {
    String name;
    int rollnumber;
    boolean sum(String name, int rollnumber){
        this.name = name;

        this.rollnumber= rollnumber;
        return false;
    }
    Animals() {

        System.out.println("Animal constructor called");
    }
}
class Horses extends Animals {
    Horses() {
        super();
       super.sum("Alok ", 5);

        super.name = "Alok";
        System.out.println("Horse constructor called");
    }

}