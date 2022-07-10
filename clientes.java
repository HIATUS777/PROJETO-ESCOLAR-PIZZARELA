/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**setUf
 *
 * @author aluno
 */
public class clientes {

    String nome,cpf,uf,cod;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String Salvar() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      try{
        BufferedReader bf = new BufferedReader(new FileReader(this.cod+"f.txt"));
        clientes pf = new clientes();
        pf.setCod(this.cod);
         bf.close();
         return "ERROR,SEU CODIGO JÁ FOI CADASTRADO";
        }
        catch(Exception ex){
             Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
        }
               try {
           //filewriter biblioteca para salvar arquivos de texto
           
           FileWriter fw = new FileWriter(this.cod+"f.txt",false);
            //criando o arquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           pw.println(this.cod);
           pw.println(this.nome);
           pw.println(this.cpf);
           pw.println(this.uf);
           
           pw.flush();//enviar o arquivo
           pw.close();//fechar
           fw.close();//fechar
           return "Cadastro realizado com sucesso";
       }
      catch (IOException ex){
          JOptionPane.showMessageDialog(null, "Cadastro não realizado!");
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
         return "Cadastro não realizado";
       
     
    }
       
   
public String Atualizar(){
    
  try {
           //filewriter biblioteca para salvar arquivos de texto
           
           FileWriter fw = new FileWriter(this.cod+"f.txt",false);
            //criando o aqrquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           pw.println(this.cod);
           pw.println(this.nome);
           pw.println(this.cpf);
           pw.println(this.uf);
           
           pw.flush();//enviar o arquivo
           pw.close();//fechar
           fw.close();//fechar
           
       }
      catch (IOException ex){
          JOptionPane.showMessageDialog(null, "Não foi possível atualizar!"+ex);
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
       return "Atualizado com sucesso!";
       
}

    public String Deletar() {
      try{
         BufferedReader bf = new BufferedReader(new FileReader(cod+"f.txt"));
         bf.close();
          File arquivo = new File(this.cod+"f.txt");
       arquivo.delete();
        return "Deletado com sucesso!";
      }
      catch(Exception ex){
           JOptionPane.showMessageDialog(null, "error"+ex);
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
       return "Não foi possivel deletar!";
    }




       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

  
    }
    

