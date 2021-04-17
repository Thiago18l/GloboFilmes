package utils;

public abstract class Funcionario implements Filmografia {
    private String name;
    private String profissao;
    public Funcionario (String name, String profissao) {
        this.name = name;
        this.profissao = profissao;
    }
    public abstract String filmografia();
}
