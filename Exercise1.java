import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //Question- Enter 3 numbers(int the form of array) from the user & make a function to print their average.

        // for import - java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        //taking input size of an array
        int Size = sc.nextInt();
        //making a array of name- numbers[] and size = Size 
        int numbers[] = new int[Size];
        for(int i = 0; i < numbers.length; i++){
            // array.length = Size of an array
            //taking input for array from user-
            System.out.println("Enter the "+ i+"th Value of an array");
            numbers[i] =sc.nextInt();

        }
        float sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum = sum + numbers[i];

        }
        float t = (sum)/(numbers.length);
        System.out.println("The aveage of array = "+t);
               
    }
    
}
