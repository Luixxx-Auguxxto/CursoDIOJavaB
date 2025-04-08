package testeEnum;

public enum estadoBrasileiro {
    //Constante de objeto
    SAO_PAULO("SP","SÃO PAULO", 11),
    RIO_JANEIRO("RJ","RIO DE JANEIRO", 21),
    PIAUI("PI", "PIAUÍ",14),
    MARANHAO("MA", "MARANHÃO", 55),
    CEARA("CE","CEARA", 81);

    private String nome;
    private String sigla;
    private int ibge;

    //construtor
    private estadoBrasileiro( String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiuscolo(){
        return nome.toUpperCase();
    }

    public int getIbge() {
        return ibge;
    }
}
