package modulo_02_poo.enumtutorial;

public enum Turno {

    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite");

    private String descricao;

    Turno(String descricao){
        this.descricao = descricao;
    }

    private String getDescricao(){
        return descricao;
    }
}