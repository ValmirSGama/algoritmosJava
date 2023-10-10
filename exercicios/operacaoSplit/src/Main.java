public class Main {

    public static void main(String[] args) {
        
        // Cria uma string 's' com uma lista de frutas separadas por espaços
        String s = "potato apple lemon orange";
        
        // Divide a string 's' em um array de strings usando o espaço como delimitador
        String[] vect = s.split(" ");
        
        // Imprime cada elemento do array 'vect'
        System.out.println(vect[0]); // Imprime o primeiro elemento do array (potato)
        System.out.println(vect[1]); // Imprime o segundo elemento do array (apple)
        System.out.println(vect[2]); // Imprime o terceiro elemento do array (lemon)
        System.out.println(vect[3]); // Imprime o quarto elemento do array (orange)
    }
}
