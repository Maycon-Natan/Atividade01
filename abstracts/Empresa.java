package abstracts;
import interfaces.PessoaJuridica;

public abstract class Empresa extends Pessoa implements PessoaJuridica {
    protected String cnpj, nomeEmpresa;

    public Empresa(String cnpj, String nomeEmpresa, String nome) {
        super(nome);
        this.cnpj = cnpj;
        this.nome = nomeEmpresa;
    }
    
    @Override
    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void setCnpj(String cnpj) {
        this.cnpj= cnpj;
    }

    @Override
    public String getNomeEmpresa() {
        return nome;
    }

    @Override
    public void setNomeEmpresa(String nome) {
        this.nome = nome;
    }
    
}
