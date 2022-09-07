package No_14681;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int x = sc.nextInt();
		System.out.print("");
		int y = sc.nextInt();

		if (x > 0 && y > 0)
			System.out.println("1");
		else if (x < 0 && y > 0)
			System.out.println("2");
		else if (x < 0 && y < 0)
			System.out.println("3");
		else if (x > 0 && y < 0)
			System.out.println("4");
	}
}