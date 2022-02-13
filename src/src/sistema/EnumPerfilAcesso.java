package sistema;

public enum EnumPerfilAcesso {
    ADMINISTRATIVO("Administrativo"),
    OPERACIONAL("Operacional"),
    RH("RH");

    private String tipo;

    EnumPerfilAcesso(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
