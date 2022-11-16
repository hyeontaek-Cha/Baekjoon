package No_10809;

import java.util.Scanner;

public class Find_Alphabat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char n = 'a';
		for (int i = 0; i <26; i++) {
			int index = str.indexOf(n);
			System.out.print(index + " ");
			n++;

		}
	}
}