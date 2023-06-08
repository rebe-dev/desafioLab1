package classes;
public class Produto {
    String nome;
    double preco;
    Data dataDeValidade;

    public Produto(String nome, double preco, Data dataDeValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
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

    public Data getDataDeValidade() {
        return dataDeValidade;
    }
    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String toString(){
        return "O Produto" + this.nome + "possui o preço" + this.preco + "e data de validade " + this.dataDeValidade;
    };

    public boolean estaVencido(Data data){
        if(data.ano > this.dataDeValidade.ano){
            return true;
        } else if(data.ano == this.dataDeValidade.ano && data.mes >= this.dataDeValidade.mes && data.dia >= this.dataDeValidade.dia){
            return true;
        } else{
            return false;
        }
    }
};
