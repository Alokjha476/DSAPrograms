package Array;

import java.util.*;

public class MaxTime1 {
    public static void formMaxTime(List<Integer> list) {
        int h1, h2, m1 = 0, m2 = 0;
        boolean m1Flag = true, m2Flag = true;
        System.out.println(list);
        Collections.sort(list);
        int firstEl = list.get(0);
        list.remove(Integer.valueOf(firstEl));
        Optional<Integer> isLessThan3Exist = list.stream().filter(e -> e <= 3).max(Comparator.comparingInt(a -> a));
        if (firstEl == 2 && isLessThan3Exist.isPresent()) {
            h1 = firstEl;
            h2 = isLessThan3Exist.get();
        } else if (firstEl == 2 && !isLessThan3Exist.isPresent()){
            h1 = firstEl;
            h2 = 0;

        }
        else{
            h1 = firstEl <= 1 ? firstEl : 0;
            h2 = Collections.max(list);
        }
        list.remove(Integer.valueOf(h2));
        for (int i = list.size() - 1; i >= 0; i--) {
            if (5 >= list.get(i) && m1Flag) {
                m1 = list.get(i);
                m1Flag = false;
            } else if (m2Flag) {
                m2 = list.get(i);
                m2Flag = false;
            }
        }

        System.out.println(h1 + String.valueOf(h2) + ":" + m1 + m2);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6,7,8,9));
        formMaxTime(list);
    }
}

