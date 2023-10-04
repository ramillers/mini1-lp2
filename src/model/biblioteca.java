package model;

public class biblioteca {
    protected String titulo;
    protected String autor;
    protected String resumo;
    protected String editora;
    protected int ano;
    protected int quantidadePaginas;
    protected String genero;

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

    public void cadastrarNoAcervo(){
        //TODO funcionalidade p/ cadastrar livros e revistas
    }

    public void consultarNoAcervo(){
        //TODO colocar sonulta por (título, autor e resumo) - informar palavra-chave a ser buscada
    }

    public void cadastrarUsuarios(){
        //TODO (criar usuário com nome, cpf, data de nascimento, indicador de adulto ou criança)
    }


    public void editarUsuario(){
        //TODO permitir editar campos de usuários
    }

    public void registrarMovimentacaoUsuario(){
        //TODO - Registrar o usuário que está fazendo a movimentação, assim como a data da mesma
        //TODO - Empréstimo de exemplar
    }

    public void emitirRelatorioEmprestimo(){

    }

    public void emitirRelatorioDevolucao(){

    }

    public void emitirRankingLeitura(){
        //TODO - Somente para usuários que forem crianças
        //TODO - Somente contar obras que o usuário afirmou ter lido
    }
}
