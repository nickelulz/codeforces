import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.nextLine();
 
        int[] c = new int[n];
        for (int i = 0; i < n; i++)
            c[i] = input.nextInt();
 
        int count = 0;
        for (int a : c)
            if (a >= c[k-1] && a > 0)
                count++;
        System.out.println(count);
    }
}
