import java.time.LocalDate; //chamada para horarios

public class CodificadorSimplesDois implements Codificador{
    public String getNome(){
        return "Codificador Dois";
    }

    public LocalDate getData(){
        return LocalDate.now();
    }

    public int nivelSeguranca(){
        return 1;
    }

    public String codifica(String a){
        String saida = a.toLowerCase();
        System.out.println(a);
    }
    public String descodifica(String a){
        String saida = a.toLowerCase();
        System.out.println(a);
    }

}
