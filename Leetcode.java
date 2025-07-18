class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
// import java.util.Scanner;

// public class Leetcode {
//     public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int size = sc.nextInt();
//             int[] nums = new int[size];
//             int target = sc.nextInt();
//             for(int i = 0; i < nums.length; i++){
//                 nums[i] = sc.nextInt();
//             }
//             for(int i = 0; i < nums.length; i++){

//             if(target == (nums[i] + nums[i+1])){
//                 System.out.println("["+i+","+ (i+1)+ "]");
            
//                 }
          
//             }
//     }
// }
    
    

