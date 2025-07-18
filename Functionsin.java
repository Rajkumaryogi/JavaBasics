import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class Functionsin {

    //   // 1. Print a given name in a function
    //   public static void printMyName(String name){ // camelCase- functionName
    //     System.out.println(name);
    //     return;  
    //    }
     
    //    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name); // call kiya function ko     
    //     }
    
 // 2. Make a function to add 2 numbers and return a Sum. 
        // public static int calculateSum(int a, int b){
        //     return a + b ;
        // }
 
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter the value of a :");
        //     int a = sc.nextInt();
        //     System.out.println("Enter the value of b :");
        //     int b = sc.nextInt();
        //     System.out.println("Sum of a and b is : "+ calculateSum(a, b));  
        //  }

 // 3. Make a function to multiply 2 numbers and return the product-
          
            //  public static float product(float a, float b){ // function
            //     return a*b;
            //  }
            //  public static void main(String[] args) {
            //     Scanner sc = new Scanner(System.in);
            //     System.out.println("Enter the value of a :");
            //     float a = sc.nextFloat();
            //     System.out.println("Enter the value of b :");
            //     float b = sc.nextFloat();
                
            //     System.out.println("product of a and b is : "+product(a, b));
            //  }     

 // 4. Find the factorial of a number - 
            public static void printfactorial(int n){
                int Factorial = 1;
                for(int i = n; i>0; i--){
                    if(n<0){
                        System.out.println("Invalid Number");
                        return ;
                    }else{
                        Factorial = Factorial*i;
                    }
                }
                System.out.println(Factorial);
                return;
              }      
 
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                printfactorial(n); 
 
            }    
 



}
