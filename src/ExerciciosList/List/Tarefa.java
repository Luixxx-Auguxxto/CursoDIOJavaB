package ExerciciosList.List;

public class Tarefa {

    //atributo
    private String descricao;
    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao;
    }
}
