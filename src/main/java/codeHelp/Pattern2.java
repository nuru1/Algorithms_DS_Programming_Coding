package codeHelp;

/*
Triangle
*
**
***
****
*/

public class Pattern2 {
    public static void main(String[] args) {
        int i = 0;
        int n = 30;
        while(i<n){
            int j = 0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }    
}
