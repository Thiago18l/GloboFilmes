package Entities;

import utils.Filmografia;
import utils.Profissoes;

import java.util.ArrayList;
import java.util.Arrays;

public class Funcionario implements Filmografia {
    private ArrayList<Filme> filmes_participados = new ArrayList<>();
    private ArrayList<Profissoes> profissoes = new ArrayList<>();
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void addProfissao (Profissoes profissao) {
        this.profissoes.add(profissao);
    }

    public String getNome() {
        return nome;
    }

    public void addFilme (Filme filme) {
        this.filmes_participados.add(filme);
    }

    @Override
    public String filmografia() {
        Filme[] filmes = getFilmesParticipados();
        Profissoes[] profissoes = getProfissoes();
        return "Filmes participados: " + Arrays.toString(filmes)
                + " Profissao: " + Arrays.toString(profissoes);
    }


    private Filme[] getFilmesParticipados () {
        Filme[] filmes = new Filme[filmes_participados.size()];
        for (int i = 0; i < filmes.length; i++) {
            filmes[i] = filmes_participados.get(i);
        }
        return filmes;
    }

    private Profissoes[] getProfissoes () {
        Profissoes[] funcoes = new Profissoes[profissoes.size()];
        for (int i = 0; i < funcoes.length; i++) {
            funcoes[i] = profissoes.get(i);
        }
        return funcoes;
    }
    @Override
    public String toString() {
        Profissoes[] profissoes = getProfissoes();
        return this.nome + "" + Arrays.toString(profissoes);
    }
}
