import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //Write an infinite loop using do while condition.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =0;
        
        do {
            System.out.print(k+" ");
            // k++;
            //whhen the condition for k is not define the the loop is executing infinite times
            
        } while (k<n);
    }
    
}
