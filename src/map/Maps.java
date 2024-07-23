package map;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        System.out.println(map);
        Integer value = map.get("one");
        System.out.println(value);

        map.remove("one");
        System.out.println(map);

        map.put("two", 2);
        System.out.println(map);

        map.remove("two");
        System.out.println(map);
       Integer m =  map.size();
        System.out.println(m);



    }

}
