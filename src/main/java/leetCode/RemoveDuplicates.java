package leetCode;

//Remove Duplicates from Sorted Array
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k=0,i=0,j=0;
        //Arrays.sort(nums);
        while(i<=j && j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else if(nums[i]!=nums[j] && nums[i]==nums[j-1]){
                nums[i+1]=nums[j];
                i++;
                //k=i+1;
            }
            //System.out.println("i="+i+" j="+j+" k="+k+" "+Arrays.toString(nums));
        }
        
        return i+1;
    }
}
