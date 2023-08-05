package Alpha4Batch.OOPS;

// Interfaces --> Blueprint of a class
public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        King k = new King();
        k.moves(); // ...............
    }
}

interface ChessPlayer {
    void moves(); // automatic public and abstract method , Blueprint
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal, (Four direction moves)");

    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal,(1 step at a time)");
    }
}