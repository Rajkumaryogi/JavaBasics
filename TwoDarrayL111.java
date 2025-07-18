import java.util.Scanner;

public class TwoDarrayL111 {
    public static void main(String[] args) {
        // Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]
        
        //  1   2   3   4
        //  12  13  14  5
        //  11  16  15  6
        //  10  9   8   7

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        // Input 
        // For rows-
        for(int i = 0; i<n; i++){
            // For columns-
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Spiral order matrix is : ");
        // Output-
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        // To print spiral order matrix-
        while(rowStart <= rowEnd && colStart <= colEnd){
            // 1
            for(int col  = colStart; col <= colEnd; col++){
                // For first row = (0,t)
                System.out.print(arr[rowStart][col] + " ");
            }
            System.out.println();
            rowStart++; // Now rowStart = 1 -> for Second row = (1,t)

            // 2
            for(int row = rowStart; row <= rowEnd; row++){
                // for last column = (t,m-1) becouse colEnd is constant in print
                System.out.print(arr[row][colEnd] +" ");
            }
            System.out.println();
            colEnd--; // Now colEnd = m-2 for second last column-

            // 3
            for(int col = colEnd; col>=colStart; col--){
                // for last row -
                System.out.print(arr[rowEnd][col] + " ");
            }
            rowEnd--; // Now rowEnd = n-2 for second last row-

            // 4
            for(int row = rowEnd; row>=rowStart; row--){
                // for first column- 
                System.out.print(arr[row][colStart]);
            }
            colStart++; // Now colStart = 1 for second column-

            System.out.println();

        }

    }
    
}
