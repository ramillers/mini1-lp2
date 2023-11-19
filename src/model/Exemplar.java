package model;
public abstract class Exemplar {
    protected String titulo;
    protected String autor;
    protected String resumo;
    protected String editora;
    protected int ano;
    protected int quantidadePaginas;
    protected String genero;

    public Exemplar(String titulo, String autor, String resumo, String editora, int ano, int quantidadePaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.resumo = resumo;
        this.editora = editora;
        this.ano = ano;
        this.quantidadePaginas = quantidadePaginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.titulo = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
