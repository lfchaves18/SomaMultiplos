import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para a soma: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos múltiplos de 3 ou 5 é: " + soma);
    }
}