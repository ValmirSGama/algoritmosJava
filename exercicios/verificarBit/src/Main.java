import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner sc = new Scanner(System.in);
        
        // Define uma máscara (mask) com o valor binário 0b100000 (equivale a decimal 32)
        int mask = 0b100000;
        
        // Solicita ao usuário que insira um número inteiro e armazena-o na variável 'n'
        int n = sc.nextInt();
        
        // Verifica se o sexto bit do número 'n' é igual a 1 usando a operação bitwise AND com a máscara 'mask'
        if ((n & mask) != 0) {
            System.out.println("O sexto bit está definido como verdadeiro!");
        } else {
            System.out.println("O sexto bit está definido como falso.");
        }
        
        // Fecha o objeto Scanner
        sc.close();
    }
}
