    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		String nums[] = input.nextLine().split("");
    		System.out.println((numOfPerfects(nums)==4||numOfPerfects(nums)==7)?"YES":"NO");
    	}
    	public static int numOfPerfects(String[] in) {
    		int count = 0;
    		for (String s : in) {
    			int a = Integer.parseInt(s);
    			if (a==4||a==7)
    				count++;
    		}
    		return count;
    	}
    }
