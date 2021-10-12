package leetCode;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {

        public int singleNumber(int[] nums) {
            int res=0;
            for(int i=0;i<nums.length;i++){
               res = res^nums[i];
            }  
            
            return res;
        }
    
}
