import java.util.Scanner;

public class Arraysin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int[] marks = new int[n]; // n = Size of array marks = marks.length
    //    int marks[] = {85,34,6} // Size of array marks is auto difine  
        int marks[]= new int[n];
        for(int i = 0; i<marks.length; i++){
            // Take input values in array marks-
            marks[i] = sc.nextInt();

        }
        // for(int i = 0; i<marks.length; i++){
        //     // print the values of array marks-
        //     System.out.println(marks[i]);
        // }

    // Question- Take an array input from the user and search for a given no. x and print index at which it occurs     
        int x = sc.nextInt();
        // this technique is called {Linear search} -
        for(int i = 0; i<marks.length; i++){
            if(marks[i] == x){
                System.out.println("x is found at index " + i);
            } 
        }
    }
    
}
