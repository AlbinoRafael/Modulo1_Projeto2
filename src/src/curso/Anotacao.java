package curso;

import empresa.Trabalhador;
import utils.Validacoes;

public class Anotacao {

    private static int cont_id = 1;
    private int id_Anotacao;
    private Trabalhador trabalhador;
    private Modulo modulo;
    private String anotacao;

    public Anotacao(Trabalhador trabalhador, Modulo modulo, String anotacao){
        this.id_Anotacao = cont_id;
        this.trabalhador = trabalhador;
        this.modulo = modulo;
        if(Validacoes.validaString(anotacao)){this.anotacao = anotacao;}else{throw new IllegalArgumentException("Anotação inválida!");}
        cont_id++;
    }

    public int getId_Anotacao() {return id_Anotacao;}

    public Trabalhador getTrabalhador() {return trabalhador;}

    public Modulo getModulo() {return modulo;}

    public String getAnotacao() {return anotacao;}

    public void setAnotacao(String anotacao){
        if(Validacoes.validaString(anotacao)) {
            this.anotacao = anotacao;
        }else{
            throw new IllegalArgumentException("Anotação inválida");
        }
    }

}
