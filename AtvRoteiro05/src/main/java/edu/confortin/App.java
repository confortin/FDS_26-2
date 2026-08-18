package edu.confortin;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Codificador cod = null;

        // Menu de opções
        System.out.println("Selecione o Codificador que deseja utilizar:");
        System.out.println("1 - Codificador AeO");
        System.out.println("2 - Codificador Simples");
        System.out.println("3 - Codificador Simples Dois");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        // Switch case para instanciar o codificador escolhido
        switch (opcao) {
            case 1:
                cod = new CodificadorAeO();
                break;
            case 2:
                cod = new CodificadorSimples();
                break;
            case 3:
                cod = new CodificadorSimplesDois();
                break;
            default:
                System.out.println("Opção inválida! Encerrando o programa.");
                scanner.close();
                return; // Encerra a execução caso a opção seja inválida
        }

        // Executa a rotina normal com o codificador instanciado
        System.out.println("\n--- Informações do Codificador ---");
        System.out.println("Codificador: " + cod.getNome());
        System.out.println("Versao: " + cod.getDataCriacao());
        System.out.println("Nivel de segurança: " + cod.getNivelSeguranca());

        String texto = "Este e o string a ser codificado";
        System.out.println("\n--- Processamento ---");
        System.out.println("Texto original: " + texto);

        String codificado = cod.codifica(texto);
        System.out.println("Texto codificado: " + codificado);

        String decodificado = cod.decodifica(codificado);
        System.out.println("Texto decodificado: " + decodificado);

        scanner.close();
    }
}
