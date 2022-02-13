package empresa;

import curso.Trilha;
import empresa.enumsempresa.EnumRegional;
import empresa.enumsempresa.EnumSegmento;
import utils.ValidaCPFeCNPJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
    private static int cont_id = 1;

    private List<Trilha> trilhas = new ArrayList<>();
    private int id_Empresa;
    private String nome;
    private String cnpj;
    private boolean eMatriz;
    private String nomeFilial;
    private EnumSegmento segmento;
    private String cidade;
    private String estado;
    private EnumRegional regional;

    public Empresa(String nome, String cnpj, String cidade, String estado, EnumRegional regional, boolean eMatriz, EnumSegmento segmento) {
        this.id_Empresa=cont_id;
        if (validaNome(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (ValidaCPFeCNPJ.validarCNPJ(cnpj)) {
            this.cnpj = cnpj;
        } else {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        if (validaCidade(cidade)) {
            this.cidade = cidade;
        } else {
            throw new IllegalArgumentException("Cidade inválido");
        }
        if (validaEstado(estado)) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido");
        }
        this.regional = regional;
        this.eMatriz = eMatriz;
        this.segmento = segmento;
        cont_id++;
    }

    public int getId_Empresa(){
        return this.id_Empresa;
    }

    public List<Trilha> getTrilhas() {
        return Collections.unmodifiableList(trilhas);
    }

    public void adicionaTrilha(Trilha trilha) {
        this.trilhas.add(trilha);
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public boolean eMatriz() {
        return eMatriz;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public EnumRegional getRegional() {
        return regional;
    }

    private boolean validaNome(String nome) {
        return !nome.isEmpty() && !nome.isBlank() && nome != null;
    }

    private boolean validaCidade(String cidade) {
        return !cidade.isEmpty() && !cidade.isBlank() && cidade != null;
    }

    private boolean validaEstado(String estado) {
        return !estado.isEmpty() && !cidade.isBlank() && nome != null && estado.length() == 2;
    }
}
