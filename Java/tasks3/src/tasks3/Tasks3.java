package tasks3;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer x = Integer.parseInt(scanner.nextLine());
		int [] pt = new int[x];

		pt [x-1] = 1;

		for(int i = 0; i < x-1; i++) {
			for() {
				pt[i] = pt[i]+ pt[i+1];
			}
		}

		System.out.println(Arrays.toString(pt));


	}

}
