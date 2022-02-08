package curso.enumscurso;

public enum EnumSatisfacao {
    UM(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5)
    ;
    private int satisfacao;
    EnumSatisfacao(int satisfacao){
        this.satisfacao = satisfacao;
    }
    public int getSatisfacao(){
        return this.satisfacao;
    }
}
