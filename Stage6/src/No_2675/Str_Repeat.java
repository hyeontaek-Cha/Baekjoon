package No_2675;

import java.util.Scanner;

public class Str_Repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int flag = 0;
		int num = sc.nextInt();
		while (flag != num) {
			
			int cycle = sc.nextInt();
			String str = sc.next();
			
			String sp[] = str.split("");
			
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < cycle; j++) {
					System.out.print(sp[i]); 
				}
			}
			flag++;
			System.out.println();
		}
	}
}
