/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Pessoa {

  
  private  String nome;
    
      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    
     @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }

}
