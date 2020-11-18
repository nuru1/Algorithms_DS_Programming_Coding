package codeVita2020;

import java.util.Arrays;
import java.util.Scanner;

public class RailwayStatin {

	public static boolean needPlatform(int arr, int dep) {
		return (arr <= dep);
	}
	
	public static boolean Platformdec(int arr, int dep) {
		return (arr > dep);
	}
	
	public static void main(String[] args) {
		
		int platforms=1,r=1;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrival = new int[n];
		int[] departure = new int[n];
		for(int i=0;i<n;i++) {
			arrival[i] = sc.nextInt();
			int t = sc.nextInt();
			departure[i] = arrival[i]+t;
		}
		Arrays.sort(arrival);
		Arrays.sort(departure);
		
		int ArrIndx=1,DepIndx=0;
		
		while(ArrIndx<n && DepIndx<n) {
			if(needPlatform(arrival[ArrIndx] , departure[DepIndx] )) {
				platforms++;
				ArrIndx++;
			}
			else if(Platformdec(arrival[ArrIndx] , departure[DepIndx])){
				platforms--;
				DepIndx++;
			}
		}
		System.out.println(platforms);
		sc.close();
	}
}
