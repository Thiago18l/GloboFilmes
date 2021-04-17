package Entities;

import utils.Funcionario;

public class Pessoa extends Funcionario {

    public Pessoa(String nome, String profissao) {
        super(nome, profissao);
    }
    @Override
    public String filmografia() {
        return null;
    }
}
