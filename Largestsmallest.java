package assignment;

public class Largestsmallest {
    public static void main(String[] args) {
        int arr[]= {1,3,4,-5,-14,15};
        int min = arr[0];
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
            if (arr[i]>max) {
                max = arr[i];
            }
            }
        System.out.println("smallest:" +min+  "\nlargest:"  +max);

        }
    }

