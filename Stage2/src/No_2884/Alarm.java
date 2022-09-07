package No_2884;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H <= 0)
			H = 23;
			System.out.println(H + (M + 15));
	}
}