package No_2525;

import java.util.Scanner;

public class Oven {
	public static final int HOUR = 60;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int hour = sc.nextInt();
		int min = sc.nextInt();

		System.out.print("");
		int cock_for_min = sc.nextInt();
		int sub_hour = 0;
		if (min + cock_for_min >= HOUR * 2) {
			sub_hour = (min + cock_for_min) / HOUR;
			hour += sub_hour;
			min = (min + cock_for_min) % HOUR;
			if (hour > 23) {
				hour -= 24;
			}
		} 
		else if (min + cock_for_min >= HOUR) {
			hour += 1;
			min += cock_for_min - HOUR;
			if (hour > 23) {
				hour -= 24;
			}
		}
		else {
			min += cock_for_min;
		}
		System.out.println(hour + " " + min);
	}
}