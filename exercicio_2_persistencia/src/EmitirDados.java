/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class EmitirDados {
    
    protected Dados notificacao;
    
    public EmitirDados(Dados notificacao){
    this.notificacao = notificacao;
    }
    
    public String dispararAlerta(){
    return this.notificacao.enviar();
    
    }
}