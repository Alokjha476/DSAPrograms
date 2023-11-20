package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int storeWaterFind(ArrayList<Integer> hight) {
        int maxWater = 0;
        //brute force - O(n^2)
        //line 1
        for (int i = 0; i < hight.size(); i++) {
            //line 2
            for (int j = i + 1; j < hight.size(); j++) {
                int ht = Math.min(hight.get(i), hight.get(j));
                int width = j - i;
                int currWater = width * ht;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // Optimized code --> O(n)  -->  2 pointer approach
    public static int storeWater(ArrayList<Integer> hight) {
        int maxWater = 0;
        int lp = 0;
        int rp = hight.size() - 1;
        while (lp < rp) {
            // calculate water area
            int ht = Math.min(hight.get(lp), hight.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //update pointer
            if (hight.get(lp) < hight.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        //[1, 8, 6, 2, 5, 4, 8, 3, 7]
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);

        System.out.println(hight);
        //  System.out.println(storeWaterFind(hight));
        System.out.println(storeWater(hight));
    }
}
