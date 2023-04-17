package normais;

import java.util.ArrayList;

import abstracts.Funcionario;
import genericos.Fila;
import interfaces.Conta;

public class Professor extends Funcionario{

    private String matricula;
    private Fila<Aluno> fila= new Fila();

    public Professor(String nome, String rg, String matricula) {
        super(nome, rg);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void agendarAluno(Aluno aluno) {
        fila.enfileirar(aluno);
    }
    public void atenderAluno(){
        fila.encerrarAtendimento();
    }
    
    public Fila<Aluno> getFila() {
        return fila;
    }

    @Override
    public String getRg() {
        return super.getRg();
    }

    @Override
    public void setRg(String rg) {
        super.setRg(rg);
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
    public String toString() {
        return this.nome;
    }    
    
}
