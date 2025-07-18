import java.util.Scanner;

public class SBinL134 {
    public static void main(String[] args) {
        // Taking multiple values of strings from user or in a StringBuilder-

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder("");
        // System.out.println(str);
        for(int i = 0; i<str.length()-1; i++){
            str = sc.next();
            sb.append(" "+str);
        }
        System.out.println(sb);
    }
    
}
