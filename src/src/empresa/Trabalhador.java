package empresa;

import curso.Modulo;
import curso.Trilha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trabalhador {

    private List<Trilha> trilhas = new ArrayList<>();
    private String nome;
    private String cpf;
    private Empresa empresa;
    private String setor;
    private String funcao;
    private LocalDate ultimaAlteracaoFuncao;

    public Trabalhador(String nome, String cpf, Empresa empresa, String setor,
                       String funcao, LocalDate ultimaAlteracaoFuncao) {
        this.nome = nome;
        this.cpf = cpf;
        this.empresa = empresa;
        this.setor = setor;
        this.funcao = funcao;
        this.ultimaAlteracaoFuncao = ultimaAlteracaoFuncao;
    }

    public List<Trilha> getTrilhas() {
        return trilhas;
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
}
