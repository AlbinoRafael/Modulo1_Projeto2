package utils;

import java.util.ArrayList;
import java.util.List;

//Validação para ver se o CPF existe, e se é válido
//Esta classe não foi utilizada no projeto, porém foi deixada por motivos de estudo

public class ValidaCPF {

    public static boolean validaCPF(String cpf) {
        boolean primeiroDigitoEValido =false;
        boolean segundoDigitoEValido = false;
        String cpfSoNumeros = cpf.replaceAll("[.-]", "");
        char[] numerosCpf = cpfSoNumeros.toCharArray();
        int cont = 1;
        for (int i = 0; i < numerosCpf.length - 1; i++) {
            if (numerosCpf[i] == numerosCpf[i + 1]) {
                cont++;
            }
        }
        if (cont == numerosCpf.length) {
            return false;
        }
        List<Integer> numeros = new ArrayList<>();
        for (char c : numerosCpf) {
            numeros.add(Character.getNumericValue(c));
        }
        List<Integer> numerosVerificacaoD1 = new ArrayList<>();
        int contD1 = 0;
        for (int i = 10; i > 1; i--) {
            numerosVerificacaoD1.add(numeros.get(contD1)* i);
            contD1++;
        }
        int somaDigito1 = numerosVerificacaoD1.stream().limit(9).reduce(0, (a, b) -> a + b);
        int verificacaoSomaD1 = (somaDigito1*10)%11;
        if(verificacaoSomaD1>9){
            verificacaoSomaD1=0;
        }
        if(verificacaoSomaD1==numeros.get(9)){
            primeiroDigitoEValido=true;
        }
        List<Integer> numerosVerificacaoD2 = new ArrayList<>();
        int contD2 = 0;
        for (int i = 11; i > 1; i--) {
            numerosVerificacaoD2.add(numeros.get(contD2)* i);
            contD2++;
        }
        int somaDigito2 = numerosVerificacaoD2.stream().limit(10).reduce(0, (a, b) -> a + b);
        int verificacaoSomaD2 = (somaDigito2*10)%11;
        if(verificacaoSomaD2>9){
            verificacaoSomaD2=0;
        }
        if(verificacaoSomaD2 == numeros.get(10)){
            segundoDigitoEValido=true;
        }
        boolean eValido = false;
        if(primeiroDigitoEValido&&segundoDigitoEValido){
            eValido=true;
        }
        return eValido;
    }
}
