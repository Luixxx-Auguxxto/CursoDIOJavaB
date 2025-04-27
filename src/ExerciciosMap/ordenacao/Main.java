package ExerciciosMap.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 27), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 28), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 11), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2010, Month.APRIL, 11), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 28), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();



    }
}
