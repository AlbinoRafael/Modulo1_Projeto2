package curso;

import curso.enumscurso.EnumSatisfacao;
import empresa.Empresa;
import utils.Validacoes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trilha {

    private int id;
    private List<Modulo> modulos = new ArrayList<>();
    private Empresa empresa;
    private String ocupacao;
    private String nome;
    private String apelido;
    private EnumSatisfacao satisfacao;
    private Anotacao anotacao;

    public Trilha(Empresa empresa, String ocupacao) {
        this.empresa = empresa;
        if (Validacoes.validaString(ocupacao)) {
            this.ocupacao = ocupacao;
        } else {
            throw new IllegalArgumentException("Ocupação inválida!");
        }
        this.id = contador();
        this.nome = setNome();
        this.apelido = setApelido();
    }

    public List<Modulo> getModulos() {
        return Collections.unmodifiableList(modulos);
    }

    public void adicionaModulo(Modulo modulo) {
        this.modulos.add(modulo);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public String getNome() {
        return nome;
    }

    private String setNome() {
        String nome = "";
        if (empresa.eMatriz()) {
            nome = ocupacao + empresa.getNome() + id + LocalDate.now().getYear();
        } else {
            nome = ocupacao + empresa.getNomeFilial() + id + LocalDate.now().getYear();
        }
        return nome.replace(" ", "");
    }

    public String getApelido() {
        return apelido;
    }

    private String setApelido() {
        return (ocupacao + id).replace(" ", "");
    }

    public EnumSatisfacao getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(EnumSatisfacao satisfacao) {
        this.satisfacao = satisfacao;
    }

    public Anotacao getAnotacao() {
        return anotacao;
    }

    private int contador() {
        if (empresa.getTrilhas().isEmpty()) {
            return 1;
        } else {
            for (Trilha trilha : empresa.getTrilhas()) {
                if (trilha.getOcupacao().equals(this.getOcupacao())) {
                    return (empresa.getTrilhas().get(empresa.getTrilhas().size() - 1).getId() + 1);
                } else {
                    return 1;
                }
            }
        }
        return 1;
    }
}
