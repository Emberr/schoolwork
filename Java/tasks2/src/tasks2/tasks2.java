package tasks2;

import java.util.Scanner;

public class tasks2 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter the size of the box: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer boxSize = Integer.parseInt(input);

		Integer numSpace = boxSize - 2;

		for (int i = 0; i != boxSize; i++) {
			sb.append("*");
		}
		sb.append("\n");	
		for (int i = 0; i != boxSize-2; i++) {
			sb.append("*" + (" ".repeat(numSpace)) + "*");
			sb.append("\n");	
		}

		for (int i = 0; i != boxSize; i++) {
			sb.append("*");
		}

		System.out.println(sb);

		//question 7
		for(int i = 1000; i <= 9999; i++) {
			if(i % 10 != i / 1000)
			continue;
			int num = i / 10;
			num %= 100;
			if(num / 10 == num % 10)
			System.out.println(i);
		}



	}

}