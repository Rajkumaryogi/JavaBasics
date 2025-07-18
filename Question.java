import java.util.Scanner;
import java.util.*;

public class Question {

    // public static int calculateSum(int a , int b){

    //     int sum = a +b;
    //     return sum;
    // }
    public static int product(int a , int b){
        return a*b;

    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    // int Total = calculateSum(a, b);
    System.out.println(product(a, b));
             
    }
}
