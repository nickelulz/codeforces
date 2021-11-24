import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); input.nextLine();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            if (line.equals("++X") || line.equals("X++"))
                x++;
            else if (line.equals("--X") || line.equals("X--"))
                x--;
        }
        System.out.println(x);
    }
}
