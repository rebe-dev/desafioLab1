package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
