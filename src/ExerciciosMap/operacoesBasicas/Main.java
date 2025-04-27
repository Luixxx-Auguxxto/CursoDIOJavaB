package ExerciciosMap.operacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila",1234);
        agendaContatos.adicionarContato("Camila",5555);
        agendaContatos.adicionarContato("Camila cavalcante",1111111111);
        agendaContatos.adicionarContato("Camila DIO",65656565);
        agendaContatos.adicionarContato("Maria silva",1111111111);
        agendaContatos.adicionarContato("Camila",444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria silva");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}
