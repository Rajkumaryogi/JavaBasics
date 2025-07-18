import java.util.Scanner;

public class HollowRohmbuspattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n = sc.nextInt();
        System.out.println("Enter the no. of coloum");
        int m = sc.nextInt();

        //12.Hollow Rohmbus pattern-
        // n = 5
        // printpattern-     ***** spaces patern _ _ _ _ stars pattern - *****
        //                  *   *                _ _ _                   *   *
        //                 *   *                 _ _                     *   *
        //                *   *                  _                       *   *
        //               *****                                           *****

        for(int i = 1; i<=n; i++){
            // for spaces- 
            for(int j = 1; j<=n-i; j++){
            System.out.print("_ ");
            }
            // for stars-
            for(int j = 1; j<=m; j++){
                if(i==1 || i==5 || j==1 || j ==5){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
    
        }

    }
    
}
