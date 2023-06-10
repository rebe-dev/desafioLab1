package classes.lojas;

import classes.*;

public class Informatica extends Loja {
    double seguroEletronicos;

    public Informatica(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantMaximaProdutos){
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString(){
        return "A loja de eletronicos " + this.nome + " com seguro de lojas eletronicas de  " + this.seguroEletronicos + " com " + this.quantidaDeFuncionarios + 
        " funcionarios com salario base de " + this.salarioBaseFuncionario  + " e estoque de produtos de " + estoqueProdutos +
        ". Foi fundada em " + this.dataFundacao + " e esta localizada em " + this.endereco;
    }
}
