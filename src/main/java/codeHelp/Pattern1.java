package codeHelp;

/*
1 2 3 
4 5 6
7 8 9
*/

public class Pattern1 {

    public static void main(String[] args) {
        
        int count = 1, i = 1;
        int n = 3;
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print(count+" ");
                count++; 
                j++;
            }
            System.out.println();
            i++;
        }

    }
    
}
