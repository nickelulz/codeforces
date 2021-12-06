    import java.util.Scanner;
     
    public class Tram 
    {
    	public static void main(String[] args) 
    	{
    		Scanner input = new Scanner(System.in);
    		int n = input.nextInt();
    		int riderCount = 0;
    		int largest = 0;
    		for (int i = 0; i < n; i++) {
    			int a = input.nextInt(), b = input.nextInt();
    			riderCount -= a;
    			riderCount += b;
    			largest = riderCount > largest ? riderCount : largest;
    		}
    		System.out.println(largest);
    	}
    }
