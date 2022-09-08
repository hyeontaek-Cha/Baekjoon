package No_2753;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int year = sc.nextInt();
		
		int year_4_mod = year % 4;
		int year_100_mod = year % 100;
		int year_400_mod = year % 400;
		
		if (year_4_mod == 0 && year_100_mod != 0 || year_400_mod == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}