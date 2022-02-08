import java.io.*;
import java.util.*;

public class TESTE {

    public static void main(String[] args) throws FileNotFoundException {
    listaEnum();
    }

    public static void listaEnum() throws FileNotFoundException {
        File file = new File("C:/Users/fael_/Desktop/CIDADES.TXT");
        Scanner sc = new Scanner(file);
        Set<String> cidades = new HashSet<>();
        while(sc.hasNextLine()){
            String cidade = sc.nextLine();
            cidades.add(cidade);
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/fael_/Desktop/CIDADES_ENUMS.TXT",false))){
            for(String c:cidades) {
                bw.write(c.trim().toUpperCase(Locale.ROOT)+"(\""+c+"\")"+",");
                bw.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
