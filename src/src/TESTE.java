import curso.Trilha;
import empresa.Empresa;
import empresa.enumsempresa.EnumRegional;
import empresa.enumsempresa.EnumSegmento;

public class TESTE {

    public static void main(String[] args){
        //System.out.println(ValidaCPFeCNPJ.validarCPF("000.000.000-00"));
        //System.out.println(ValidaCPFeCNPJ.validarCNPJ("00.000.000/0000-00"));
        //System.out.println(Usuario.validaEmail("email@email.com"));
        //try {
        //    Usuario usuario = new Usuario("Jose da Silva","123.123.123-35","laksdjksjdg.@alsdgkjalsdkgj.caom","aaaaaaaaaa1");
        //    System.out.println(usuario);
        //}catch (IllegalArgumentException e){
        //    System.err.println(e.getMessage());
        //}
        Empresa empresa = new Empresa("Senai","00.000.000/0000-00","Tubarão","SC",
                EnumRegional.SUL, true, EnumSegmento.IND_DIVERSA);
        Trilha trilha = new Trilha(empresa,"Pedreiro");
        empresa.adicionaTrilha(trilha);
        Trilha trilha2 = new Trilha(empresa, "Pedreiro");
        empresa.adicionaTrilha(trilha2);
        Trilha trilha3 = new Trilha(empresa,"Mestre de obras");
        empresa.adicionaTrilha(trilha3);
        Trilha trilha4 = new Trilha(empresa,"Engenheiro");
        empresa.adicionaTrilha(trilha4);
        empresa.getTrilhas().stream().forEach(t->System.out.println(t.getApelido()));
    }
}
