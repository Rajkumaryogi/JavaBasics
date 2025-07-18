
import java.util.Scanner;

public class Switchin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of button");
            int button = sc.nextInt();
            // if(button==1){
            //     System.out.println("Hello");
            // }else if(button==2){
            //     System.out.println("Namaste");
            // }else if(button==3){
            //     System.out.println("bonjour");
                
            // }else{
            //     System.out.println("Invalid Button");
            // }
            
            switch(button){

                case 1 : System.out.println("hello");
                break;
                case 2 : System.out.println("Namaste");
                break;
                case 3 : System.out.println("bonjour");
                break ;
                default : System.out.println("Invalid button");
            }
        }

    }

    
}
