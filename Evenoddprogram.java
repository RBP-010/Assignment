package assignment;

public class Evenoddprogram {
    public static void main(String[] args) {
        int[] arr ={11,13,14,15,17,18,19,20,22,23};
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("even numbers are:" +arr[i]);
                count+=arr[i];
                System.out.println(count);
            }}
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]%2!=0)
//        {
//            System.out.println("odd numbers are:" +arr[i]);
//        }}
//        int sum = 0;
//        for (int i = 0;i<25;i++){
//            if (i%2==0){
//                System.out.println(i);
//                sum=sum+i;
//            }
//        }
//        System.out.println(sum);
    }
}
