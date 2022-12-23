import java.io.*;
import java.util.*;
import java.util.Scanner;

public class IO {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for(i = 0; i<=2; i++) {
            int myInt = sc.nextInt();
            System.out.println(myInt);
        }
        sc.close();
    }
}
