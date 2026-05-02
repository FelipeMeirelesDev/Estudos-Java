package basico_de_POO;

public class StaticKeyword {

    // variável static pertence à classe
    // e não ao objeto

    static int quantidade = 0;

    // construtor
    //public Contador() {

        // toda vez que criar objeto
        // aumenta o contador
       // quantidade++;
    //}

    // método static
    // pode ser chamado sem criar objeto
    static void mostrarQuantidade() {
            System.out.println("Quantidade: " + quantidade);
    }
}