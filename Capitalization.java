import java.util.Scanner;

public class Capitalization {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		System.out.println(line.substring(0,1).toUpperCase() + line.substring(1));
	}
}
