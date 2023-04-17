package interfaces;

import abstracts.Pessoa;
import normais.Agencia;
import normais.Gerente;

public interface Conta {
    public void depositar(double valor);
    public void sacar(double valor) throws Exception;
    public double getSaldo();
    
    public String getCodConta();
    public void setCodConta(String codC);

    public Pessoa getTitular();
    public void setTitular(Pessoa titular);

    public Gerente getGerente();
    public void setGerente(Gerente gerente);

    public String getAgencia();
    public void setAgencia(Agencia agencia);


}
