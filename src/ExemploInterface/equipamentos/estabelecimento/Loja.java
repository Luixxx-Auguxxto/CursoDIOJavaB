package ExemploInterface.equipamentos.estabelecimento;

import ExemploInterface.equipamentos.copiadora.Copiadora;
import ExemploInterface.equipamentos.digitalizadora.Digitalizadora;
import ExemploInterface.equipamentos.impressora.Deskjet;
import ExemploInterface.equipamentos.impressora.Impressora;
import ExemploInterface.equipamentos.impressora.Laserjet;
import ExemploInterface.equipamentos.multifincional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora =  em;
        Digitalizadora digitalizadora =  em;
        Copiadora copiadora =  em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
