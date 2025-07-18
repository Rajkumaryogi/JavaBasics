import java.util.Scanner;

public class SolidRohmbuspattern2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of row");
    int n = sc.nextInt();
    System.out.println("Enter the no. of stars in a row");
    int m = sc.nextInt();

    //11.Solid Rohmbus pattern-
    // n = 5, m = 5
    // printpattern-     ***** space=(n-i) i=1
    //                  *****        (n-i) i=2
    //                *****          (n-i) i=3
    //               *****           (n-i) i=4
    //              *****            (n-i) i=5

    for(int i = 1; i<=n; i++){
        // for spaces- 
        int t = n-i;
        for(int j = 1; j<=t; j++){
        System.out.print(" ");
        }
        // for stars-
        for(int j = 1; j<=m; j++){
            System.out.print("*");
        }
        System.out.println();

    }

}
    
}
