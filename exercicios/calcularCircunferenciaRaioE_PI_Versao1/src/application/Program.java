// Pacote onde a classe Program está localizada
package application;

// Importações necessárias para usar classes do pacote java.util
import java.util.Locale;
import java.util.Scanner;

// Classe principal do programa
public class Program {
	
    // Constante que armazena o valor de PI
	public static final double PI = 3.14159;
	
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
		
        // Calcula a circunferência usando o método estático circumference
		double c = circumference(radius);
		
        // Calcula o volume usando o método estático volume
		double v = volume(radius);
		
        // Exibe os resultados formatados
		System.out.printf("circumference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
        // Fecha o Scanner para liberar recursos
		sc.close();
	}
	
    // Método estático que calcula a circunferência com base no raio
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

    // Método estático que calcula o volume de uma esfera com base no raio
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
