import java.util.Scanner;

public class ScannerTutorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is your first name?");
		String name = scan.next();

		System.out.println("What is your age?");
		int age = scan.nextInt();

		System.out.println("What is your senior quote?");
		String quote = scan.next();
		quote += scan.nextLine(); // quote = quote + scan.nextLine();

		scan.close();

		System.out.println("Thank you" + name + ", you are " + age + " years old.");
		System.out.println("and your senior quote is " + quote);

	}

}
