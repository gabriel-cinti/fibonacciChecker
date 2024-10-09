package fibonacciChecker;

import java.util.Scanner;

public class FibonacciChecker {

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int number) {
        int a = 0, b = 1, next;

        if (number == a || number == b) {
            return true;
        }

        // Gera os próximos números da sequência até ultrapassar o valor informado
        while (true) {
            next = a + b;
            a = b;
            b = next;

            if (next == number) {
                return true;
            } else if (next > number) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueLoop;

        do {
            // Entrada do número pelo usuário
            System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
            int number = scanner.nextInt();

            // Chama o método e exibe o resultado
            if (isFibonacci(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
            }

            // Pergunta se o usuário deseja inserir outro número
            System.out.print("Deseja verificar outro número? (s/n): ");
            continueLoop = scanner.next();

        } while (continueLoop.equalsIgnoreCase("s")); // Continua enquanto a resposta for 's'

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}