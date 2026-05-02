package modulo_02_poo.record;

public class RecordMain {

    public static void main(String[] args){

        //Record são classes especiais imutáveis projetadas para modelar dados
        //de forma concisa, eliminando código boilerplate (construtores, getters, equals, hashCode, toString).
        //Os Records foram criados com um objetivo muito especifico que é o transporte de dados.
        //Um Record é um tipo especial de classe que tem um propósito especifico: armazenar dados.

        Funcionario funcionario = new Funcionario("Felipe",1234);
        FuncionarioRecord funcionarioRecord = new FuncionarioRecord("Carlos",4321);

        System.out.println(funcionario);
        System.out.println(funcionarioRecord);
    }
}
