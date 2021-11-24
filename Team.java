import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); input.nextLine();
        int allcount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int a = 0; a < 3; a++) {
                if (input.nextInt() == 1) count++;
            }
            if (count >= 2)
                allcount++;
        }
        System.out.println(allcount);
    }
}
