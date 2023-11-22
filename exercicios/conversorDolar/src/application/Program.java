// Pacote onde a classe Program está localizada
package application;

// Importações necessárias para usar classes do pacote java.util e da classe CurrencyConverter do pacote util
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

// Classe principal do programa
public class Program {

    // Método principal que é executado quando o programa é iniciado
    public static void main(String[] args) {
        
        // Configura a localização para US (utilizado para leitura de números decimais)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira o preço do dólar
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        // Solicita ao usuário que insira a quantidade de dólares a serem comprados
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        // Calcula o valor em reais com base na quantidade de dólares, preço do dólar e taxa de IOF
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);

        // Exibe o resultado formatado
        System.out.printf("Amount to be paid in reais = %.2f", result);

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}