package assignment;

public class Evenoddprogram {
    public static void main(String[] args) {
        int arr[]={11,13,14,15,17,18,19,20,22,23};
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("even numbers are:" +arr[i]);
            }}
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0)
        {
            System.out.println("odd numbers are:" +arr[i]);
        }}
    }
}
