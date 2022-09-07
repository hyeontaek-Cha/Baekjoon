package No_1330;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int a = sc.nextInt();
		System.out.print("");
		int b = sc.nextInt();

		if (a > b)
			System.out.print(">");
		else if (a < b)
			System.out.print("<");
		else
			System.out.print("==");
	}
}