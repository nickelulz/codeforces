import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // col
        for (int i = 0; i < 5; i++) {
            // row
            for (int j = 0; j < 5; j++) {
                if (input.nextInt() == 1)
                    System.out.println(Math.abs( 2 - i ) + Math.abs( 2 - j ));
            }
            // input.nextLine();
        }
    }
}
