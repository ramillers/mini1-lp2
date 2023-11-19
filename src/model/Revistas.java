package model;

public class Revistas extends Exemplar {
    private int volume;
    private String mesPublicacao;

    public Revistas(String titulo, String autor, String resumo, String editora, int ano, int quantidadePaginas, String genero) {
        super(titulo, autor, resumo, editora, ano, quantidadePaginas, genero);
    }
}
