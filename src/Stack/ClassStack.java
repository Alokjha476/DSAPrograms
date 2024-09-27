package Stack;

import java.util.Stack;
import java.util.Vector;

public class ClassStack {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.push("alok");
        list.push("neeraj");
        list.push("piyush");
        list.push("kamal");
        System.out.println(list.peek());
        list.add(2, "ranjeet");
        System.out.println(list);


        Vector<String> vector = new Vector<>();
        vector.add("anuj");
        vector.add("annu");
        System.out.println(vector);
        vector.add(String.valueOf(list));

    }
}
