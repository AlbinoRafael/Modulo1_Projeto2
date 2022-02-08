package empresa.enumsempresa;

public enum EnumTipo {
    MATRIZ("Matriz"),
    FILIAL("Filial");

    private String tipo;

    EnumTipo(String tipo) {
        this.tipo=tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
}
