    import java.util.*;
     
    public class Translation 
    {
    	public static void main(String[] args) 
    	{
    		Scanner input = new Scanner(System.in);
    		String a = input.nextLine();
    		StringBuilder b = new StringBuilder(input.nextLine());
    		System.out.println(b.reverse().toString().equals(a)?"YES":"NO"); 
    	}
    }
