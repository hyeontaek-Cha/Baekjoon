package No_10952;

import java.util.Scanner;

public class A_Sum_B_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			sum = a + b;
			System.out.println(sum);
		}
	}
}