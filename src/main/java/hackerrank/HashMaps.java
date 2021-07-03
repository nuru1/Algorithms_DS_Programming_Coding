package hackerrank;

import java.util.Scanner;
import java.util.*;

public class HashMaps {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hmap.put(name,phone);
        }
        //System.out.println(hmap);
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            //String str = "";//hmap.get(s);
            if( hmap.get(s) != null){
                System.out.println(s+"=" + hmap.get(s));
            }else
                System.out.println("Not found");
        }
        in.close();
    }

}
