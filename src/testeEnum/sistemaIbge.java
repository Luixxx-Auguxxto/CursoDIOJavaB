package testeEnum;

public class sistemaIbge {
    public static void main(String[] args) {
        for (estadoBrasileiro e : estadoBrasileiro.values()){
            //System.out.println(e.getSigla() + "-" + e.getNomeMaiuscolo());
        }
        estadoBrasileiro eb = estadoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNomeMaiuscolo());
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());
    }
}
