import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class OutForm {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++) {
            String s = sc.next();
            int a = sc.nextInt();
            String format = "%-15s%03d\n";
            System.out.printf(format,s,a);
        }
        System.out.println("================================");
    }
}
