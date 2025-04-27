package ExerciciosSet.Contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set <Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int contato){
        contatoSet.add(new Contato(nome, contato));
    }


    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
