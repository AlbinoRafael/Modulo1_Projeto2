package utils;

public class Validacoes {

    public static boolean validarCPF(String cpf) {
        return cpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
    }

    public static boolean validarCNPJ(String cnpj) {
        return cnpj.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}");
    }

    public static boolean validaString(String nome) {
        return !nome.isEmpty() && !nome.isBlank() && nome != null;
    }
}
