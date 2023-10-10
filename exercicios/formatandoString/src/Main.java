
public class Main {

    public static void main(String[] args) {
        
        // Cria uma string original
        String original = "abcde FGHIJ ABC abc DEFG   ";
        
        // Converte a string original para letras minúsculas
        String s01 = original.toLowerCase();
        
        // Converte a string original para letras maiúsculas
        String s02 = original.toUpperCase();
        
        // Remove espaços em branco no início e no final da string
        String s03 = original.trim();
        
        // Obtém uma substring a partir do índice 2 até o final da string
        String s04 = original.substring(2);
        
        // Obtém uma substring da posição 2 até a posição 9 da string
        String s05 = original.substring(2, 9);
        
        // Substitui todas as ocorrências do caractere 'a' por 'x'
        String s06 = original.replace('a', 'x');
        
        // Substitui todas as ocorrências da sequência "abc" por "xy"
        String s07 = original.replace("abc", "xy");
        
        // Encontra a primeira ocorrência da substring "bc" na string original
        int i = original.indexOf("bc");
        
        // Encontra a última ocorrência da substring "bc" na string original
        int j = original.lastIndexOf("bc");
        
        // Imprime a string original
        System.out.println("Original: -" + original + "-");
        
        // Imprime a string convertida para letras minúsculas
        System.out.println("toLowerCase: -" + s01 + "-");
        
        // Imprime a string convertida para letras maiúsculas
        System.out.println("toUpperCase: -" + s02 + "-");
        
        // Imprime a string após remover espaços em branco no início e no final
        System.out.println("trim: -" + s03 + "-");
        
        // Imprime a substring a partir do índice 2 até o final da string
        System.out.println("substring(2): -" + s04 + "-");
        
        // Imprime a substring da posição 2 até a posição 9 da string
        System.out.println("substring(2, 9): -" + s05 + "-");
        
        // Imprime a string após substituir 'a' por 'x'
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        
        // Imprime a string após substituir "abc" por "xy"
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        
        // Imprime o índice da primeira ocorrência de "bc"
        System.out.println("Index of 'bc': " + i);
        
        // Imprime o índice da última ocorrência de "bc"
        System.out.println("Last index of 'bc': " + j);
    }
}
