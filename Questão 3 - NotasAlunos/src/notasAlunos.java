import java.util.Scanner;

public class notasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 10;
        double[] notas = new double[numAlunos];

        System.out.println("Informe as notas dos 10 alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / numAlunos;

        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            } else if (nota < media) {
                abaixoDaMedia++;
            }
        }

        System.out.println("A média das notas é: " + media);
        System.out.println("Notas acima da média: " + acimaDaMedia);
        System.out.println("Notas abaixo da média: " + abaixoDaMedia);

        scanner.close();
    }
}
