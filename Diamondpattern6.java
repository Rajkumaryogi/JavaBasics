import java.util.Scanner;

public class Diamondpattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of row");
        int n = sc.nextInt();
        System.out.println("enter the no. of colloum");
        int m = sc.nextInt();

        //15.Diamond pattern -
        // n = 4
        // upper half-     *
        //                ***
        //               *****
        //              *******
        // lower half-  *******
        //               *****
        //                ***
        //                 *



        for(int i = 1; i<=n; i++){
            // for spaces- 
            for(int j = 1; j<=n-i; j++){
               System.out.print(" ");
            }
            // for upper half -
            for(int j = 1; j<=2*i-1; j++){
                
                System.out.print("*");
            }
             System.out.println();
             
        }
        // for lower half-
        for(int i = n; i>=1; i--){
            // for lower spaces- 
            for(int j = 1; j<=n-i; j++){
               System.out.print(" ");
            }
            // for lower half -
            for(int j = 1; j<=2*i-1; j++){
                
                System.out.print("*");
            }
             System.out.println();
             
        }

    }
    
}
