package curso;

import empresa.Trabalhador;

public class Avaliacao {
    private static int cont_id = 1;
    private int id_Avaliacao;
    private Trabalhador trabalhador;
    private Modulo modulo;
    private double nota;

    public Avaliacao(Trabalhador trabalhador, Modulo modulo, double nota) {
        this.id_Avaliacao = cont_id;
        this.trabalhador = trabalhador;
        this.modulo = modulo;
        if (validaNota(nota)) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("Nota inválida!");
        }
        cont_id++;
    }

    public int getId_Avaliacao() {
        return this.id_Avaliacao;
    }

    public Trabalhador getTrabalhador() {
        return this.trabalhador;
    }

    public Modulo getModulo() {
        return this.modulo;
    }

    public double nota() {
        return this.nota;
    }

    private boolean validaNota(double nota) {
        return nota >= 0 && nota < 1000;
    }
}
