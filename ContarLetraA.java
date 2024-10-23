import java.util.Scanner;

public class ContarLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase ou uma palavra: ");
        String fraseoupalavra = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < fraseoupalavra.length(); i++) {
            char letra = fraseoupalavra.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es) na frase/palavra.");
        } else {
            System.out.println("A letra 'a' não aparece na frase/palavra.");
        }

        scanner.close();
    }
}