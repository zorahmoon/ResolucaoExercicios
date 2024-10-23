import java.util.Scanner;

public class Sequencias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 7 + 2;
        System.out.println("a) 1, 3, 5, 7, " + a);

        int b = 64 * 2;
        System.out.println("b) 2, 4, 8, 16, 32, 64, " + b);

        int c = 7 * 7;
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + c);

        int d = 10 * 10;
        System.out.println("d) 4, 16, 36, 64, " + d);

        int e = 5 + 8;
        System.out.println("e) 1, 1, 2, 3, 5, 8, " + e);

        int f = 19 + 1;
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, " + f);

        scanner.close();
    }
}