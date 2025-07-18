import java.util.Scanner;

public class SBinL132 {
    public static void main(String[] args) { // Solve with StringBuilder
        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        // Example : 
        // orginal = "Rajkumar Yoge" ; result = "Rajkumar Yogi"
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        StringBuilder sb = new StringBuilder("");

        for(int i= 0; i<size; i++ ){ // Ex. size = 4
            array[i] = sc.nextLine(); //for next()-> space not count and 4 values taken -> if nextLine()-> then space count and 3 values taken
            sb.append(array[i]);

        }
        System.out.println(sb);

        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i)== 'e'){
                sb.setCharAt(i, 'i'); // Replacing ith character by i 

            }
        }
        System.out.println(sb);
   
    }
        

    
    
}
