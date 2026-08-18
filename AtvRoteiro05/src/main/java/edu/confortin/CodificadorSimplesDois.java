package edu.confortin;

import java.time.LocalDate;

public class CodificadorSimplesDois implements Codificador {


    public String getNome() {
        return "Codificador Dois";
    }


    public LocalDate getDataCriacao() {
        return LocalDate.now();
    }


    public int getNivelSeguranca() {
        return 1;
    }


    public String codifica(String a) {
        String saida = a.toLowerCase();
        return saida;
    }


    public String decodifica(String a) {
        String saida = a.toLowerCase();
        return saida;
    }
}
