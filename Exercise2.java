import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
            
        // sum of first n odd natural numbers form 1 to n- Ex. n= 3 , sum = 1+3 = 4
        for(int i = 1; i<=n; i++ ){
            if(i%2==1){
                sum = sum +i;
            }
        }
        System.out.println(sum);

        // for first n odd numbers sum - Ex. n=3, sum = 1+3+5 = 9
        // for(int i = 1; i<=n; i++ ){
            //  sum = sum + (2*i-1) ;
            
            // }
            // System.out.println(sum);
        
        
    }
    
}
