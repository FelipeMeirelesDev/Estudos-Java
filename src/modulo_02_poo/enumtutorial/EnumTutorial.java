package modulo_02_poo.enumtutorial;

public class EnumTutorial {

    public static void main(String[] args){

        // Enum é um tipo de dado especial que define um conjunto fixo de constantes

        DiasDaSemana dia = DiasDaSemana.QUINTA;

        if (dia == DiasDaSemana.QUINTA){
            System.out.println("Oba, Já é quase sexta-feira!");
        }

        System.out.println("Todos os dias da semana: ");
        for (DiasDaSemana diaSemana : DiasDaSemana.values()){
            System.out.println(diaSemana);
        }

    }
}