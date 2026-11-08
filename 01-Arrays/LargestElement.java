// class Solution {
//     public int largestElement(int[] nums) {

//         int max = nums[0];

//         for(int i = 1; i < nums.length; i++) {

//             if(nums[i] > max) {
//                 max = nums[i];
//             }
//         }

//         return max;
//     }
// }

import java.util.Scanner;
class LargestElement{
    static int max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr));
    }
}