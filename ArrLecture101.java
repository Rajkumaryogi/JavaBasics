import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.Arrays;

public class ArrLecture101 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();  
            String names[]= new String[n];
            for(int i = 0; i<names.length; i++){
                // Take input values in array marks-
                names[i] = sc.next();
            }
            for(int i = 0; i<names.length; i++){
                System.out.println(Arrays.asList("Name "+(i+1)+" is "+ names[i]));

            }
    }
    
}
