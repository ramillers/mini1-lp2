package view;

import model.*;
import controller.*;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int opcao, ano, quantidadePaginas;
        String titulo, autor, resumo, editora, genero;
        Acervo bibilioteca = new Acervo();
        while (loop) {
            System.out.println("ESCOLHA SUA OPÇÃO:");
            System.out.println("1.");
            System.out.println("2.");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Título: ");
                    scanner.nextLine();
                    titulo = scanner.nextLine();
                    System.out.println("Autor: ");
                    autor = scanner.nextLine();
                    System.out.println("Resumo: ");
                    resumo = scanner.nextLine();
                    System.out.println("Editora: ");
                    editora = scanner.nextLine();
                    System.out.println("Gênero: ");
                    genero = scanner.nextLine();
                    System.out.println("Ano de Lançamento: ");
                    ano = scanner.nextInt();
                    System.out.println("Quantidade de páginas: ");
                    quantidadePaginas = scanner.nextInt();
                    Acervo.cadastrarNoAcervo(titulo, autor, resumo, editora, ano, quantidadePaginas, genero);
                    break;
            }
        }
    }
}