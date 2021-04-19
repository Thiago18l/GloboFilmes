package Entities;

public class Filme {

    private int ano;
    private String nome_filme;
    private String diretor;
    private String roteirista;

    public Filme (String nome_filme, String diretor, String roteirista, int ano) {
        this.ano = ano;
        this.nome_filme = nome_filme;
        this.diretor = diretor;
        this.roteirista = roteirista;
    }

    public int getAno() {
        return ano;
    }

    public String getNome_filme() {
        return nome_filme;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getRoteirista() {
        return roteirista;
    }
    @Override
    public String toString() {
        return "" + nome_filme + ", " + ano + ", DIRETOR: " + diretor + ", ROTEIRISTA: " + roteirista;
    }
}
