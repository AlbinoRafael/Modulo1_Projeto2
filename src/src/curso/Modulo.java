package curso;

import curso.enumscurso.EnumStatus;
import utils.Validacoes;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Modulo {
    private static int cont_id = 1;

    private int id_Trilha;
    private Trilha trilha;
    private String nome;
    private String habilidades;
    private String tarefaValidacao;
    private OffsetDateTime dataInicio;
    private OffsetDateTime dataFim;
    private int diasPrazoLimite;
    private OffsetDateTime prazoLimite;
    private EnumStatus status;
    private boolean avaliacaoDisponivel;
    private Avaliacao avaliacao;
    private Anotacao anotacao;

    public Modulo(Trilha trilha, String nome, String habilidades, String tarefaValidacao, int prazoLimite) {
        this.id_Trilha = cont_id;
        this.trilha = trilha;
        if (Validacoes.validaString(nome)) {
            this.nome = nome;
        }
        if (Validacoes.validaString(habilidades)) {
            this.habilidades = habilidades;
        }
        if (Validacoes.validaString(tarefaValidacao)) {
            this.tarefaValidacao = tarefaValidacao;
        }
        if (prazoLimite >= 10) {
            this.diasPrazoLimite = prazoLimite;
        } else {
            throw new IllegalArgumentException("Prazo inválido");
        }
        this.status = EnumStatus.NAO_INICIADO;
        cont_id++;
    }

    public int getIdTrilha() {
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

    public OffsetDateTime getDataInicio() {
        return this.dataInicio;
    }

    public OffsetDateTime getDataFim() {
        return this.dataFim;
    }

    public OffsetDateTime getPrazoLimite() {
        return prazoLimite;
    }

    public boolean isAvaliacaoDisponivel() {
        return avaliacaoDisponivel;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public Anotacao getAnotacao() {
        return anotacao;
    }

    public void setPrazoLimite(int prazoLimite) {
        if (this.dataInicio != null) {
            this.prazoLimite = this.dataInicio.plusDays(this.diasPrazoLimite);
        } else {
            throw new IllegalArgumentException("Prazo inválido!");
        }
    }

    public EnumStatus getStatus() {
        return this.status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setAnotacao(Anotacao anotacao) {
        this.anotacao = anotacao;
    }
    public void disponibilizaAvaliacao(){
        this.avaliacaoDisponivel = this.status.equals(EnumStatus.AVALIANDO);
    }
}
