package classes;
public class Loja {
    String nome;
    int quantidaDeFuncionarios;
    double salarioBaseFuncionario;
    Endereco endereco;
    Data dataDeFundacao;

    // construtores

    public Loja(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao){
        this.nome = nome;
        this.quantidaDeFuncionarios = quantidaDeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
    }
    public Loja(String nome, int quantidaDeFuncionarios){
        this.nome = nome;
        this.quantidaDeFuncionarios = quantidaDeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataDeFundacao() {
        return dataDeFundacao;
    }
    public void setDataDeFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public String toString(){
        return "A loja " + this.nome + " tem " + this.quantidaDeFuncionarios + "duncionarios com salario base de " + this.salarioBaseFuncionario + ". Foi fundada em " + this.dataDeFundacao + " e esta localizada em " + this.endereco;
    }

    public double gastosComSalario(){
        if(this.salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return this.quantidaDeFuncionarios * this.salarioBaseFuncionario;
        }
    };

    public char tamanhoDaLoja(){
        if(this.quantidaDeFuncionarios < 10){
           return 'P';
        }else if(this.quantidaDeFuncionarios >= 10 && this.quantidaDeFuncionarios <= 30){
          return 'M';
        } else {
            return 'G';
        }
    }
}
