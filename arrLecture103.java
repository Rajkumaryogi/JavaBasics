import java.util.Scanner;

public class arrLecture103 {
    public static void main(String[] args) {
        //Take an array of numbers as input and check if it is an array sorted in ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // {3, 4, 6, 2} is not sorted in ascending order.
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }


        if(isAscending){
            System.out.println("The array is sorted in ascending order ");
        }else{
            System.out.println("The array is not sorted in ascending order ");
        }

    }
    
}
