package empresa.enumsempresa;

public enum EnumSegmento {
    ALIMENTOS_BEBIDAS("Alimentos e bebidas"),
    CELULOSE_PAPEL("Celulose e papel"),
    CONSTRUCAO("Construção"),
    EQUIP_ELETRICOS("Equipamentos elétricos"),
    FARMACOS_EQUIP_SAUDE("Fármacos e equipamentos de saúde"),
    FUMO("Fumo"),
    IND_AUTOMOTIVA("Indústria automotiva"),
    IND_CERAMICA("Indústria cerâmica"),
    IND_DIVERSA("Indústria diversa"),
    IND_EXTRATIVA("Indústria extrativa"),
    IND_GRAFICA("Indústria gráfica"),
    MADEIRA_MOVEIS("Madeira e móveis"),
    MAQ_EQUIP("Máquinas e equipamentos"),
    METALMEC_METALURGIA("Metalmecânica e Metalurgia"),
    OLEO_GAS_ELET("Óleo, gás e eletricidade"),
    PROD_QUIM_PLAST("Produtos químicos e plásticos"),
    SANEAMENTO_BASICO("Saneamento básico"),
    TIC("TIC"),
    TEXTIL_CONFC_COURO_CALCADOS("Têxtil, confecção, couro e calçados")
    ;

    private String tipo;

    EnumSegmento(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
}
