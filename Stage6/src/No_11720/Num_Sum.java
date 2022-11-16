package No_11720;

import java.util.Scanner;

public class Num_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String arr = sc.next();
		String sp[] = arr.split("");
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			sum += Integer.parseInt(sp[i]);
		}
		System.out.println(sum);
	}
}