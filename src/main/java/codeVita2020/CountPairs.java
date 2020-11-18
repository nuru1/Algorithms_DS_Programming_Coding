package codeVita2020;

import java.util.Arrays;
import java.util.Scanner;

public class CountPairs {

	private static int n = 0;
	private static int k = 0, count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();
		int[] abr = new int[n];
		for (int i = 0; i < n; i++) {
			abr[i] = sc.nextInt();
		}
		Arrays.sort(abr);
		for (int indx = 0; indx < n; indx++) {
			for (int indx0 = indx + 1, indx1 = indx - 1; indx0 < n || indx1 >= 0; indx0++, indx1--) {

				if (indx0 < n && Math.abs(abr[indx0] - abr[indx]) > k) {
					if (indx1 >= 0 && Math.abs(abr[indx] - abr[indx1]) > k) {
						break;
					}
				}

				if (indx0 < n && abr[indx] != abr[indx0] && Math.abs(abr[indx] - abr[indx0]) <= k) {
					count++;
					break;
				}
				if (indx1 >= 0 && abr[indx] != abr[indx1] && Math.abs(abr[indx] - abr[indx1]) <= k) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();

	}
}
