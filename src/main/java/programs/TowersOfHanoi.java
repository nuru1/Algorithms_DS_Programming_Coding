package programs;

public class TowersOfHanoi {
    public static void main(String[] args) {
        int n = 2;
        TowerOfHanoi(n, 'A', 'B', 'C');
    }

    static void TowerOfHanoi(int n, char source, char destination, char helper){
        if(n<=0){
            return;
        }
        TowerOfHanoi(n-1, source, helper, destination);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        TowerOfHanoi(n-1, helper, destination, source);
    }
}
