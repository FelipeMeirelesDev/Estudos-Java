package modulo_02_poo.record;

import java.util.Objects;

public class Funcionario {

    private final String nome;
    private final int codigoFuncionario;

    public Funcionario (String nome, int codigoFuncionario){
        this.nome = nome;
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", codigoFuncionario=" + codigoFuncionario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return codigoFuncionario == that.codigoFuncionario && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigoFuncionario);
    }
}
