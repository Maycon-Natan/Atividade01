package normais;

import java.util.ArrayList;

import abstracts.Funcionario;
import genericos.Fila;
import interfaces.Conta;
import interfaces.Secretaria;

public class SecAcademica extends Funcionario implements Secretaria {
    private int codSecretaria;
    private Fila<Aluno> fila = new Fila();

    public SecAcademica(String nome, String rg, int codSecretaria) {
        super(nome, rg);
        this.codSecretaria = codSecretaria;
    }

    public Fila<Aluno> getFila() {
        return fila;
    }
    public void agendarAluno(Aluno aluno){
        fila.enfileirar(aluno);
    }
    public void atenderAluno(){
        fila.encerrarAtendimento();
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
    public int getCodSecretaria() {
        return codSecretaria;
    }

    @Override
    public void setCodSecretaria(int num) {
        this.codSecretaria = num;        
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}