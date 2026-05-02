package modulo_01_fundamentos;

import java.util.Scanner;

public class EEntradaDados {

    public static void main(String[] args) {

        /*
            Scanner:
            usado para entrada de dados.
        */

        Scanner scanner = new Scanner(System.in);

        /*
            Entrada de texto
        */
        System.out.print("Digite seu nome: ");

        String nome = scanner.nextLine();

        /*
            Entrada de número inteiro
        */
        System.out.print("Digite sua idade: ");

        int idade = scanner.nextInt();

        /*
            Entrada decimal
        */
        System.out.print("Digite sua altura: ");

        double altura = scanner.nextDouble();

        /*
            Exibindo valores
        */
        System.out.println(nome);

        System.out.println(idade);

        System.out.println(altura);

        /*
            Fechando Scanner
        */
        scanner.close();

    }
}