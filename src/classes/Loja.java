package classes;

import java.util.Arrays;

public class Loja {
    protected String nome;
    protected int quantidaDeFuncionarios;
    protected double salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;
    protected Produto[] estoqueProdutos;
    protected int quantMaximaProdutos;

    // construtores

    public Loja(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaximaProdutos) {
        this.nome = nome;
        this.quantidaDeFuncionarios = quantidaDeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantMaximaProdutos = quantMaximaProdutos;
    }
    public Loja(String nome, int quantidaDeFuncionarios, Endereco endereco, Data dataFundacao, int quantMaximaProdutos) {
        this.nome = nome;
        this.quantidaDeFuncionarios = quantidaDeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
        this.quantMaximaProdutos = quantMaximaProdutos;
    }

    // metodos de acesso

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidaDeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidaDeFuncionarios) {
        this.quantidaDeFuncionarios = quantidaDeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(float salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public String toString() {
        return "A loja " + this.nome + " tem " + this.quantidaDeFuncionarios + " funcionarios com salario base de " + this.salarioBaseFuncionario +
         ".\nFoi fundada em " + this.dataFundacao + " e esta localizada em " + this.endereco + 
         ". O estoque desse produto eh " + this.estoqueProdutos + " e quantidade maxima de " + this.quantMaximaProdutos;
    }

    public double gastosComSalario() {
        if(this.salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return this.quantidaDeFuncionarios * this.salarioBaseFuncionario;
        }
    };

    public char tamanhoDaLoja() {
        if(this.quantidaDeFuncionarios < 10) {
           return 'P';
        }else if(this.quantidaDeFuncionarios >= 10 && this.quantidaDeFuncionarios <= 30) {
          return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos() {
        for(int i = 0; i < this.estoqueProdutos.length; i++) {
            System.out.println("\nProduto " + i + "\n" + this.estoqueProdutos[i]);
        }
    }

    public boolean removeProduto(String nomeParaRemover){
        for(int i = 0; i < this.estoqueProdutos.length; i++) {
            if(estoqueProdutos[i].getNome().equals(nomeParaRemover)){
                estoqueProdutos[i].removeProduto();
                return true;
            }
        }
        return false;
    }

    public boolean insereProduto(Produto novaProduto){
        try {
            Arrays.asList(this.estoqueProdutos).add(0, novaProduto); 
            return true; 
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
