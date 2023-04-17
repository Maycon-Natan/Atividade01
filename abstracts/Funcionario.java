package abstracts;

import interfaces.PessoaFisica;

public abstract class Funcionario extends Pessoa implements PessoaFisica {

    private String rg;

    public Funcionario(String nome, String rg) {
        super(nome);
        this.rg = rg;        
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public void setRg(String rg) {
        this.rg = rg;   
    }
    
}
