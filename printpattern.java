import java.util.Scanner;

public class printpattern {
    public static void main(String[] args) {
        // System.out.print("*\n**\n***\n****\n");
        // \n - for a new line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row");
        int n = sc.nextInt();
        System.out.println("Enter the no of colloum");
        int m = sc.nextInt();
        //1.Solid Rectangle-
        //1.printpattern- * * * * * 4- row
        //                * * * * * 5- colloum
        //                * * * * *
        //                * * * * * 

                // Neested loops-
            //   for(int i = 1; i <= n; i++){
            //     for(int j = 1 ; j<=m; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            //   }

        // 2. Hollow Rectangle -   
        //2.printpattern- * * * * * 4- row
        //                *       * 5- colloum
        //                *       *
        //                * * * * * 
    
            //     for(int i = 1; i <= n; i++){
            //         for(int j = 1 ; j<=m; j++){
            //             if(i == 1 || j == 1 || i == n || j == m){
            //                      System.out.print("*");
            //             }else{
            //                 System.out.print(" ");
            //              }
            //         }
            //         System.out.println();
            //      }

        //3.Half Pyramid-    
        //3.printpattern- *         4- row
        //                * *       4- colloum
        //                * * *
        //                * * * * 

            //     for(int i = 1; i <= n; i++){
            //         for(int j = 1 ; j<=i; j++){
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }

            // Method 2 for pattern no.3

            // for(int i = 1; i<=4; i++){
            //     for(int j= 1; j<=5; j++){
            //         if(i>=j){
            //           System.out.print("*");
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println( );
            // }

        //4.Inverted Half Pyramid- 
        //4.printpattern-  * * * * 
        //                 * * *
        //                 * *       4- colloum
        //                 *         4- row

            //     for(int i = n; i >=1 ; i--){
            //         for(int j = 1 ; j<=i; j++){
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }

            // Method 2 for pattern no.4

            // for(int i = 1; i<=4; i++){
            //     for(int j= 4; j>=1; j--){
            //         if(i<=j){
            //           System.out.print("*");
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println( );
            // }

        //5.Inverted Half Pyramid- (rotated by 180 deg.)
        //5.printpattern-        *         4- row
        //                     * *       4- colloum
        //                   * * *
        //                 * * * * 
     
            // for(int i = 1; i <= n; i++){
            //         // first loop for print space
            //     for(int j=1; j <= (n-i); j++){
            //         System.out.print(" ");

            //     }
            //         // second loop for print *
            //     for(int j = 1 ; j<=i; j++){
            //        System.out.print("*");    
            //     }
            //     System.out.println();

            // Method 2 for printpattern no.5

            // for(int i = 1; i<=4; i++){
            //     for(int j= 4; j>=1; j--){
            //         if(i<=j){
            //           System.out.print("*");
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println( );
            // }


            // }

        //6.Half Pyramid with numbers-    
        //6.printpattern- 1           5- row 
        //                1 2         5- colloum
        //                1 2 3
        //                1 2 3 4
        //                1 2 3 4 5 
        
            // for(int i = 1; i<=n; i ++){
            //     for(int j = 1; j <=i; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

        //7.Inverted Half Pyramid with numbers-
        //7.printpattern- 1 2 3 4 5 
        //                1 2 3 4
        //                1 2 3
        //                1 2         5- colloum
        //                1           5- row 

            //   for(int i = 5; i >=1; i--){
            //     for(int j = 1 ; j <= i ; j++){
            //         System.out.print(j);
            //     } 
            //     System.out.println();
            //   }
        
         //8.Floyd's Triangle  - 
        // 8.printpattern-    1              5- row
                        //    2  3           5- colloum
                        //    4  5  6
                        //    7  8  9  10
                        //    11 12 13 14 15   

            
            //     int num = 1;
            // for(int i = 1; i <= n ; i++){
                
            //     for( int j = 1; j<=i; j++){
 
            //         System.out.print(num);
                    // num++; // num++ = num + 1 
            //     }
            //     System.out.println();
            // }  


            // Method 2 for printpattern no.8

            //  int num = 1;
        // for(int i = 1; i<=5; i++){
        //     for(int j= 1; j<=5; j++){
        //         if(i>=j){
        //           System.out.print(num++);
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println( );
        // }


            
        // 0-1 Triangle-    
        //9.printpattern-     1
                        //    0 1          5- row   
                        //    1 0 1        5- colloum
                        //    0 1 0 1
                        //    1 0 1 0 1

            // for(int i = 1; i<=n; i++){
            //     for(int j = 1; j<=i; j++){
            //         int sum = j + i ; 
            //         if(sum%2 == 0 ){ // even
            //             System.out.print("1");
            //         }else{ // odd
            //             System.out.print("0");
            //         }
            //     }
            //     System.out.println();
            // }

            int num = 1;
            for(int i = 1; i <= n ; i++){
                for( int j = 1; j<=i; j++){
                     int t = num++;
                    if(t%2==1){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }  
            
    
         
    }
    
}
