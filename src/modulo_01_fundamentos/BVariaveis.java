package modulo_01_fundamentos;

public class BVariaveis {

    public static void main(String[] args) {

        /*
            Variáveis são espaços na memória
            usados para armazenar valores.
        */

        // Variável texto
        String nome = "Felipe";

        // Variável inteira
        int idade = 22;

        // Variável decimal
        double altura = 1.75;

        /*
            Declarando variável separadamente
        */
        int numero;

        // Atribuindo valor
        numero = 10;

        /*
            Concatenação:
            juntar textos e variáveis.
        */
        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        System.out.println("Altura: " + altura);

        System.out.println("Número: " + numero);

    }
}
