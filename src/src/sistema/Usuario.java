package sistema;

import utils.ValidaCPFeCNPJ;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private static int cont_id = 1;

    private Set<EnumPerfilAcesso> perfisAcesso = new HashSet<>(3);
    private int id_Usuario;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public Usuario(String nome, String cpf, String email, String senha) {
        this.id_Usuario = cont_id;
        if (validaNome(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (ValidaCPFeCNPJ.validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (validaEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
        if (validaSenha(senha)) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Senha inválida");
        }
        cont_id++;
    }

    public Set<EnumPerfilAcesso> getPerfisAcesso() {
        return perfisAcesso;
    }

    public int getId_Usuario(){
        return this.id_Usuario;
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

    public void setNome(String nome) {
        if (validaNome(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public void setCpf(String cpf) {
        if (ValidaCPFeCNPJ.validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public void setEmail(String email) {
        if (validaEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public void setSenha(String senha) {
        if (validaSenha(senha)) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Senha inválida");
        }
    }

    private boolean validaNome(String nome) {
        return !nome.isEmpty() && !nome.isBlank() && nome != null;
    }

    private boolean validaEmail(String email) {
        return email.matches("^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
    }

    private boolean validaSenha(String senha) {
        return senha.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$") && senha.length() >= 8;
    }
}
