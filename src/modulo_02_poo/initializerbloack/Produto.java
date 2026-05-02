package modulo_02_poo.initializerbloack;

public class Produto {

    String nome;
    double preco;

    // Bloco inicializador
    // Bloco inicializar é um bloco de código executado automaticamente
    // toda vez que um objeto da classe é criado.
    // Ele executa ANTES do construtor.
    // Ordem de execução:
    // 1. atributos
    // 2. bloco inicializador
    // 3. construtor
    {
        nome = "Produto sem nome";
        preco = 0;
        System.out.println("Valores padrão definidos!");
    }

    public Produto() {
        System.out.println("Construtor chamado!");
    }

    public void mostrarDados() {
        System.out.println(nome);
        System.out.println(preco);
    }

    public static void main(String[] args) {

        Produto p = new Produto();

        p.mostrarDados();

    }
}