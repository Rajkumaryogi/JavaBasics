import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Loops in java - for,while,do-while.
        // print form 0 to 10 no.

        // For loop
        System.out.println("from for loop\n");
         
        for(int i = 0; i < 11; i++){
            System.out.print(i+" "); // i+" " this is for creating space

        }
        // While loop
        System.out.println("\n from while loop\n");

        int j=0;
        while(j<11){
            System.out.print(j+" ");
            j++ ;
        }

        // do- while loop
        System.out.println("\nfrom do-while loop\n");
        
        int k = 0;
        do{
          System.out.print(k+" "); // run minimum one time
          k++;

        }while(k<11);

        // checking of minimum one time run of do while loop

        int l = 5;
        do{
            System.out.println("\nfirst run then check condition\n");
            l++;
        }while(l<4);

        // sum of n numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        for(int m = 1; m <= n; m++){
            sum = sum + m ;
        }

        System.out.println("the value of sum of first n natural no.");
        System.out.println(sum);

        // table of t

        // Scanner sc = new Scanner(System.in);
        System.out.println("enter the Value of t.");
        int t = sc.nextInt();
        int p= 1;
        while(p <=10){
            System.out.println(t*p);
            p++;
        }

        
    }
    
}
