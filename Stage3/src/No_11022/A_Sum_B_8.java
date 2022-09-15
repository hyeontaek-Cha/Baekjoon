package No_11022;

import java.util.Scanner;

public class A_Sum_B_8{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			System.out.print("");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}
	}
}