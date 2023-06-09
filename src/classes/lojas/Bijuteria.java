package classes.lojas;

import classes.*;

public class Bijuteria extends Loja {
    double metaVendas;

    public Bijuteria(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int i, int quantMaximaProdutos){
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaximaProdutos);
        this.metaVendas = i;
    }

    public double getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString(){
        return "A loja de bijuteria " + this.nome + " tem uma meta de vendas de " + this.metaVendas + " com " + this.quantidaDeFuncionarios + 
        " funcionarios com salario base de " + this.salarioBaseFuncionario  + " e estoque de produtos de " + estoqueProdutos + 
        ". Foi fundada em " + this.dataFundacao + " e esta localizada em " + this.endereco;
    }
}
