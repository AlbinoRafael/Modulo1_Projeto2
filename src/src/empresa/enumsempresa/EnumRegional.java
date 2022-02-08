package empresa.enumsempresa;

public enum EnumRegional {
    ;
    private String regional;

    EnumRegional(String regional) {
        this.regional = regional;
    }
    public String getEstado(){
        return this.regional;
    }
}
