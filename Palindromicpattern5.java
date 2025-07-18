import java.util.Scanner;

public class Palindromicpattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of row");
        int n = sc.nextInt();
        System.out.println("enter the no. of colloum");
        int m = sc.nextInt();

        //14.Palindromic Pattern -
        // n = 5
        //     1        first half-  1   second half- _
        //    212                   21                2
        //   32123                 321                23
        //  4321234               4321                234
        // 543212345             54321                2345

        for(int i = 1; i<=n; i++){
            // for spaces- 
            for(int j = 1; j<=n-i; j++){
               System.out.print(" ");
            }
            // for values of first half-
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            // for second half-
            for(int j =2; j<=i; j++){
                System.out.print(j);
            }
             System.out.println();

        }
        
    }
    
}
