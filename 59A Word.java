    import java.util.*;
    import java.io.*;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		String s = input.nextLine();
    		System.out.println(moreUpperCase(s)?s.toUpperCase():s.toLowerCase());
    	}
    	public static boolean moreUpperCase(String s) {
    		char[] array = s.toCharArray();
    		int count = 0;
    		for (char c : array) {
    			if (Character.isUpperCase(c))
    				count++;
    			if (count > array.length/2)
    				return true;
    		}
    		return false;
    	}
    }
