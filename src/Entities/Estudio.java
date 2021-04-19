package Entities;

import org.jetbrains.annotations.NotNull;
import utils.Elenco;

import java.util.ArrayList;
import java.util.Arrays;

public class Estudio implements Elenco {
    private ArrayList<Funcionario> elenco;
    private Filme filme;
    private String[] trilha_sonora;

    public Estudio () {}

    public Estudio (Filme filme) {
        this.filme = filme;
    }

    public void addTrilhaSonora (String[] trilha_sonora) {
        this.trilha_sonora = trilha_sonora;
    }

    public void addFilme (Filme filme) {
        this.filme = filme;
    }
    @Override
    public void AdicionaElenco(@NotNull ArrayList<Funcionario> elenco) {
        this.elenco = elenco;
        for (Funcionario funcionario : elenco) {
            funcionario.addFilme(this.filme);
        }
    }
    @Override
    public String ElencoDoFilme() {
        Funcionario[] funcionarios = getElenco();
        return Arrays.toString(funcionarios);
    }

    private Funcionario[] getElenco () {
        Funcionario[] funcionarios = new Funcionario[this.elenco.size()];
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = this.elenco.get(i);
        }
        return funcionarios;
    }

    @Override
    public String toString() {
        return this.filme.getNome_filme() + ", " + this.filme.getDiretor() + ", "
                + this.filme.getRoteirista() + ", " + ElencoDoFilme() + ", "
                + Arrays.toString(this.trilha_sonora) + ", " + this.filme.getAno();
    }
}
