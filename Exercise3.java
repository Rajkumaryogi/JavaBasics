import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // //Write a function which takes in 2 numbers and returns the greater of those two.

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>b){
        //     System.out.println(a);
        // }else if(b>a){
        //     System.out.println(b);
        // }
        
        //Write a function which takes in n numbers and returns the greater of those.
        // by the using of array

        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        int max = arr[0];
        for(int i = 0; i <arr.length; i++ ){
            System.out.println("Enter the value of "+ i +"th arr");
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i <arr.length; i++){
            if(arr[i]>max ){
                max = arr[i];
            }
        }
        System.out.println("The maximum value is = "+ max);
        

    }
    
}
