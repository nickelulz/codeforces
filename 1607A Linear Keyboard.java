import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();

		// Test Cases
		for (int a = 0; a < t; a++) {
			
			char[] keyboard = input.nextLine().toCharArray();
			char[] s = input.nextLine().toCharArray();

			int total = 0;
			for (int i = 1; i < s.length; i++) {
				total += Math.abs( getPos(keyboard, s[i]) - getPos(keyboard, s[i-1]) );
			}
			System.out.println(total);
		}
	}
	public static int getPos(char[] array, char value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==value)
				return i;
		}
		return -1;
	}
}
