import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número inteiro maior que 1: ");
            numero = scanner.nextInt();
            if (numero <= 1) {
                System.out.println("Por favor, digite um número inteiro maior que 1.");
            }
        } while (numero <= 1);
        
        // Calcula a soma dos números pares entre 1 e o número solicitado
        int soma = 0;
        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }
        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);
    }
}
