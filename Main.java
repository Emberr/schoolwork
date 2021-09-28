import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String firstname = scanner.nextLine();
		System.out.println("Enter your Last Name");
		String lastname = scanner.nextLine();


		System.out.println("Hello " + firstname + " " + lastname);

		//q 4
		System.out.println("Enter as many numbers as you want. enter 0 to show the sum");
		String numin = scanner.nextLine();
		
		Float total = Float.parseFloat(numin);
		
		
		while(true) {
			numin = scanner.nextLine();
			Float price = Float.parseFloat(numin);
			if (price == 0f) break;
			total = total + price;
		}
		
		System.out.println(total);
		
		//end q4
		
		System.out.println("please enter your birth year");
		Integer year = Integer.parseInt(scanner.nextLine());
		System.out.println("Age:");
		System.out.println(2021 - year);

		System.out.println("Enter the amount of money in pounds");
		String pndval = scanner.nextLine();
		Float pnd = Float.parseFloat(pndval);

		System.out.println("Enter the currency you want to convert to (EUR,USD,PLN)");
		String currency = scanner.nextLine();
		if (currency.contentEquals("USD")) {
			System.out.println(pnd + " " + "Pounds is " + pnd * 1.36 +" "+ "Dollars");
		} else if (currency.contentEquals("EUR")) {
			System.out.println(pnd + " " + "Pounds is " + pnd * 1.16 +" "+ "Euros");
		} else if (currency.contentEquals("PLN")) {
			System.out.println(pnd + " " + "Pounds is " + pnd * 5.39 +" "+ "Zloty");
		}
		
		//Death calculation
		
	}
}
