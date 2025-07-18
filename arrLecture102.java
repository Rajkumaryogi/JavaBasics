import java.util.Scanner;
import java.util.Arrays;
// import java.util.

public class arrLecture102 {
    public static void main(String[] args) {
        // Find the maximum & minimum number in an array of integers.
        // [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        // int number[]= {1,2,3,4,5};
        // input
        for(int i = 0; i<number.length; i++){
            number[i]= sc.nextInt();
        }

        // int maximum = Integer.MAX_VALUE;
        // int minimum = Integer.MIN_VALUE;

        int maximum = number[0];
        int minimum = number[0];
        for(int i = 0; i<number.length; i++){
            if(number[i]< minimum){
               minimum= number[i];
            }

            if(number[i]>maximum){
               maximum= number[i];
            }
        }
        System.out.println("The minimum value of array number is = "+ minimum);
        System.out.println("The maximum value of array number is = "+ maximum);

    }  

}
