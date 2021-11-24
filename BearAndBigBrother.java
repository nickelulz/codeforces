import java.util.*;
import java.io.*;

public class Problem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		int years = 0;
		int limakWeight = (int) (a * Math.pow(3, years));
		int bobWeight = (int) (b * Math.pow(2, years));
		while ( limakWeight <= bobWeight ) {
			years++;
			// Recalculate
			limakWeight = (int) (a * Math.pow(3, years));
			bobWeight = (int) (b * Math.pow(2, years));
		}

		System.out.println(years);
	}
}
