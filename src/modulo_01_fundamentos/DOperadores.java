package modulo_01_fundamentos;

public class DOperadores {

    public static void main(String[] args) {

        int numero1 = 10;

        int numero2 = 5;

        /*
            OPERADORES ARITMÉTICOS
        */

        // Soma
        System.out.println(numero1 + numero2);

        // Subtração
        System.out.println(numero1 - numero2);

        // Multiplicação
        System.out.println(numero1 * numero2);

        // Divisão
        System.out.println(numero1 / numero2);

        // Resto da divisão
        System.out.println(numero1 % numero2);

        /*
            OPERADORES RELACIONAIS
        */

        System.out.println(numero1 > numero2);

        System.out.println(numero1 < numero2);

        System.out.println(numero1 == numero2);

        System.out.println(numero1 != numero2);

        /*
            OPERADORES LÓGICOS
        */

        boolean temDinheiro = true;

        boolean lojaAberta = true;

        // AND
        System.out.println(temDinheiro && lojaAberta);

        // OR
        System.out.println(temDinheiro || lojaAberta);

        // NOT
        System.out.println(!temDinheiro);

        /*
            Incremento e decremento
        */

        numero1++;

        System.out.println(numero1);

        numero1--;

        System.out.println(numero1);

        /*
            Operador ternário
        */

        int idade = 18;

        String resultado =
                idade >= 18 ? "Maior" : "Menor";

        System.out.println(resultado);

    }
}