package leetCode.conest.June;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'H','e','l','l','o'};
		
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}

	public static void reverseString(char[] s) {
		if (s.length <= 0)
			return;
		char temp;
		int n = s.length - 1;
		for (int i = 0; i <= n / 2; i++) {
			temp = s[i];
			s[i] = s[n - i];
			s[n - i] = temp;
		}
	}
}
