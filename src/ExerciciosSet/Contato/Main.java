package ExerciciosSet.Contato;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0); //não foi adicionado por conta do hashcode
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 6869695);
        agendaContatos.adicionarContato("Maria Silva", 1111111111);


        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisaPorNome("Camila"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        agendaContatos.exibirContato();
    }
}
