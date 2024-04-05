import java.util.Scanner;

public class CalculoMediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas notas deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();
        if (quantidadeNotas <= 0) {
            System.out.println("Por favor, insira um número de notas válido (maior que 0).");
            return;
        }
        double somaNotas = 0;
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Insira a nota " + i + ": ");
            double nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Por favor, insira uma nota válida entre 0 e 10.");
                i--; 
                continue;
            }
            
            somaNotas += nota;
        }
  
        double media = somaNotas / quantidadeNotas;
    
        System.out.println("A média das " + quantidadeNotas + " notas inseridas é: " + media);
    }
}
