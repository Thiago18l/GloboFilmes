import Entities.Estudio;
import Entities.Filme;
import Entities.Funcionario;
import utils.Profissoes;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario mario = new Funcionario("MARIO");
        Funcionario raimundo = new Funcionario("raimundo");
        mario.addProfissao(Profissoes.DIRETOR);
        mario.addProfissao(Profissoes.CAMERA);
        raimundo.addProfissao(Profissoes.ROTEIRISTA);
        Filme mulher_maravilha = new Filme("Mulher Maravilha", mario.getNome(), raimundo.getNome(), 2019);

        String[] trilha = new String[2];
        trilha[0] = "Titanic";
        trilha[1] = "Tapão na Raba";
        Funcionario rafa = new Funcionario("Rafaela");
        rafa.addProfissao(Profissoes.ATOR);
        funcionarios.add(rafa);
        Estudio projac = new Estudio(mulher_maravilha);
        projac.AdicionaElenco(funcionarios);
        projac.addTrilhaSonora(trilha);

        System.out.println(rafa.filmografia());
        System.out.println(projac);
    }
}
