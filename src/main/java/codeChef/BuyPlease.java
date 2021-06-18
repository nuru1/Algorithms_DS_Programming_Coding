package codeChef;

import java.util.Scanner;

public class BuyPlease {

	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(a*b + x*y);
	}

}
