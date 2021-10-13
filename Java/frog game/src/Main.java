import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] frog = new char[7];

		frog[0] = 'G';
		frog[1] = 'G';
		frog[2] = 'G';
		frog[4] = 'R';
		frog[5] = 'R';
		frog[6] = 'R';

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		Integer noFrog = Integer.parseInt(input);

		if (frog[noFrog] == 'R') {
			frog[noFrog-1] = frog[noFrog];
			frog[noFrog] = ' ';
		}

		if (frog[noFrog] == 'G') {
			frog[noFrog+1] = frog[noFrog];
			frog[noFrog] = ' ';
		}

		//print array
		System.out.println(Arrays.toString(frog));
	}

}
