/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofacade;

import java.util.ArrayList;

public class Facade {
    
    ArrayList<Pessoa> pessoas;

    public Facade() {
        this.pessoas = new ArrayList();
    }
    
    public String adicionarPessoa(String nome, String telefone, String rg){
    
            Pessoa novaPessoa = new Pessoa(nome, telefone, rg);
            this.pessoas.add(novaPessoa);
            return "Pessoa: "+ nome + " adicionada com sucesso!";
    }
    
    public String getNomePessoa(int indice){
            
            return this.pessoas.get(indice).getNome();
    
    }
    
    public String getTelefonePessoa(int indice){
            
            return this.pessoas.get(indice).getTelefone();
    
    }
    
    public String getRgPessoa(int indice){
            
            return this.pessoas.get(indice).getRg();
    
    }
    
}
