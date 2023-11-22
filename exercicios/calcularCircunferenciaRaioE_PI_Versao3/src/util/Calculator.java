// Pacote onde a classe Calculator está localizada
package util;

// Classe responsável por realizar cálculos relacionados a geometria
public class Calculator {
    
    // Constante que armazena o valor de PI
    public static final double PI = 3.14159;

    // Método estático que calcula a circunferência com base no raio
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    // Método estático que calcula o volume de uma esfera com base no raio
    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}