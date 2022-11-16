package No_8958;

import java.util.Scanner;

public class OX_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str[] = new String[cnt];
		String arr_word[] = new String[str.length];

		for (int i = 0; i < cnt; i++) {
			int temp = 0;
			int sum = 0;
			str[i] = sc.next();

			for (int j = 0; j < str[j].length(); j++) {
				if (str[j].charAt(j)=='O') {
					temp += 1;
					sum += temp;
				} else {
					temp = 0;
					sum += temp;
				}
			}
			System.out.println(sum);
		}
	}
}