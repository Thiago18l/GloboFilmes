package test;

import Entities.Filme;
import Entities.Funcionario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Filme_spec {
    Funcionario fulano = new Funcionario("FULANO");
    Funcionario joaozin = new Funcionario("JOAOZIN");
    Filme Logan = new Filme("LOGAN", fulano.getNome(), joaozin.getNome(), 2018);

    @Test
    public void testDadosDoFilme() {
        String expected = "LOGAN, 2018, DIRETOR: FULANO, ROTEIRISTA: JOAOZIN";
        Assert.assertEquals(expected, Logan.toString());
    }
}
