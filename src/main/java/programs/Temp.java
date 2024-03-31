package programs;

public class Temp {
    public static void main(String[] args) {
        int n = 1999999999;
        int n1 = 0;
        while (n != 0) {
            System.out.println(n%10);
            n1 = (n1*10) + n%10;
            n = n/10;
            System.out.println(n1);
        }
        System.out.println(n1);
        System.out.println(999999999*10);
        
    }
}
