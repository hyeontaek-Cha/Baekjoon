package No_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fast_Sum {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(bf.readLine());

		for (int i = 1; i <= t; i++) {

			String[] s = bf.readLine().split(" "); 
			int sum = 0;

			for (int j = 0; j < s.length; j++) {
				sum += Integer.parseInt(s[j]);
			}
			bw.write(sum + "\n");
			bw.flush();
		}
		bf.close();
		bw.close();
	}
}