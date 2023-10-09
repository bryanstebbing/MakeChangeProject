import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please tell me how much the item cost.");
		double cost = sc.nextDouble();

		System.out.println("How much money are you paying with?");
		double pay = sc.nextDouble();

		double refund = pay - cost;

		if (cost > pay) {
			System.out.println("Please provide the Teller with an appropriate amount for this transaction");
		} else if (cost == pay) {
			System.out.println("Thank you, your transaction is complete.");
		} else {
			System.out.println("Thank you for using Bryans Automated Teller Program. Your change is " + (float) refund);

			int twenties = (int) (refund / 20);
			refund %= 20;
			if (twenties == 0) {
				System.out.print("");
			} else if (twenties == 1) {
				System.out.println("You get back " + twenties + " twenty dollar bill");
			} else {
				System.out.println("You get back " + twenties + " twenties");
			}

			int tens = (int) (refund / 10);
			refund %= 10;

			if (tens == 0) {
				System.out.print("");
			} else if (tens == 1) {
				System.out.println("You get back " + tens + " ten dollar bill");
			} else {
				System.out.println("You get back " + tens + " tens");
			}

			int fives = (int) (refund / 5);
			refund %= 5;
			if (fives == 0) {
				System.out.print("");
			} else if (fives == 1) {
				System.out.println("You get back " + fives + " five dollar bill");
			} else {
				System.out.println("You get back " + fives + " fives");
			}

			int twos = (int) (refund / 2);
			refund %= 2;
			if (twos == 0) {
				System.out.print("");
			} else if (twos == 1) {
				System.out.println("You get back " + twos + " two dollar bill");
			} else {
				System.out.println("You get back " + twos + " twos");
			}

			int ones = (int) (refund);
			if (ones == 0) {
				System.out.print("");
			} else if (ones == 1) {
				System.out.println("You get back " + ones + " one dollar bill");
			} else {
				System.out.println("You get back " + ones + " ones");
			};

			refund *= 100;

			int quarters = (int) refund / 25;
			refund %= 25;
			if (quarters == 0) {
				System.out.print("");
			} else if (quarters == 1) {
				System.out.println("You get back " + quarters + " quarter");
			} else {
				System.out.println("You get back " + quarters + " quarters");
			}

			int dimes = (int) refund / 10;
			refund %= 10;
			if (dimes == 0) {
				System.out.print("");
			} else if (dimes == 1) {
				System.out.println("You get back " + dimes + " one dime");
			} else {
				System.out.println("You get back " + dimes + " dimes");
			}

			int nickels = (int) refund / 5;
			refund %= 5;
			if (nickels == 0) {
				System.out.print("");
			} else if (nickels == 1) {
				System.out.println("You get back " + nickels + " one nickel");
			} else {
				System.out.println("You get back " + nickels + " nickels");
			}

			int pennies = (int) refund;
			if (pennies == 0) {
				System.out.print("");
			} else if (pennies == 1) {
				System.out.println("You get back " + pennies + " one penny");
			} else {
				System.out.println("You get back " + pennies + " pennies");
			}

		}
		sc.close();
	}
}
