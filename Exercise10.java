import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
       // 10. Write a program to print Fibonacci series of n terms where n is input by user :0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.(BONUS).
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no. of terms in Fibonacci series ");
       int n = sc.nextInt();

       int a = 0 , b = 1;
       System.out.print(a + " ");

       for(int i = 1; i<n; i++ ){
        System.out.print(b+ " ");
        // Swaping of b into a
          int t = b ;
         b = a + b;
         a = t;
         // System.out.print(t+ " ");
       }
       System.out.println();

    }
    
}
