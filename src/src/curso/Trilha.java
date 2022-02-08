package curso;

import curso.enumscurso.EnumSatisfacao;
import empresa.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Trilha {

    private List<Modulo> modulos = new ArrayList<>();
    private Empresa empresa;
    private String ocupacao;
    private String nome;
    private String apelido;
    private EnumSatisfacao satisfacao;
    private String anotacao;

    public Trilha(Empresa empresa, String ocupacao, String nome, String apelido) {
        this.empresa = empresa;
        this.ocupacao = ocupacao;
        this.nome = nome;
        this.apelido = apelido;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public EnumSatisfacao getSatisfacao() {
        return satisfacao;
    }

    public String getAnotacao() {
        return anotacao;
    }
}
