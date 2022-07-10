    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.text.MaskFormatter;
import pizza.model.clientes;

/**
 *
 * @author aluno
 */
public class cadastro extends javax.swing.JFrame {

    /**
     * Creates new form cadastro
     */
    public cadastro() {
        initComponents();
        formatarcampo();
           Date dt = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    data.setText(formato.format(dt));
    
    Timer timer = new Timer(1000,new hora());
    timer.start();
   
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtcod = new javax.swing.JTextField();
        btncadastrar = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        txtuf = new javax.swing.JComboBox<>();
        btnatu = new javax.swing.JButton();
        btnexc = new javax.swing.JButton();
        cadpesq = new javax.swing.JButton();
        btalt = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        fornecer = new javax.swing.JButton();
        txtcpf = new javax.swing.JFormattedTextField();
        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        telacad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        nome1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        nome1.setForeground(new java.awt.Color(1, 1, 1));
        nome1.setText("Nome:");
        getContentPane().add(nome1);
        nome1.setBounds(40, 180, 80, 20);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 180, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("CPF: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 230, 31, 20);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("UF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 230, 40, 20);

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome);
        txtnome.setBounds(110, 180, 90, 30);

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        getContentPane().add(txtcod);
        txtcod.setBounds(320, 180, 90, 30);

