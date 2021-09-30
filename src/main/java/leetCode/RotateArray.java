package leetCode;
import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
public class RotateArray {
    public void reverse(int[] nums, int start, int end){
        while(start < end) {
             int tmp = nums[start];
             nums[start++] = nums[end];
             nums[end--] = tmp;
         }
     }
     
     public void rotate(int[] nums, int k) {
         int n = nums.length;
         k=k%n;
         System.out.println(k+" "+n);
         if(k==n)
             return;
         reverse(nums, 0, n - k - 1);
         reverse(nums, n - k, n - 1);
         reverse(nums, 0, n - 1);
         System.out.println(Arrays.toString(nums));
     }
}
