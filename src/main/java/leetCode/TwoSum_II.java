package leetCode;

public class TwoSum_II {
        public int[] twoSum(int[] numbers, int sum) {
            int[] output = new int[2];
            int i=0, j=numbers.length-1;
            while(i!=j && i<j){
                if((numbers[i]+numbers[j])>sum)
                    j--;
                else if((numbers[i]+numbers[j])<sum)
                    i++;
                else if((numbers[i]+numbers[j])==sum){
                    output[0] = i+1;
                    output[1] = j+1;
                    return output;
                }
                    
            }
            
            return output;
        }
    
}