        btncadastrar.setBackground(new java.awt.Color(207, 84, 25));
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar);
        btncadastrar.setBounds(330, 340, 100, 30);

        btnlimpar.setBackground(new java.awt.Color(207, 84, 25));
        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpar);
        btnlimpar.setBounds(150, 340, 80, 30);

        txtuf.setBackground(new java.awt.Color(255, 132, 0));
        txtuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "SP", "CE", "PE", "PA", "RS", "RJ" }));
        txtuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtufActionPerformed(evt);
            }
        });
        getContentPane().add(txtuf);
        txtuf.setBounds(310, 230, 100, 30);

        btnatu.setBackground(new java.awt.Color(207, 84, 25));
        btnatu.setText("Atualizar");
        btnatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatuActionPerformed(evt);
            }
        });
        getContentPane().add(btnatu);
        btnatu.setBounds(140, 390, 90, 30);

        btnexc.setBackground(new java.awt.Color(207, 84, 25));
        btnexc.setText("Excluir");
        btnexc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcActionPerformed(evt);
            }
        });
        getContentPane().add(btnexc);
        btnexc.setBounds(60, 340, 80, 30);

        cadpesq.setBackground(new java.awt.Color(207, 84, 25));
        cadpesq.setText("Pesquisar");
        cadpesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadpesqActionPerformed(evt);
            }
        });
        getContentPane().add(cadpesq);
        cadpesq.setBounds(240, 390, 100, 30);

        btalt.setBackground(new java.awt.Color(207, 84, 25));
        btalt.setText("Alterar");
        btalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaltActionPerformed(evt);
            }
        });
        getContentPane().add(btalt);
        btalt.setBounds(240, 340, 80, 30);

        Voltar.setBackground(new java.awt.Color(207, 84, 25));
        Voltar.setText("<");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(0, 0, 40, 23);

        comprar.setBackground(new java.awt.Color(207, 84, 25));
        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar);
        comprar.setBounds(370, 460, 100, 30);

        fornecer.setBackground(new java.awt.Color(207, 84, 25));
        fornecer.setText("Cadastro Fornecedor");
        fornecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecerActionPerformed(evt);
            }
        });
        getContentPane().add(fornecer);
        fornecer.setBounds(10, 460, 160, 30);
        getContentPane().add(txtcpf);
        txtcpf.setBounds(110, 230, 90, 30);

        hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 153, 0));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(hora);
        hora.setBounds(390, 0, 90, 30);

        data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 153, 0));
        data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(data);
        data.setBounds(390, 30, 90, 30);

        telacad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro.png"))); // NOI18N
        getContentPane().add(telacad);
        telacad.setBounds(0, 0, 480, 500);

        setSize(new java.awt.Dimension(494, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
   clientes cli = new clientes();
       
       //criando o objeto cliente
       if(txtcod.getText().equals("")||txtnome.getText().equals("")||txtcpf.getText().equals("")||txtuf.getSelectedItem().equals("Selecione")){
           JOptionPane.showMessageDialog(null,"Preencha as lacunas");
       }
       else{
       cli.setCod(txtcod.getText());
       cli.setNome(txtnome.getText());
       cli.setCpf(txtcpf.getText());
       cli.setUf((String)txtuf.getSelectedItem());
       //Salvando ou cadastrando as informações
       
       JOptionPane.showMessageDialog(null, cli.Salvar());
       
       txtcod.setText("");
       txtnome.setText("");
       txtuf.setSelectedItem(0);
       txtcpf.setText("");
       
       }


  
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void btnatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatuActionPerformed
         if(txtcod.getText().equals("")||txtnome.getText().equals("")||txtcpf.getText().equals("")||txtuf.getSelectedItem().equals("Selecione")){
           JOptionPane.showMessageDialog(null,"Preencha as lacunas");
       }
          else if(btncadastrar.isEnabled()){
           JOptionPane.showMessageDialog(null,"Você so pode atualizar se tiver cadastrado antes");
         }
       
         else{
        clientes clientes = new clientes();
        //criando o objeto cliente
        
        clientes.setCod(txtcod.getText());
        clientes.setCpf(txtcpf.getText());
        clientes.setNome(txtnome.getText());
        clientes.setUf((String)txtuf.getSelectedItem());
        
        //salavando ou cadastrando as informações
        JOptionPane.showMessageDialog(null, clientes.Atualizar());
        
        txtnome.setText("");//limpando os campos
        txtcod.setText("");
        txtcpf.setText("");
        txtuf.setSelectedItem(0);
        btncadastrar.setEnabled(true);
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnatuActionPerformed

    private void btnexcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcActionPerformed
   try{
       clientes Clientes = new clientes();
        String cod = JOptionPane.showInputDialog("Digite o código ");
        Clientes.setCod(cod);
        JOptionPane.showMessageDialog(null, Clientes.Deletar());
        txtcod.setEnabled(true);
         txtnome.setEnabled(true);
         txtcpf.setEnabled(true);
         txtuf.setEnabled(true);
        txtcod.setText("");
        txtnome.setText("");
        txtuf.setSelectedItem(0);
        txtcpf.setText("");

         
   }
    catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro: " +erro.getMessage());
                Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, erro);
   
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexcActionPerformed

    private void txtufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtufActionPerformed

    private void cadpesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadpesqActionPerformed
        if(evt.getSource() == cadpesq){
            try {
                String ccode = JOptionPane.showInputDialog("Digite o código: ");
                BufferedReader bf = new BufferedReader(new FileReader(ccode+"f.txt"));
                // criando o arquivo de leitura de caracteres
                
                txtcod.setText(bf.readLine());
                txtnome.setText(bf.readLine());
                txtcpf.setText(bf.readLine());
                txtuf.setSelectedItem(bf.readLine());
                bf.close();
         txtcod.setEnabled(false);
         txtnome.setEnabled(false);
         txtcpf.setEnabled(false);
         txtuf.setEnabled(false);
                
                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro: " +erro.getMessage());
                Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, erro);
         txtcod.setEnabled(true);
         txtnome.setEnabled(true);
         txtcpf.setEnabled(true);
         txtuf.setEnabled(true);
            }
        
        }
    }//GEN-LAST:event_cadpesqActionPerformed

    private void btaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaltActionPerformed
        // TODO add your handling code here:
        if(txtcod.isEnabled()||txtnome.isEnabled()||txtcpf.isEnabled()||txtuf.isEnabled()){
            JOptionPane.showMessageDialog(null,"Pesquise algo primeiro");
        btncadastrar.setEnabled(true);
        }
        else{
        
          txtcod.setEnabled(true);
        txtnome.setEnabled(true);
        txtcpf.setEnabled(true);
        txtuf.setEnabled(true);
        btncadastrar.setEnabled(false);
        }
        
    }//GEN-LAST:event_btaltActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        txtcod.setText("");
        txtnome.setText("");
        txtuf.setSelectedItem(0);
        txtcpf.setText("");

    }//GEN-LAST:event_btnlimparActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
       login l = new login();
       l.setVisible(true);
       dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
       try{
        String codigo = JOptionPane.showInputDialog("Digite o codigo");
       BufferedReader bf = new BufferedReader(new FileReader(codigo+"c.txt"));
       comprar p = new comprar();
       p.setVisible(true);
       dispose();
       }
       catch(Exception erro){
           JOptionPane.showMessageDialog(null,"Seu codigo não foi encontrado,verifique se está cadastrado!");
           Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, erro);
       }
    }//GEN-LAST:event_comprarActionPerformed

    private void fornecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecerActionPerformed
        fornecer f = new fornecer();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_fornecerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }
    private void formatarcampo(){
         try {
           MaskFormatter mk = new MaskFormatter("###.###.###-##");
           mk.install(txtcpf);
        } catch (ParseException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton btalt;
    private javax.swing.JButton btnatu;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnexc;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton cadpesq;
    private javax.swing.JButton comprar;
    private javax.swing.JLabel data;
    private javax.swing.JButton fornecer;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel telacad;
    private javax.swing.JTextField txtcod;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtnome;
    private javax.swing.JComboBox<String> txtuf;
    // End of variables declaration//GEN-END:variables
class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        Calendar car = Calendar.getInstance();
        hora.setText(String.format("%1$tH:%1$tM",car));
        }
        
    }
}


