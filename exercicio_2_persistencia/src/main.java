
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
       
        String cpf="";
        String danasc="";
        String email="";
        String nome="";
        int matricula=0;
    
    
        
        Aluno a = new Aluno(matricula, cpf, danasc, email, nome);
        a.setCpf("111.111.111-11");
        a.setDanasc("12/12/2000");
        a.setMatricula(123456789);
        a.setEmail("rodrigo@gmail.com");
        a.setNome("rodrigo");
            
        ListAluno lisa= new ListAluno();
       
        lisa.inserir(a);
        
        
        //para salvar em JSON
        Dados d = new DadosJSON();
        EmitirDados e = new EmitirDados(d);
        e.emitirsalvar(lisa.lista);
        
        //Para salvar em CSV
         d = new DadosCSV();
           e = new EmitirDados(d);
        e.emitirsalvar(lisa.lista);
         
        //para salvar em XML
        d = new DadosXML();
        e = new EmitirDados(d);
        e.emitirsalvar(lisa.lista);
    }
    
}
