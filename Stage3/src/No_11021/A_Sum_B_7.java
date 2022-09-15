package No_11021;

import java.util.Scanner;

public class A_Sum_B_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			System.out.print("");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print("Case #" + i);
			System.out.print(": " + (a + b) + "\n");
		}
	}
}