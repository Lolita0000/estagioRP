import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciChecker {

    // Método para calcular a sequência de Fibonacci até um limite
    public static List<Integer> calcularFibonacci(int limite) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0); // Adiciona o primeiro número da sequência
        fibonacci.add(1); // Adiciona o segundo número da sequência

        // Gera a sequência até que o próximo número exceda o limite
        while (true) {
            int proximo = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            if (proximo > limite) {
                break; // Para se o próximo número for maior que o limite
            }
            fibonacci.add(proximo);
        }
        return fibonacci; // Retorna a sequência gerada
    }

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean pertenceAFibonacci(int numero, List<Integer> fibonacci) {
        return fibonacci.contains(numero); // Verifica se a lista contém o número
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número que será verificado (pode ser alterado ou solicitado ao usuário)
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt(); // Lê o número informado pelo usuário

        // Calcula a sequência até o número informado
        List<Integer> fibonacciSequencia = calcularFibonacci(numero);

        // Verifica se o número pertence à sequência
        if (pertenceAFibonacci(numero, fibonacciSequencia)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close(); // Fecha o scanner
    }
}
