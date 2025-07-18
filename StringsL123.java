import java.util.Scanner;

public class StringsL123 {
    public static void main(String[] args) {
        //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user .
        // Example : 
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email adderess :");
        String str = sc.nextLine();
        String userName = "";
        // By me -

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '@'){ // only for those strings they having - '@' ; 
                for(int j = 0; j<i; j++){
                    userName += str.charAt(j); 
                }
            }
        }
         System.out.println("username :"+ userName); 

        //  From answers-
        // for(int i = 0; i<str.length(); i++){
        //     if(str.charAt(i)=='@'){
        //         break;
        //     }else{
        //         userName += str.charAt(i);
        //     }
        // }
        // System.out.println("username : " + userName);
    }
}