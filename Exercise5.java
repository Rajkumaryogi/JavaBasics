import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Person is eligible for vote");
        }else{
            System.out.println("Person is not eligible for vote");
        }
    }
    
}
