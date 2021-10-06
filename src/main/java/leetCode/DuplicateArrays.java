package leetCode;

public class DuplicateArrays {
    public boolean containsDuplicate(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        if(nums.length <=0 )
            return false;
        for(int n: nums){
            if(n>max) max = n;
            if(n<min) min = n;
        }
        
        boolean[] visited = new boolean[max-min+1];
        for(int num: nums){
            if(visited[max-num]) return true;
            visited[max-num] = true;
        }
        return false;
    }
}
