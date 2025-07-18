import java.util.Scanner;
public class elseifin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a  = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        // if(a==b){
        //     System.out.println("a is equal to b");
        // }else{
        //     if(a>b){
        //         System.out.println("a is greater then b");
        //     }else{
        //         System.out.println("a is less then b");
        //     }
        // }

        if(a==b){
            System.out.println("a is equal to b");
        }else if(a>b){
            System.out.println("a is greater then b");
            // else if can use to many times
        }else{
            System.out.println("a is less then b");
        }
    }
    
}
