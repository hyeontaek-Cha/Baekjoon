package No_1546;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		double score[] = new double[cnt];
		double max = score[0];
		double sum = 0;
		double result = 0;
		for (int i = 0; i < cnt; i++) {
			score[i] = sc.nextInt();
			if (max < score[i]) {
				max = score[i];
			}
			sum += score[i];
		}
		result = (sum / max * 100) / cnt;
		System.out.println(result);
	}
}