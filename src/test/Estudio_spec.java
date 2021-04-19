package test;

import Entities.Estudio;
import Entities.Filme;
import Entities.Funcionario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.Profissoes;

import java.util.ArrayList;

public class Estudio_spec {
    Estudio estudio = new Estudio();
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    Funcionario mario = new Funcionario("MARIO");
    Funcionario raimundo = new Funcionario("raimundo");
    Filme mulher_maravilha = new Filme("Mulher Maravilha", mario.getNome(), raimundo.getNome(), 2019);

    @Before
    public void adicionaCaracteristicas () {
        String[] musicas = new String[1];
        musicas[0] = "Tapão na Raba";
        mario.addProfissao(Profissoes.DIRETOR);
        raimundo.addProfissao(Profissoes.ROTEIRISTA);
        raimundo.addProfissao(Profissoes.CAMERA);
        estudio.addFilme(mulher_maravilha);
        Funcionario rafa = new Funcionario("Rafaela");
        Funcionario joao = new Funcionario("João");
        rafa.addProfissao(Profissoes.ATOR);
        joao.addProfissao(Profissoes.CAMERA);
        joao.addProfissao(Profissoes.CINEGRAFISTA);
        funcionarios.add(rafa);
        funcionarios.add(joao);
        estudio.AdicionaElenco(funcionarios);
        estudio.addTrilhaSonora(musicas);
    }
    @Test
    public void getElenco () {
        String expected = "[Rafaela[ATOR], João[CAMERA, CINEGRAFISTA]]";
        Assert.assertEquals(expected, estudio.ElencoDoFilme());
    }
    @Test
    public void CaracteristicasDoFilme () {
        String expected = "Mulher Maravilha, MARIO, raimundo, [Rafaela[ATOR], João[CAMERA, CINEGRAFISTA]], [Tapão na Raba], 2019";
        Assert.assertEquals(expected, estudio.toString());
    }
}
