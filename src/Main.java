import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        List<Object> list = new ArrayList<>();
        map.put("Alok", 1);
        list.add(6);
        list.add(7);
        System.out.println(list.size());
    }
}