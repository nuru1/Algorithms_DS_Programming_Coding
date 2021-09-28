package programs;

import java.util.Scanner;

public class DaimandCharacters {

    static Scanner sc;
    public static void main(String[] args) {
         sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        for (i = 0; i < n; i++){
	        print();
        }
    }

    private static void print() {
        int i, j, r, n, t, t1, k, l, m;

        n = sc.nextInt();
        sc.nextLine();
        String myStr = sc.nextLine();
        r = ((n - 1) * 4) + 3;
        char[] chars = myStr.toCharArray();
    
        for (j = 0; j <= (n * 2) - 2; j++)
          System.out.print(" ");
        System.out.print(chars[0] + "\n");
        for (j = 0; j <= (n * 2) - 3; j++)
            System.out.print(" ");
        System.out.print(chars[0] + " " + chars[0] + "\n");
    
        for (i = 3; i <= (n * 2); i++){
            for (j = 0; j <= (n * 2) - i - 1; j++)
            System.out.print(" ");
            if (i % 2 == 0){
                t = i / 2;
                t1 = i / 2;
            }else{
                t = (i / 2) + 1;
                t1 = i / 2;
          }
            for (j = 0; j < t; j++)
                System.out.print(chars[j] + " ");
            for (j = t1 - 1; j >= 0; j--)
                System.out.print(chars[j] + " ");
                System.out.print("\n");
          }
    
        for (i = (n * 2) + 1, k = 0,m=0; i <= r - 2; i++)
          {
            for (j = (n * 2) + 1; j <= i; j++)
                System.out.print(" ");
            for (j = 0; j < n - k; j++)
                System.out.print(chars[j] + " ");
            for (l = n - m - 2; l >= 0; l--)
                System.out.print(chars[l] + " ");
            if ((r - i) % 2 == 0){
                k++;
            }if ((r - i) % 2 != 0){
                m++;
            }
            System.out.print("\n");
          }
    
    
        if (n > 1){
            for (j = 0; j <= (n * 2) - 3; j++)
            System.out.print(" ");
            System.out.print(chars[0] + " " + chars[0] + "\n");
        }
        for (j = 0; j <= (n * 2) - 2; j++)
        System.out.print(" ");
        System.out.print(chars[0] + "\n");
    
    /*
        for (i = r - 1; i >= 1; i--)
          {
        for (j = 1; j <= r - i; j++)
          System.out.print(" ");
        for (j = 1; j <= 2 * i - 1; j++)
          System.out.print("2");
        System.out.print("\n");
          }*/
    }
}
