package No_10807;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int v = sc.nextInt();

		for (int j = 0; j < arr.length; j++)
			if (arr[j] == v) {
				count++;
			}
		System.out.println(count);
	}
}