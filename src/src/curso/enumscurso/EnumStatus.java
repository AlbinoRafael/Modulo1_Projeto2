package curso.enumscurso;

public enum EnumStatus {
    EM_ANDAMENTO("Curso em andamento"),
    AVALIANDO("Em fase de avaliação"),
    FINALIZADO("Fase de avaliação finalizada")
    ;

    private String status;
    EnumStatus(String status) {
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
}
