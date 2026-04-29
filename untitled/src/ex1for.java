import java.util.Scanner;

public class ex1for {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println("Digite um número: ");
        int num = scanner.nextInt();

        int fatorial = 1;

        if (num < 0) {
            IO.println("Não existe fatorial de número negativo.");
        } else {
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            IO.println("O fatorial de " + num + " é " + fatorial);
        }
    }
}