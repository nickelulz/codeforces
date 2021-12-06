    import java.util.*;
    import java.io.*;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		int n = input.nextInt(), k = input.nextInt();
    		for (int i = 0; i < k; i++) if (n % 10 != 0){n--;}else{n/=10;}
    		System.out.println(n);
    	}
    }
