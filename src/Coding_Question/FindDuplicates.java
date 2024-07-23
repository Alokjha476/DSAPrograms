package Coding_Question;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FindDuplicates {


    public static void HashMap1(Integer[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else
                map.put(arr[i], 1);


        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + "is duplicate");
            }

        }

    }

    public static void HasSet1(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer key : arr) {
            if (!set.add(key)) { // duplicated not allowed
                duplicates.add(key); // is it duplicates
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("Duplicate is not found");
        } else
            System.out.println("duplicate found");
        for (Integer dup : duplicates) {
            System.out.println(dup);
        }
    }

    public static void findDuplicateElementInArray(Integer[] array) {
        // 1,2,3,4,5,1,2,3
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (Objects.equals(array[i], array[j])) {
                    count++;
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate){

                System.out.println("Duplicate Element is : "+ array[i] );
            }
        }
        System.out.println(count);
    }
    public static void findDuplicate(Integer [] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }

            }

        }



    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 5,5, 5};
//        HashMap1(arr);
//        HasSet1(arr);
       // findDuplicateElementInArray(arr);

        findDuplicate(arr);



    }


}

