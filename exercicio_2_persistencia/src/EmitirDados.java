
import java.io.IOException;
import java.util.ArrayList;

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
    
    protected Dados dados;
    
    public EmitirDados(Dados dados){
    this.dados = dados;
    }

    
    
    
   
    public void emitirsalvar(ArrayList<Aluno>lista) throws IOException{
        
       dados.salvar(lista);
     }
 

}
