import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Write a function that takes in the radius as input and returns the circumference of a circle.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // Circumference of a circle = 2*pie*radius
        System.out.println("Circumference of a circle = 2*pie*radius = " + 2*3.14*r);
    }
    
}
