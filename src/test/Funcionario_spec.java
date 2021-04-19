package test;

import Entities.Estudio;
import Entities.Filme;
import Entities.Funcionario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.Profissoes;

import java.util.ArrayList;

public class Funcionario_spec {

    Funcionario liminha = new Funcionario("Liminha");
    Funcionario Tiazinha = new Funcionario("Tiazinha");
    Funcionario fulano = new Funcionario("FULANO");
    Funcionario joaozin = new Funcionario("JOAOZIN");
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    Estudio projac;
    Filme Logan;
    @Before
    public void instanciaEstudio() {
        Logan = new Filme("LOGAN", fulano.getNome(), joaozin.getNome(), 2018);
        projac = new Estudio(Logan);
        liminha.addProfissao(Profissoes.ATOR);
        liminha.addProfissao(Profissoes.CINEGRAFISTA);
        Tiazinha.addProfissao(Profissoes.ATOR);
        funcionarios.add(liminha);
        funcionarios.add(Tiazinha);
        projac.AdicionaElenco(funcionarios);
    }
    @Test
    public void testFilmografia () {
        String expected = "Filmes participados: [LOGAN, 2018, DIRETOR: FULANO, ROTEIRISTA: JOAOZIN] Profissao: [ATOR, CINEGRAFISTA]";
        String expected2 = "Filmes participados: [LOGAN, 2018, DIRETOR: FULANO, ROTEIRISTA: JOAOZIN] Profissao: [ATOR]";
        Assert.assertEquals(expected, liminha.filmografia());
        Assert.assertEquals(expected2, Tiazinha.filmografia());
    }
}
