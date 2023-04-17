package abstracts;
import java.util.ArrayList;

import interfaces.Conta;


public abstract class Pessoa {
    protected String nome;
    private ArrayList<Conta> contas = new ArrayList();
    
    public Pessoa(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getConta() {
        return contas;
    }

    public void setConta(Conta conta) {
        contas.add(conta);
    }
    
}