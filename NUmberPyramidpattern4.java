import java.net.NetPermission;
import java.util.Scanner;

public class NUmberPyramidpattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of no. of rows");
        int n = sc.nextInt();
        System.out.println("Enter the value of no. of colloum");
        int m = sc.nextInt();

        //13.NUmber Pyramid pattern -
        // printpattern- ____1
        //               ___2_2
        //               __3_3_3
        //               _4_4_4_4
        //               5_5_5_5_5

        for(int i = 1; i<=n; i++){
            // for spaces- 
            for(int j = 1; j<=n-i; j++){
               System.out.print("-");
            } 
            for(int j = 1; j<=i; j++){
                System.out.print(i+"-");
                
            }
                    System.out.println();
        }
    }
}
