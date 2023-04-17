package normais;

import java.util.ArrayList;

import abstracts.Empresa;
import interfaces.Conta;

public class Banco extends Empresa {
    private Agencia agencia;

    public Banco(String cnpj, String nomeEmpresa, String nome) {
        super(cnpj, nomeEmpresa, nome);
    }
    
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    

    @Override
    public String getCnpj() {
        return super.getCnpj();
    }

    @Override
    public String getNomeEmpresa() {
        return super.getNomeEmpresa();
    }

    @Override
    public void setCnpj(String cnpj) {
        super.setCnpj(cnpj);
    }

    @Override
    public void setNomeEmpresa(String nomeEmpresa) {
        super.setNomeEmpresa(nomeEmpresa);
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
