package empresa;

import curso.Trilha;
import empresa.enumsempresa.EnumEstado;
import empresa.enumsempresa.EnumRegional;
import empresa.enumsempresa.EnumTipo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {

    private List<Trilha> trilhas = new ArrayList<>();
    private String nome;
    private String cnpj;
    private EnumTipo tipo;
    private String nomeFilial;
    private String cidade;
    private EnumEstado estado;
    private EnumRegional regional;

    public Empresa(String nome, String cnpj, EnumTipo tipo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipo = tipo;
    }

    public List<Trilha> getTrilhas() {
        return Collections.unmodifiableList(trilhas);
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public EnumTipo getTipo() {
        return tipo;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public String getCidade() {
        return cidade;
    }

    public EnumEstado getEstado() {
        return estado;
    }

    public EnumRegional getRegional() {
        return regional;
    }
}
