package SyntaxWithParameter;


import java.util.ArrayList;
import java.util.List;

class CallByReference {
    public static void addEle(List<Object> list) {
        list.add(1);
        list.add(2);
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        addEle(list);

        System.out.println(System.identityHashCode(list));

    }

}
