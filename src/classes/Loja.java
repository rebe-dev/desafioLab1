package classes;
public class Loja {
    String nome;
    int quantidadeFuncionarios;
    float salarioBaseFuncionario;
    Endereco endereco;
    Data dataDeFundacao;

    // construtores

    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
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
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public float getSalarioBaseFuncionario() {
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
        return "A loja" + this.nome + "tem" + this.quantidadeFuncionarios + "com salario base de " + this.salarioBaseFuncionario;
    }

    public float gastosComSalario(){
        if(this.salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
        }
    };

    public char tamanhoDaLoja(){
        if(this.quantidadeFuncionarios < 10){
           return 'P';
        }else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
          return 'M';
        } else {
            return 'G';
        }
    }
}
