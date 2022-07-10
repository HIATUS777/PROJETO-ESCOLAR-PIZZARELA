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
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class produto_fornecer {
     public String marcas,uf,local;
     public int quant,cod;
     public boolean refrigerantes,tempero,massa,alimentos,outros;
     public produto_fornecer(){
     marcas = null;
     uf = null;
     local = null;
     quant = 0;
     refrigerantes = false;
     tempero = false;
     alimentos = false;
     outros = false;
     cod = 0;
     
     }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarcas() {
        return marcas;
    }

    public boolean isRefrigerantes() {
        return refrigerantes;
    }

    public void setRefrigerantes(boolean refrigerantes) {
        this.refrigerantes = refrigerantes;
    }

    public boolean isTempero() {
        return tempero;
    }

    public void setTempero(boolean tempero) {
        this.tempero = tempero;
    }

    public boolean isMassa() {
        return massa;
    }

    public void setMassa(boolean massa) {
        this.massa = massa;
    }

    public boolean isOutros() {
        return outros;
    }

    public void setOutros(boolean outros) {
        this.outros = outros;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getQuant() {
        return quant;
    }

    public boolean isAlimentos() {
        return alimentos;
    }

    public void setAlimentos(boolean alimentos) {
        this.alimentos = alimentos;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    public String SalvarF(){
      
        try{
        BufferedReader bf = new BufferedReader(new FileReader(this.cod+"ff.txt"));
        produto_fornecer pf = new produto_fornecer();
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
                     
           FileWriter fw = new FileWriter(this.cod+"ff.txt",false);
            //criando o arquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           pw.println(this.cod);
           pw.println(this.local);
           pw.println(this.marcas);
           pw.println(this.uf);
           pw.println(this.quant);
           pw.println(this.alimentos);
           pw.println(this.massa);
           pw.println(this.tempero);
           pw.println(this.refrigerantes);
           pw.println(this.outros);
           
           
           
           pw.flush();//enviar o arquivo
           pw.close();//fechar
           fw.close();//fechar
           return "Pedido realizado com sucesso";
           
           
       }
    
      catch (Exception ex){
          JOptionPane.showMessageDialog(null, "Pedido não realizado!");
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
        return "Pedido não realizado";
    }
    public String Deletar() {
      try{
        BufferedReader bf = new BufferedReader(new FileReader(this.cod+"ff.txt"));
        produto_fornecer pf = new produto_fornecer();
        pf.setCod(this.cod);
         bf.close();
      
       File arquivo = new File(this.cod+"ff.txt");
       arquivo.delete();
       
       return "Cancelado com sucesso!";}
      catch(Exception ex){    
          JOptionPane.showMessageDialog(null, "ERROR"+ex);
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
          
      }
      return "Não foi possivel cancelar";
    }
    public String AtualizarF(){
      try {
           //filewriter biblioteca para salvar arquivos de texto
           
           FileWriter fw = new FileWriter(this.cod+"ff.txt",false);
            //criando o arquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           pw.println(this.cod);
           pw.println(this.local);
           pw.println(this.marcas);
           pw.println(this.uf);
           pw.println(this.quant);
           pw.println(this.alimentos);
           pw.println(this.massa);
           pw.println(this.tempero);
           pw.println(this.refrigerantes);
           pw.println(this.outros);
           
           
           
           pw.flush();//enviar o arquivo
           pw.close();//fechar
           fw.close();//fechar
           
       }
      catch (Exception ex){
          JOptionPane.showMessageDialog(null, "Não foi possivel atualizar!");
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
        return "Atualizado com sucesso";
    }

}
