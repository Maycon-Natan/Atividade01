package normais;

import java.util.ArrayList;

import abstracts.Pessoa;
import interfaces.Conta;
import interfaces.PessoaFisica;

public class Aluno extends Pessoa implements PessoaFisica{
    private String matricula, rg;

    public Aluno(String nome, String rg, String matricula) {
        super(nome);
        this.matricula = matricula;
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public ArrayList<Conta> getConta() {
        return super.getConta();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setConta(Conta conta) {
        super.setConta(conta);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public void setRg(String rg) {
        this.rg = rg;
    }
 
    @Override
    public String toString() {
        return this.nome;
    }  
    
}
