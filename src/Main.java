import javafx.scene.effect.SepiaTone;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] arr = {5,3,4,2,1,6};
        int n = arr.length;
        for (int i = 0; i < n  ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                int temp = arr[n-j-1];
                arr[n-j-1] = arr[j];
                arr[j] = temp;

            }





        }
        for (int arr1 : arr){
            System.out.println(arr1);
        }



    }
}