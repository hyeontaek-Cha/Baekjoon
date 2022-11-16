package No_5597;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> std=new ArrayList<>();
		for(int i=1; i<=30; i++){
			std.add(i);
		}

		for(int i=0; i<28; i++){
			int input=sc.nextInt();
			int check=std.indexOf(input);
			std.remove(check);
		}
		for(int no_check:std){
			System.out.println(no_check);
		}
	}
}