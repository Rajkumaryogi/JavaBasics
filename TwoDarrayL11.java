import java.util.Scanner;

public class TwoDarrayL11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numbers = new int[n][m];

        // Input
        //For rows-
        for(int i = 0; i<n; i++){
            //For Columns-
            for(int j = 0; j<m; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // // Two print 2D array - 
        // for(int i = 0; i<n; i++){
        //     for(int j =0 ; j<m; j++){
        //         System.out.print (numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Search for a given number x and print place indices at which occurs-

        int x = sc.nextInt();

        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m; j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at place (" + i + "," + j + ")");
                }
            }
        }
    }
    
    
}
