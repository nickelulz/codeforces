import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); input.nextLine();
        for (int i = 0; i < n; i++) 
        {
            String line = input.nextLine();
            if (line.length() <= 10)
                System.out.println(line);
            else {
                System.out.println(line.charAt(0) + "" + (line.length()-2) + "" + line.charAt(line.length()-1));
            }
        }
    }
}
