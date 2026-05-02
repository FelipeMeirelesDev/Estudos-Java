package modulo_01_fundamentos;

public class CTiposPrimitivos {

    public static void main(String[] args) {

        /*
            byte:
            números pequenos
        */
        byte numeroByte = 10;

        /*
            short:
            inteiro médio
        */
        short numeroShort = 100;

        /*
            int:
            inteiro mais utilizado
        */
        int numeroInt = 1000;

        /*
            long:
            números muito grandes
        */
        long numeroLong = 100000L;

        /*
            float:
            decimal simples
        */
        float numeroFloat = 10.5f;

        /*
            double:
            decimal mais preciso
        */
        double numeroDouble = 20.99;

        /*
            char:
            armazena um caractere
        */
        char letra = 'A';

        /*
            boolean:
            true ou false
        */
        boolean aprovado = true;

        System.out.println(numeroByte);

        System.out.println(numeroShort);

        System.out.println(numeroInt);

        System.out.println(numeroLong);

        System.out.println(numeroFloat);

        System.out.println(numeroDouble);

        System.out.println(letra);

        System.out.println(aprovado);

        /*
            Limites dos tipos
        */
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);

    }
}