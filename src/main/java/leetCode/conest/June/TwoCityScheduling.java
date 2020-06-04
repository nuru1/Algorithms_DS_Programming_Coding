package leetCode.conest.June;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

	public static void main(String[] args) {
		int[][] in = new int[][]{{10,20},{30,200},{400,50},{30,20}};
		int res = twoCitySchedCost(in);
		System.out.println(" Minimin cost "+res);
	}
	
	 public static int twoCitySchedCost(int[][] costs) {
	        int res = 0;
	        Comparator<int[]> cmp = (a, b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]);
	        Arrays.sort(costs, cmp);
	        
	        int len = costs.length;
	        int a=0,b=0,n=len/2;
	        for(int i=0;i<len;i++){
	            if((costs[i][0]<costs[i][1] && a<n) || b==n) {
	                a++;
	                res+= costs[i][0];
	            }
	            else{
	                b++;
	                res+= costs[i][1];
	            }
	        }
	        
	        return res;
	    }

}
