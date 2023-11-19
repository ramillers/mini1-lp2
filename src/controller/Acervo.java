package controller;

import java.util.ArrayList;

public class Acervo {
    //colocar as funções
    private static ArrayList<Acervo> acervo = new ArrayList<>();

    public static void cadastrarNoAcervo(String titulo, String autor, String resumo, String editora, int ano, int quantidadePaginas, String genero) {
        Acervo novo = new Acervo();
        acervo.add(novo); // Adiciona o novo livro à lista 'acervo'
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

