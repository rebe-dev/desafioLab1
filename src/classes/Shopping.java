package classes;
import java.util.Arrays;
import classes.lojas.*;

public class Shopping {
    String nome;
    Endereco endereco;
    Loja[] lojas;
    int quantidadeMaxLojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeMaxLojas = quantidadeMaxLojas;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public int getQuantidadeMaxLojas() {
        return quantidadeMaxLojas;
    }
    public void setQuantidadeMaxLojas(int quantidadeMaxLojas) {
        this.quantidadeMaxLojas = quantidadeMaxLojas;
    }

    public String toString() {
        return "O Shopping " + this.nome + " tem " + this.lojas + " lojas e capacidade maxima de " + this.quantidadeMaxLojas +
         ".\nEsta localizado em " + this.endereco;
    }

    public boolean insereLoja(Loja novaLoja){
        try {
            Arrays.asList(this.lojas).add(0, novaLoja); 
            return true; 
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean removeLoja(String lojaParaRemover){
        for(int i = 0; i < this.lojas.length; i++) {
            if(lojas[i].getNome().equals(lojaParaRemover)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaComSeguroMaisCaro = null;

        for(int i = 0; i < this.lojas.length; i++) {
            if(this.lojas[i] instanceof Informatica){
                if(lojaComSeguroMaisCaro.getSeguroEletronicos() < ((Informatica)this.lojas[i]).getSeguroEletronicos()) {
                    lojaComSeguroMaisCaro = ((Informatica)this.lojas[i]);
                };
            }
        }
        return lojaComSeguroMaisCaro;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        String[] tiposDeLoja = {"Cosmetico", "Vestuario", "Bijuteria", "Alimentacao", "Informatica"};
        int[] tiposDeLojaContador = {0,0,0,0,0};
        int posicaoDoTipoLoja = 0;

        // pega qual a posição no array tiposDeLojaContador o parametro tipo está 
        for(int i = 0; i < tiposDeLoja.length; i++) {
            if(tiposDeLoja[i].equalsIgnoreCase(tipo)){
                posicaoDoTipoLoja = i;
                // contador de instancias de cada tipo de loja nas lojas
                for(int x = 0; x < this.lojas.length; x++) {
                    if(this.lojas[x] instanceof Cosmetico) tiposDeLojaContador[0]++;
                    if(this.lojas[x] instanceof Vestuario) tiposDeLojaContador[1]++;
                    if(this.lojas[x] instanceof Bijuteria) tiposDeLojaContador[2]++;
                    if(this.lojas[x] instanceof Alimentacao) tiposDeLojaContador[3]++;
                    if(this.lojas[x] instanceof Informatica) tiposDeLojaContador[4]++;
                }
                return tiposDeLojaContador[posicaoDoTipoLoja];
            }
        }
        return -1;
    }

}
