package classes;

public class Alimentacao extends Loja {
    Data dataAlvara;

    public Alimentacao(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara){
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        return "A loja de alimentação " + this.nome + " com alvara " + this.dataAlvara + " com " + this.quantidaDeFuncionarios + " funcionarios com salario base de " + this.salarioBaseFuncionario + ". Foi fundada em " + this.dataFundacao + " e esta localizada em " + this.endereco;
    }
}
