package No_10818;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] n = new int[count];

		for (int i = 0; i < count; i++) {
			n[i] = sc.nextInt();
		}
		int max = n[0];
		int min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			} 
			else if (min > n[i]) {
				min = n[i];
			}
		}
		System.out.print(min + " " + max);
	}
}