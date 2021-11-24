import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nums = input.nextLine().split("\\+");
        Arrays.sort(nums);

        String b = "";
        for (String n : nums)
            b += n + "+";
        
        System.out.println(b.substring(0,b.length()-1));
    }
}
