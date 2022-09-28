package No_10871;

import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		
		String [] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
			if(Integer.parseInt(str[i]) < x) {
				System.out.print(str[i] + " ");
			}
		}
	}
}