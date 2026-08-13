package edu.confortin;

import java.time.LocalDate;

public class CodificadorAeO implements Codificador
{
    @Override
        public String getNome(){
        return("Substituicao de A(s) e O(s)");
        }

    @Override
        public LocalDate getDataCriacao(){
            return LocalDate.now(); //pega data no sistema op.(tenha o horario correto)
        }
    @Override
        public int getNivelSeguranca(){
            return 5;
        }
    @Override
        public String codifica(String str){
            if (str==null) return null;
            else {
                return  str.replace('O', '0')
                .replace('o', 'O')
                .replace('A', '1')
                .replace('a', '1');
            }
        }
    @Override
    public String decodifica(String str) {
        if (str == null) return null;
        return str.replace('0', 'o')
                  .replace('1', 'a');
    }
}
