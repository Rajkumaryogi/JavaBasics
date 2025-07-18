import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of entries that you want to enter = ");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the value for arr no.= "+i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i< arr.length ; i++ ){
                if(arr[i] > 0){
                    sum = sum + 1 ;
                }else if(arr[i] < 0){
                    sum1 = sum1 + 1 ;
                }else if(arr[i] == 0){
                    sum2 = sum2 + 1 ;
                }

        }
        System.out.println("No. of positive numbers entered = "+ sum);
        System.out.println("No. of negetive numbers entered = "+ sum1);
        System.out.println("No. of Zeros entered = "+ sum2);
    }
    
}
