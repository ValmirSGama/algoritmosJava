// Pacote onde a classe Program está localizada
package application;

// Importa as classes necessárias para a aplicação
import java.util.Locale;
import java.util.Scanner;

// Importa a classe Calculator do pacote util
import util.Calculator;

// Classe principal do programa
public class Program {

    // Método principal que é executado quando o programa é iniciado
    public static void main(String[] args) {

        // Configura a localização para US (utilizado para leitura de números decimais)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Cria um objeto Calculator para realizar cálculos
        Calculator calc = new Calculator();

        // Solicita ao usuário que insira o raio
        System.out.print("Enter radius: ");

        // Lê o raio fornecido pelo usuário
        double radius = sc.nextDouble();

        // Calcula a circunferência usando o método da classe Calculator
        double c = calc.circumference(radius);

        // Calcula o volume usando o método da classe Calculator
        double v = calc.volume(radius);

        // Exibe os resultados formatados
        System.out.printf("circumference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
