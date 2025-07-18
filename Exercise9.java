import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while(n1 != n2){
            if( n1 > n2){
                n1 = n1 - n2 ;
            }else{
                n2 = n2 - n1;
            }
        }
        // Explination - n1=5, n2=7, in first while loop n2=7-5=2, then for second while loop n1=5-2=3, for third while loop n1=3-2=1 , then fourth while loop n2=2-1=1, and at last n1=n2 , then print n2 = 1 .
        // if n1 = n2 then directly print n2.
        System.out.println("GCD  is = " + n2);
        

    }
    
}
