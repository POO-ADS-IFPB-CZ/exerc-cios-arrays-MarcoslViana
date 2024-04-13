import java.util.Scanner;

public class mediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int soma = 0;

        while (true) {
            System.out.print("Digite um número inteiro maior ou igual a zero (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            quantidadeNumeros++;
            soma += numero;
        }

        if (quantidadeNumeros > 0) {
            double media = (double) soma / quantidadeNumeros;
            System.out.println("Quantidade de números digitados: " + quantidadeNumeros);
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}
