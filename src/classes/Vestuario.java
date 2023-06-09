package classes;

public class Vestuario extends Loja{
    Boolean produtosImportados;

    public Vestuario(Boolean produtosImportados, String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Boolean getProdutosImportados() {
        return produtosImportados;
    }
    public void setProdutosImportados(Boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString(){ // TODO: adicionar produtosImportados
        return "A loja de vestuario " + this.nome + " tem " + this.quantidaDeFuncionarios + " funcionarios com salario base de " + this.salarioBaseFuncionario + ". Foi fundada em " + this.dataFundacao + " e esta localizada em " + this.endereco;
    }
}
