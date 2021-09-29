package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String numin = scanner.nextLine();
		Float total = Float.parseFloat(numin);

		while(true) {
			numin = scanner.nextLine();
			Float price = Float.parseFloat(numin);
			if (price == 0f) break;
			total = total + price;
		}
		
		System.out.println(total);
	}
}