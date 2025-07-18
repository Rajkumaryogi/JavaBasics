import java.util.*;
public class Inputin {
    public static void main(String[] args) {
        // Inputs in java
       // sc.nextInt(),sc.next(),sc.nextline(), sc.nextDouble,sc,nextFloat,sc.nextLong
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name :");
        //Input as a name-
        String name = sc.nextLine();
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c = a + b ;
         System.out.println("sum = "+ c);
         
         System.out.println(name);

    }

    
}
