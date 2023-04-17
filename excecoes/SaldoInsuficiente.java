package excecoes;

public class SaldoInsuficiente extends Exception {
    private double valor;

    public SaldoInsuficiente(double valor){
        this.valor= valor;
        System.out.println("Saldo insuficiente para saque! \nSaldo atual:" +valor);
    }
    
    public double getValor(){
        return valor;
    }
}
