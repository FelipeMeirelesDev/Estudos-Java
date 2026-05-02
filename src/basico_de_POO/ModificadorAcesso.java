package basico_de_POO;

public class ModificadorAcesso {


    // private:
    // só pode ser acessado dentro da própria classe
    private String nome = "Felipe";

    // default (sem modificador):
    // acessível apenas no mesmo pacote
    int idade = 22;

    // protected:
    // acessível no mesmo pacote e em subclasses
    protected String cidade = "São Paulo";

    // public:
    // acessível de qualquer lugar
    public String pais = "Brasil";

    //método público
    public void mostrarDados() {

        // dentro da própria classe
        // todos os atributos podem ser acessados
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cidade);
        System.out.println(pais);
    }
}