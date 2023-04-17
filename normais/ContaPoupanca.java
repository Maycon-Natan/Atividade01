package normais;
import abstracts.Pessoa;
import excecoes.SaldoInsuficiente;
import interfaces.Conta;

public class ContaPoupanca implements Conta {
    private String codConta;
    private Pessoa titular;
    private Gerente gerente;
    private double saldo;
    private Agencia agencia;
    private float rendimento;


    public ContaPoupanca(String codConta, Pessoa titular, Gerente gerente, double saldo) {
        this.codConta = codConta;
        this.titular = titular;
        this.gerente = gerente;
        this.saldo = saldo;
        
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    
    public String getAgencia() {
        return agencia.getCodAgencia();
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.saldo = this.saldo * rendimento;
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
        this.codConta= codConta;
    }

    @Override
    public String toString() {
        return this.codConta;
    }



    
}
