// Maximum Value in an array of Increasing and Decreasing using Binary Search
class FindMaxArray 
{    
    static int findMaximum(int array[], int start, int end) 
    { 
        //Practise Yourself : Write your code Here 
        if(start == end)
            return array[start];
        if(start+1 == end){
            if(array[start] > array[end])
                return array[start];
            return array[end];
        }
        
        int mid = (start + end)/2;
        //System.out.println("start:"+start+" end:"+end+" mid:"+mid);
        
        if(array[mid-1] < array[mid] && array[mid+1] > array[mid]){
            return findMaximum(array, mid+1, end);
        }else if (array[mid-1] > array[mid] && array[mid+1] < array[mid]){
            return findMaximum(array, start, mid-1);
        }else if (array[mid-1] < array[mid] && array[mid+1] < array[mid]){
            return array[mid];
        } 
        return 0;
    } 
      
   
    public static void main (String[] args)  
    { 
        int array[] = {120, 100, 80, 20, 0}; 
        int n = array.length; 
        System.out.println("The maximum Value "+  findMaximum(array, 0, n-1)); 
    } 
} 


/* Try more Inputs
case 1: 
actual = findMaximum([8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1],0,10)
expected = 500

case2: 
 actual = findMaximum([10, 20, 30, 40, 50],0,4)
 expected = 50
 
case3: 
actual = findMaximum([120, 100, 80, 20, 0],0,4)
expected = 120
*/
