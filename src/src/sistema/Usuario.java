package sistema;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private List<EnumPerfilAcesso> perfisAcesso = new ArrayList<>();
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public Usuario(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public List<EnumPerfilAcesso> getPerfisAcesso() {
        return perfisAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
