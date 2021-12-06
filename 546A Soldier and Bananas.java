    import java.util.*;
    import java.io.*;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		int k = input.nextInt(), n = input.nextInt(), w = input.nextInt();
    		int total = -n;
    		for (int i = 1; i <= w; i++) {
    			total += k * i;
    		}
    		System.out.println(total > 0 ? total : 0);
    	}
    }
