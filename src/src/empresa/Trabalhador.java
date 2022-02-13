package empresa;

import curso.Anotacao;
import curso.Avaliacao;
import curso.Modulo;
import curso.Trilha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trabalhador {
    private static int cont_id = 1;

    private List<Trilha> trilhas = new ArrayList<>();
    private List<Modulo>modulos = new ArrayList<>();
    private List<Avaliacao>avaliacoes = new ArrayList<>();
    private List<Anotacao>anotacoes = new ArrayList<>();

    private int id_Trabalhador;
    private String nome;
    private String cpf;
    private Empresa empresa;
    private String setor;
    private String funcao;
    private LocalDate ultimaAlteracaoFuncao;

    public Trabalhador(String nome, String cpf, Empresa empresa, String setor,
                       String funcao, LocalDate ultimaAlteracaoFuncao) {
        this.id_Trabalhador = cont_id;
        this.nome = nome;
        this.cpf = cpf;
        this.empresa = empresa;
        this.setor = setor;
        this.funcao = funcao;
        this.ultimaAlteracaoFuncao = ultimaAlteracaoFuncao;
        cont_id++;
    }

    public List<Trilha> getTrilhas() {
        return Collections.unmodifiableList(trilhas);
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public int getId_Trabalhador(){
        return this.id_Trabalhador;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getSetor() {
        return setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public LocalDate getUltimaAlteracaoFuncao() {
        return ultimaAlteracaoFuncao;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
