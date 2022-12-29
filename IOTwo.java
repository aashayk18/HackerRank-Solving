import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class IOTwo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        double myDouble = sc.nextDouble();
        sc.nextLine();
        String myString = sc.nextLine();
        sc.close();
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
