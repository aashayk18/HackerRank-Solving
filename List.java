import java.util.Scanner;
import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> L = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            L.add(sc.nextInt());

        }

        int Q = sc.nextInt();

        for (int j = 0; j < Q; j++) {

            String s = sc.next();

            if (s.equals("Insert")) {
                L.add(sc.nextInt(), sc.nextInt());
            } else if (s.equals("Delete")) {
                L.remove(sc.nextInt());
            }
        }
        sc.close();
        L.forEach(i -> System.out.print(i + " "));
    }
}