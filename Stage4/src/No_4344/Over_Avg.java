package No_4344;

import java.util.Scanner;

public class Over_Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			int num = sc.nextInt();
			int score[] = new int[num];
			int sum = 0;
			int avg = 0;
			double result = 0;
			int high_avg = 0;

			for (int j = 0; j < score.length; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			avg = sum / score.length;

			for (int k : score) {
				if (k > avg) {
					high_avg += 1;
				}
			}
			result = ((double) high_avg / (double) score.length) * 100;
			System.out.printf("%.3f%%\n", result);
		}
	}
}