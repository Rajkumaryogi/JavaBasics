import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class SBinL133 {
    public static void main(String[] args) {
        
        //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user .
        // Example : 
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // int size = sc.nextInt();
        // String arraay[] = new String[size];
    
        StringBuilder sb = new StringBuilder(str);
        // for(int i = 0; i<size ; i++){
        //     arraay[i] = sc.next();
        //     sb.append(arraay[i]);

        // }
        System.out.println(sb);

        StringBuilder st = new StringBuilder("");
        for(int i= 0; i<sb.length(); i++){
            if(sb.charAt(i)=='@'){
                break;
                
            }
            st.append(sb.charAt(i));

        }
        System.out.println(st);

    }
    
}
