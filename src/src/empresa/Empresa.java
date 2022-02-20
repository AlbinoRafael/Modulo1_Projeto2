package empresa;

import curso.Trilha;
import empresa.enumsempresa.EnumRegional;
import empresa.enumsempresa.EnumSegmento;
import utils.Validacoes;

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

    public Empresa(String nome, String nomeFilial, String cnpj, String cidade, String estado, EnumRegional regional, boolean eMatriz, EnumSegmento segmento) {
        this.id_Empresa = cont_id;
        if (eMatriz) {
            if (Validacoes.validaString(nome)) {
                this.nome = nome;
                this.nomeFilial = "";
            } else {
                throw new IllegalArgumentException("Nome inválido");
            }
        } else {
            if (Validacoes.validaString(nomeFilial)) {
                this.nomeFilial = nomeFilial;
                this.nome = "";
            } else {
                throw new IllegalArgumentException("Nome da filial inválido");
            }
        }
        if (Validacoes.validarCNPJ(cnpj)) {
            this.cnpj = cnpj;
        } else {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        if (Validacoes.validaString(cidade)) {
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

    public int getId_Empresa() {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void seteMatriz(boolean eMatriz) {
        this.eMatriz = eMatriz;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public void setSegmento(EnumSegmento segmento) {
        this.segmento = segmento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRegional(EnumRegional regional) {
        this.regional = regional;
    }

    private boolean validaEstado(String estado) {
        return Validacoes.validaString(estado) && estado.length() == 2;
    }


}
