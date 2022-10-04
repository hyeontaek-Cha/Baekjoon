package No_3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		int[] result = n;
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			n[i] %= 42;
			result[i] = n[i];
		}
		Set set = new HashSet();
		for (int i = 0; i < result.length; i++) {
			set.add(result[i]);
		}
		System.out.print(set.size());
	}
}