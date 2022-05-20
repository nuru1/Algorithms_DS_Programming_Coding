//Segregation logic to Sort an array of 0's, 1's and 2's 
import java.util.Arrays;

public class Sort012 {
    
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    
    public static void Sort012(int[] array, int end) {
        int low = 0, mid = 0, high = end;
        while(mid <= high){
            if(array[mid] == 0){
                swap(array, low, mid);
                low++;
            }else if(array[mid] == 2){
                swap(array, high, mid);
                high--;
            }else
                mid++;
        } 
    }

  public static void main(String[] args) {
    int[] array = { 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

    Sort012(array, array.length - 1);
    System.out.println(Arrays.toString(array));
  }
}


/* Try more Inputs
case 1: 
actual = Sort012([0, 1, 2, 0, 1, 2],5)
expected = [0, 0, 1, 1, 2, 2]

case2: 
 actual = Sort012([0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1],11)
 expected = [0,0,0,0,0,1,1,1,1,1,2,2]
 
case3: 
actual = Sort012([2,0,1}],3)
expected = [0,1,2]
*/
