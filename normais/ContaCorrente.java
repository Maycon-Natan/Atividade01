package normais;
import abstracts.Pessoa;
import excecoes.SaldoInsuficiente;
import interfaces.Conta;

public class ContaCorrente implements Conta {
    private String codConta;
    private Pessoa titular;
    private Gerente gerente;
    private double saldo;
    private Agencia agencia;

    public ContaCorrente(String codConta, Pessoa titular, Gerente gerente, double saldo) {
        this.codConta = codConta;
        this.titular = titular;
        this.gerente = gerente;
        this.saldo = saldo;
    }

    
    public String getAgencia() {
        return agencia.getCodAgencia();
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    
    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if(saldo < valor){
            throw new SaldoInsuficiente(saldo);
        }
        else
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getCodConta() {
        return codConta;
    }

    @Override
    public void setCodConta(String codConta) {
        this.codConta = codConta;
    }

    @Override
    public String toString() {
        return this.codConta;
    }


    @Override
    public Gerente getGerente() { 
        return gerente;
    }


    @Override
    public Pessoa getTitular() {
        return titular;
    }


    @Override
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;     
    }


    @Override
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    
}
