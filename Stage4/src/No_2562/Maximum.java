package No_2562;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n = new int[9];
		int max = n[0];
		int num = 0;
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if (n[i] > max) {
				max = n[i];
				num = i + 1;
			}
		}
		System.out.println(max);
		System.out.print(num);
	}
}