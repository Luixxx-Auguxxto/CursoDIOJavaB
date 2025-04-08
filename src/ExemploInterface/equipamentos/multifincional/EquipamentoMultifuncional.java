package ExemploInterface.equipamentos.multifincional;

import ExemploInterface.equipamentos.copiadora.Copiadora;
import ExemploInterface.equipamentos.digitalizadora.Digitalizadora;
import ExemploInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via equioamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via quipamento multifuncional");

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");

    }
}
