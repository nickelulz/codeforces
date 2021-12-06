    import java.util.*;
    import java.io.*;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		int n = input.nextInt();
    		input.nextLine();
    		char[] s = input.nextLine().toCharArray();
    		int count = 0;
    		for (int i = 1; i < s.length; i++) {
    			if (s[i] == s[i-1])
    				count++;
    		}
    		System.out.println(count);
    	}
    }
