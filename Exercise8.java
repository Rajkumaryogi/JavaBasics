import java.util.Scanner;

public class Exercise8 {
    public static float power( int x, int n){
        float sum = 1;
        for(int i = 0; i<n ; i++){
            sum = sum*x;

        }
        return sum; 
        
    }
    public static void main(String[] args) {
        //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        // int t = 1;
        // for(int i = 1; i<= n; i++){
        //     t = t*x;
        // }
        // System.out.println(t);
        System.out.println(power(x, n));

     
    }
    
}
