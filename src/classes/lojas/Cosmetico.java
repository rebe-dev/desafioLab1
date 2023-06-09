package classes.lojas;

import classes.*;

public class Cosmetico extends Loja {
    double taxaComercializacao;

    public Cosmetico(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantMaximaProdutos){
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString(){
        return "A loja de cosmeticos " + this.nome + " com taxa de comercialização " + this.taxaComercializacao + 
        " tem " + this.quantidaDeFuncionarios + " funcionarios com salario base de " + this.salarioBaseFuncionario  + " e estoque de produtos de " + estoqueProdutos
        + ". Foi fundada em " + this.dataFundacao + " e esta localizada em " + this.endereco;
    }
}
