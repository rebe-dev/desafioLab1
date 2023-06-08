package classes;

public class Menu {
    int opcaoEscolhida;
   
    public Menu(int opcaoEscolhida){
        this.opcaoEscolhida = opcaoEscolhida;

        if(this.opcaoEscolhida == 1) this.novaLoja();
        else this.novoProduto();
    }

    private void novaLoja(){
        String nomeLoja = Teclado.leString("\nNome da Loja:");
        int quantidaDeFuncionarios = Teclado.leInt("Quantidade de funcionarios:");
        double salarioBaseFuncionario = Teclado.leDouble("Qual o salario base dos funcionarios:");
        
        System.out.println("Qual o endereço da loja?");
        String nomeDaRua = Teclado.leString("Rua:");
        String cidade = Teclado.leString("Cidade:");
        String estado = Teclado.leString("Estado:");
        String pais = Teclado.leString("Pais:");
        String cep = Teclado.leString("CEP:");
        String numero = Teclado.leString("Numero:");
        String complemento = Teclado.leString("Complmento:");
        Endereco enderecoLojaNova = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

        System.out.println("Qual a data de fundação da loja?");
        int dia = Teclado.leInt("Dia");
        int mes = Teclado.leInt("Mês:");
        int ano = Teclado.leInt("Ano:");
        Data dataDeFundacaoNovaLoja = new Data(dia, mes, ano);

        Loja novaLoja = new Loja(nomeLoja, quantidaDeFuncionarios, salarioBaseFuncionario, enderecoLojaNova, dataDeFundacaoNovaLoja);
        System.out.println("\nLoja criada: " + novaLoja);
    }

    private void novoProduto(){
        String nomeProduto = Teclado.leString("\nNome do Produto:");
        Double preco = Teclado.leDouble("Preço do Produto:");

        System.out.println("Qual a data de validade?");
        int dia = Teclado.leInt("Dia");
        int mes = Teclado.leInt("Mês:");
        int ano = Teclado.leInt("Ano:");
        Data dataDeValidade = new Data(dia, mes, ano);

        Produto novoProduto = new Produto(nomeProduto, preco, dataDeValidade);
        System.out.println("\nProduto criado com sucesso!");

        if(novoProduto.estaVencido(new Data(20, 10, 2023))) {
            System.out.println("PRODUTO VENCIDO");
        }else System.out.println("PRODUTO NÃO VENCIDO");
    }

}

