import java.util.Scanner;

public class FibonacciCheck {

    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, c;

        if (num == 0 || num == 1) {
            return true;
        }

        while (b <= num) {
            if (b == num) {
                return true; 
            }
            c = a + b; 
            a = b;        
            b = c;     
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}