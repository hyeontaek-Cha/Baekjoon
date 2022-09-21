package No_2480;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		boolean All_X = num1 != num2 && num1 != num3 && num2 != num3;
		boolean All_O = num1 == num2 && num1 == num3 && num2 == num3;
		boolean Two_O = (num1 == num2 && num1 != num3) || (num1 != num2 && num1 == num3) || (num1 != num2 && num2 == num3);
		
		if (All_X) {
			int max = 0;
			if(num1 > num2) {
				if (num1 > num3) 
					max = num1;
				else
					max = num3;
			}
			else {
				if(num3 > num2) 
					max = num3;
				else
					max = num2;
			}
			System.out.print(max * 100);
		} 
		else if (Two_O) { 
			int same = 0;
			if(num1 == num2) { 
				if(num1 != num3)
					same = num1; // num1 == num2 
			}
			else if(num1 != num2) {
				if(num2 != num3)
					same = num1; // num1 == num3 
				else
					same = num2;
			}
			System.out.print((1000 + (same * 100)));
		} 
		else if (All_O) {
			System.out.print((10000 + (num1 * 1000)));
		}
	}
}