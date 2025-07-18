import java.util.Scanner;

public class Butterflypattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of row");
        int n = sc.nextInt();
        System.out.println("enter the no. of colloum");
        int m = sc.nextInt();

        //10.Butterfly Pattern-
        // n=4
        //  *      *  upper half- *      *  upper part1 - *    upper spaces- 6=2*(n-i) i=1 upper part2-    *
        //  **    **              **    **                **                 4=2*(n-i) i=2                ** 
        //  ***  ***              ***  ***                ***                2=2*(n-i) i=3               *** 
        //  ********              ********                ****               0=2*(n-i) i=4              ****
        //  ********  lower half- ********  
        //  ***  ***              ***  ***
        //  **    **              **    **
        //  *      *              *      *

        // for upper half-
        for(int i = 1; i <=n; i++){
            // for upper part 1
            for(int j = 1; j<=i; j++){
                System.out.print("*");

            }
            // for upper spaces-
            int t = 2*(n-i);
            for(int j=1; j<=t; j++){
                System.out.print(" ");
            }
            // for upper part 2-
            for(int u = 1; u<=i; u++){
                System.out.print("*");
            }
            System.out.println();

        }
        // for lower half-
        for(int i = n; i>=1; i--){
            // for lower part 1 
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            //for lower spaces- 
            int p = 2*(n-i);
            for(int j = 1; j<= p; j++ ){
                System.out.print(" ");
            }
            // for lower half part 2-
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
