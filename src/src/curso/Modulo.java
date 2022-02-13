package curso;

import curso.enumscurso.EnumStatus;

import java.time.LocalDate;

public class Modulo {
    private static int cont_id = 1;

    private int id_Trilha;
    private Trilha trilha;
    private String nome;
    private String habilidades;
    private String tarefaValidacao;
    private LocalDate prazoLimite;
    private EnumStatus status;
    private Avaliacao avaliacao;
    private Anotacao anotacao;

    public Modulo(Trilha trilha, String nome, String habilidades, String tarefaValidacao) {
        this.id_Trilha = cont_id;
        this.trilha = trilha;
        this.nome = nome;
        this.habilidades = habilidades;
        this.tarefaValidacao = tarefaValidacao;
        this.status = EnumStatus.NAO_INICIADO;
        cont_id++;
    }
    public int getIdTrilha(){
        return this.id_Trilha;
    }

    public Trilha getTrilha() {
        return trilha;
    }

    public String getNome() {
        return nome;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public String getTarefaValidacao() {
        return tarefaValidacao;
    }

    public LocalDate getPrazoLimite() {
        return prazoLimite;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public Anotacao getAnotacao() {
        return anotacao;
    }

    public void setPrazoLimite(LocalDate prazoLimite){
        this.prazoLimite = prazoLimite;
    }

    public EnumStatus getStatus(){
        return this.status;
    }

    public void setStatus(EnumStatus status){
        this.status = status;
    }

    public void setAvaliacao(Avaliacao avaliacao){
        this.avaliacao = avaliacao;
    }
    public void setAnotacao(Anotacao anotacao){
        this.anotacao = anotacao;
    }
}
