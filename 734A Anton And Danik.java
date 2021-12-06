    import java.util.*;
     
    public class AntonAndDanik
    {
    	public static void main(String[] args) 
    	{
    		Scanner input = new Scanner(System.in); input.nextLine();
    		int a = eval(input.nextLine().toCharArray());
    		switch (a) {
    			case 1: System.out.println("Anton"); break;
    			case 2: System.out.println("Danik"); break;
    			case 3: System.out.println("Friendship");
    		}
    	}
    	public static int eval(char[] arr) 
    	{
    		// danikcount antoncount
    		int dc = 0, ac = 0;
    		for (char c : arr) {
    			if (c=='A') ac++;
    			else if (c=='D') dc++;
    		}
     
    		if (dc==ac) return 3;
    		else if (dc>ac) return 2;
    		else return 1;
    	}
    }
