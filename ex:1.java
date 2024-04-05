import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita um número inteiro positivo do usuário
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é positivo
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
            return; // Encerra o programa se o número não for positivo
        }
        
        // Imprime uma contagem regressiva do número até zero usando um loop for
        System.out.println("Contagem regressiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
