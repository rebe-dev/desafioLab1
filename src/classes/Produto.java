package classes;
public class Produto {
    String nome;
    double preco;
    Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    };

    public String getNome() {
        return nome;
    };
    public void setNome(String nome) {
        this.nome = nome;
    };

    public double getPreco() {
        return preco;
    };
    public void setPreco(double preco) {
        this.preco = preco;
    };

    public Data getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return "O Produto" + this.nome + "possui o preço" + this.preco + "e data de validade " + this.dataValidade;
    };

    public boolean estaVencido(Data data) {
        if(data.ano > this.dataValidade.ano) {
            return true;
        } else if(data.ano == this.dataValidade.ano && data.mes >= this.dataValidade.mes && data.dia >= this.dataValidade.dia) {
            return true;
        } else{
            return false;
        }
    }

    public void removeProduto() {
        this.setNome(null);
        this.setDataValidade(null);
        this.setPreco(0);
    }
};
