package empresa.enumsempresa;

public enum EnumRegional {
    NORTE_NORDESTE("Norte - Nordeste"),
    OESTE("Oeste"),
    SUDERSTE("Sudeste"),
    CENTRO_NORTE("Centro - Norte"),
    VALE_ITAJAI("Vale do Itajaí"),
    VALE_ITAPOCU("Vale do Itapocu"),
    LITORAL_SUL("Litoral Sul"),
    ALTO_URUGUAI("Alto Uruguai Catarinense"),
    VALE_ITAJAI_MIRIM("Vale do Itajaí Mirim"),
    CENTRO_OESTE("Centro - Oeste"),
    PLANALTO_NORTE("Planalto Norte"),
    FOZ_RIO_ITAJAI("Foz do Rio Itajaí"),
    SUL("Sul"),
    SERRA_CATARINENSE("Serra Catarinense"),
    EXTREMO_OESTE("Extremo Oeste"),
    ALTO_VALE_ITAJAI("Alto Vale do Itajaí")
    ;
    private String regional;

    EnumRegional(String regional) {
        this.regional = regional;
    }
    public String getEstado(){
        return this.regional;
    }
}
