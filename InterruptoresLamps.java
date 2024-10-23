import java.util.Scanner;

public class InterruptoresLamps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean interruptorA = false;
        boolean interruptorB = false; 
        boolean interruptorC = false;

        System.out.println("Ligando o Interruptor A...");
        interruptorA = true;

        System.out.println("Esperando 10 minutos...");

        System.out.println("Desligando o Interruptor A...");
        interruptorA = false;

        System.out.println("Ligando o Interruptor B...");
        interruptorB = true;

        System.out.println("\nIndo até as salas das lâmpadas...");

        System.out.println("Resultados:");
        System.out.println("Lâmpada A: " + (interruptorA ? "Acesa" : "Apagada") + " (quente se apagada)");
        System.out.println("Lâmpada B: " + (interruptorB ? "Acesa" : "Apagada") + " (está ligada)");
        System.out.println("Lâmpada C: Apagada (fria)");
        System.out.println("\nIdentificação das lâmpadas:");
        System.out.println("Lâmpada A: Controlada pelo Interruptor A");
        System.out.println("Lâmpada B: Controlada pelo Interruptor B");
        System.out.println("Lâmpada C: Controlada pelo Interruptor C");

        scanner.close();
    }
}