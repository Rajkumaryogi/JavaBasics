import java.util.Scanner;

public class TwoDarrayL112 {
    public static void main(String[] args) {
        // For a given matrix of N x M, print its transpose.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        // Input-
        // For rows- 
        for(int i = 0; i<n; i++){
            // For columns-
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output-
        for(int j = 0; j<m; j++){
            for(int i = 0; i<n; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         if(i==j){
        //             System.out.print(arr[i][j]+ " ");
        //         }else if(i<j || i>j){
        //             System.out.print(arr[j][i]+ " ");
        //         }
        //         // else if(i>j){
        //         //     System.out.print(arr[j][i]+ " ");
        //         // }
                
        //     }
        //     System.out.println();
        // }



    }
    
}
