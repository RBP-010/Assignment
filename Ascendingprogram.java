package assignment;

import java.util.Arrays;

public class Ascendingprogram {
    public static void main(String[] args) {
        int arr[]= {33,45,78,48,89};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
