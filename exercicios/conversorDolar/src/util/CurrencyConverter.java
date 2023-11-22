// Pacote onde a classe CurrencyConverter está localizada
package util;

// Classe responsável por converter dólares para reais
public class CurrencyConverter {
    
    // Constante que armazena a taxa de IOF
    public static double IOF = 0.06;

    // Método estático que realiza a conversão de dólares para reais
    public static double dollarToReal(double amount, double dollarPrice) {
        // Calcula o valor em reais considerando a quantidade de dólares, preço do dólar e taxa de IOF
        return amount * dollarPrice * (1.0 + IOF);
    }
}