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
 * @author Luiza
 */
public class produto {
     String pizza,refri,local;
     int quantp,quantr,pedido;
    double valorp,pizzap,refrip,valorr,total;
    boolean pizzad,srefri,sazeitona,ketchup,buscar,entregar;
   public produto(){
        pizza = null;
        refri = null;
        quantp = 0;
        quantr = 0;
        pizzad = false;
        srefri = false;
        sazeitona = false;
        ketchup = false;
        buscar = false;
        entregar = false;
        refrip = 0;
        valorr = 0;
        total = 0;
        
    }

    public double getValorr() {
        return valorr;
    }

    public double getRefrip() {
        return refrip;
    }

    public void setRefrip(double refrip) {
        this.refrip = refrip;
    }

    public int getPedido() {
        return pedido;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public String getPizza() {
        return pizza;
    }

    public double getValorp() {
        return valorp;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getRefri() {
        return refri;
    }

    public void setRefri(String refri) {
        this.refri = refri;
    }

    public int getQuantp() {
        return quantp;
    }

    public void setQuantp(int quantp) {
        this.quantp = quantp;
    }

    public int getQuantr() {
        return quantr;
    }

    public void setQuantr(int quantr) {
        this.quantr = quantr;
    }

    public boolean isPizzad() {
        return pizzad;
    }

    public void setPizzad(boolean pizzad) {
        this.pizzad = pizzad;
    }

    public boolean isSrefri() {
        return srefri;
    }

    public void setSrefri(boolean srefri) {
        this.srefri = srefri;
    }

    public boolean isSazeitona() {
        return sazeitona;
    }

    public void setSazeitona(boolean sazeitona) {
        this.sazeitona = sazeitona;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isEntregar() {
        return entregar;
    }

    public void setEntregar(boolean entregar) {
        this.entregar = entregar;
    }

    public double getPizzap() {
        return pizzap;
    }

    public void setPizzap(double pizzap) {
        this.pizzap = pizzap;
    }

    public double getTotal() {
        return total;
    }
    
    
     public double CalcValor(){
      if(this.pizza.equals("Calabresa")){
          pizzap = 25;
      }
      if(this.pizza.equals("Mussalera")){
       pizzap = 23;
      } 
      
      if(this.pizza.equals("Portuguesa")){
       pizzap = 24;
      }
       if(this.pizza.equals("Frango com Catupiry")){
       pizzap = 26;
      }
       if(this.pizza.equals("Especial - Pizzarela")){
       pizzap = 30;
      }
       if(this.pizza.equals("Chocolate")){
          pizzap = 26;
      }
      if(this.pizza.equals("Beijinho")){
       pizzap = 27;
      } 
      
      if(this.pizza.equals("Chocolate Branco")){
       pizzap = 22;
      }
       if(this.pizza.equals("Brigadeiro")){
       pizzap = 25;
      }
       //PIZZAS
       
       if(this.refri.equals("Coca - Cola ")){
       refrip = 6;
       
       }
         if(this.refri.equals("Pepsi")){
       refrip = 4.50;
       
       }
         if(this.refri.equals("Fanta(Uva)")){
       refrip = 4.60;
       
       }
           if(this.refri.equals("Fanta(Laranja)")){
       refrip = 4.60;
       
       }   
           if(this.refri.equals("Fanta(Guarana)")){
       refrip = 4.60;
       
       }
             if(this.refri.equals("Guarana-Jesus")){
       refrip = 3.50;
       
       }
              if(this.refri.equals("Kuat")){
       refrip = 5.00;
       
       }
             if(this.refri.equals("Sukita")){
       refrip = 5.00;
       
       }
              
    
       
       valorp = quantp * pizzap ;
       valorr = quantr * refrip;
       total =valorp+valorr;
      return total;
     }
      public String SalvarCC(){
      
        try{
        BufferedReader bf = new BufferedReader(new FileReader(this.pedido+"cc.txt"));
        produto pf = new produto();
        pf.setPedido(this.pedido);
         bf.close();
         return "ERROR,SEU PEDIDO JÁ FOI REGISTRADO";
        }
        catch(Exception ex){
            Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
        }
        
        
        try {
           //filewriter biblioteca para salvar arquivos de texto
                     
           FileWriter fw = new FileWriter(this.pedido+"cc.txt",false);
            //criando o arquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           pw.println(this.pedido);
           pw.println(this.local);
           pw.println(this.pizza);
           pw.println(this.refri);
           pw.println(this.quantp);
           pw.println(this.quantr);
           pw.println(this.pizzad);
           pw.println(this.srefri);
           pw.println(this.sazeitona);
           pw.println(this.ketchup);
           pw.println(this.buscar);
           pw.println(this.entregar);
           pw.println(this.valorp);
           
           
           pw.flush();//enviar o arquivo
           pw.close();//fechar
           fw.close();//fechar
           return "Pedido realizado com sucesso";
           
           
       }
    
      catch (Exception ex){
          JOptionPane.showMessageDialog(null, " ERROR");
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
        return "Pedido não realizado";
    }
    public String DeletarCC() {
      
      try{
       BufferedReader bf = new BufferedReader(new FileReader(this.pedido+"cc.txt"));
        produto pf = new produto();
        pf.setPedido(this.pedido);
        bf.close();
       File arquivo = new File(this.pedido+"cc.txt");
       arquivo.delete();
        return "Cancelado com sucesso!";
      }
      catch(Exception ex){
           JOptionPane.showMessageDialog(null, "error"+ex);
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
       return "Não foi possivel cancelar!";
    }
    public String AtualizarCC(){
      try {
           //filewriter biblioteca para salvar arquivos de texto
           
           FileWriter fw = new FileWriter(this.pedido+"cc.txt",false);
            //criando o arquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           
           pw.println(this.pedido);
           pw.println(this.local);
           pw.println(this.pizza);
           pw.println(this.refri);
           pw.println(this.quantp);
           pw.println(this.quantr);
           pw.println(this.pizzad);
           pw.println(this.srefri);
           pw.println(this.sazeitona);
           pw.println(this.ketchup);
           pw.println(this.buscar);
           pw.println(this.entregar);
           
           
           
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
     
     public String DeleteALL(){
     
     try{
       File arquivo = new File(this.pedido+"cc.txt");
       
       arquivo.deleteOnExit();
       arquivo.delete();
       
   return "OBRIGADO POR USAR OS SERVIÇOS PIZZARELA";
      }
      catch(Exception ex){
           JOptionPane.showMessageDialog(null, "error"+ex);
          Logger.getLogger(clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
      return "OBRIGADO POR USAR OS SERVIÇOS PIZZARELA";
    }
 
     }
     
    

