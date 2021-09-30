package leetCode;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
public class BestTimeToSell {
    public int maxProfit(int[] a) {
        int n=a.length;
        int i=0,j=0,buy=0,sell=0,sum=0;
        
        while(i<=j && j<=n-1 && i<n-1){
            System.out.println("i="+i+" j="+j+" buy="+buy+" sell="+sell+" sum="+sum+" n="+n);
            
            while(i<n-1 && a[i]>a[i+1])
               i++;
            System.out.println("i="+i);
            buy = a[i];
            j=i++;
            while(j<n-1 && a[j]<a[j+1])
                j++;
            System.out.println("j="+j);
            sell=a[j];
            if(sell>buy)
                sum+=sell-buy;
            i=++j;
        }
        return sum;
    }
}
