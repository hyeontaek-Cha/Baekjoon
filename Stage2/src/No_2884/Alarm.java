package No_2884;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int H = sc.nextInt();
		int M = sc.nextInt();

		if(M < 45) {
			M += 15;
			if(H > 0) {
				H -=1;
			}
			else
				H +=23;
		}
		else 
			M -= 45;
		System.out.println(H + " " + M);
	}
}