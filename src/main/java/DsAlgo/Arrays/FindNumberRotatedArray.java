//Search an element in a sorted and rotated array
class FindNumberRotatedArray { 
   static int findNumber(int array[], int start, int end, int value) 
    { 
        
        System.out.println("start:"+start+" end:"+end+" value:"+value);
        if(start > end)
            return -1;
        //System.out.println("2 : start:"+array[start]+" end:"+array[end]+" value:"+value);
        
        int mid = (start + end)/2;
        
        if(array[mid] == value)
            return mid;
            
        if(array[mid] > array[start]){
            
            if(value >= array[start] && value <= array[end])
                return findNumber(array, start, mid-1, value);
            return findNumber(array, mid+1, end, value);
        } 
        
        if(value >= array[mid] && value <= array[end]){
            return findNumber(array, mid+1, end, value);
        }
            
        return findNumber(array, start, mid-1, value); 
    
    } 
  
    public static void main(String args[]) 
    { 
        int array[] = {3, 4, 5, 6, 7, 8, 9, 10, 1, 2}; 
        int n = array.length; 
        int value = 10; 
        int i = findNumber(array, 0, n-1, value); 
        if (i != -1) 
            System.out.println("Index: " + i); 
        else
            System.out.println("Value not found"); 
    } 
} 

/* Try more Inputs
case 1: 
actual = findNumber([3, 4, 5, 6, 7, 8, 9, 10, 1, 2],0,9,1)
expected = 8

case2: 
 actual = findNumber([5, 6, 7, 8, 9, 10, 1, 2, 3],0,8,3)
 expected = 8
 
case3: 
actual = findNumber([5, 6, 7, 8, 9, 10, 1, 2, 3],0,8,28)
expected = -1

case4:
actual = findNumber([30, 40, 50, 10, 20],0,4,10)
expected = 3

*/
