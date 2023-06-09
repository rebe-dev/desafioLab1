package classes;

public class Bijuteria extends Loja {
    double metaVendas;

    public Bijuteria(Double metaVendas, String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString(){
        return "A loja de bijuteria " + this.nome + " tem uma meta de vendas de " + this.metaVendas + " com " + this.quantidaDeFuncionarios + " funcionarios com salario base de " + this.salarioBaseFuncionario + ". Foi fundada em " + this.dataFundacao + " e esta localizada em " + this.endereco;
    }
}
