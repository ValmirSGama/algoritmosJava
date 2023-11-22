// Pacote onde a classe Program está localizada
package application;

// Importações necessárias para usar classes do pacote java.util e da classe Calculator do pacote util
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

// Classe principal do programa
public class Program {

    // Método principal que é executado quando o programa é iniciado
    public static void main(String[] args) {
        
        // Configura a localização para US (utilizado para leitura de números decimais)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira o raio
        System.out.print("Enter radius: ");
        
        // Lê o raio fornecido pelo usuário
        double radius = sc.nextDouble();

        // Calcula a circunferência usando o método estático da classe Calculator
        double c = Calculator.circumference(radius);

        // Calcula o volume usando o método estático da classe Calculator
        double v = Calculator.volume(radius);

        // Exibe os resultados formatados
        System.out.printf("circumference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}