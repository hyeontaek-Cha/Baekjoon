package No_10951;

import java.util.Scanner;

public class A_Sum_B_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println(sum);
		}
	}
}