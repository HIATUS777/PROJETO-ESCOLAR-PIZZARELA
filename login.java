/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.view;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JLabel();
        dadosu = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        dadoss = new javax.swing.JPasswordField();
        btlogin = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        usuario1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        cadmenu = new javax.swing.JMenuItem();
        sairmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(null);

        usuario.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(1, 1, 1));
        usuario.setText("Nome:");
        getContentPane().add(usuario);
        usuario.setBounds(100, 340, 70, 20);

        dadosu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadosuActionPerformed(evt);
            }
        });
        getContentPane().add(dadosu);
        dadosu.setBounds(170, 340, 120, 30);

        senha.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        senha.setForeground(new java.awt.Color(1, 1, 1));
        senha.setText("Senha: ");
        getContentPane().add(senha);
        senha.setBounds(100, 390, 70, 20);

        dadoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadossActionPerformed(evt);
            }
        });
        getContentPane().add(dadoss);
        dadoss.setBounds(170, 390, 120, 30);

        btlogin.setBackground(new java.awt.Color(207, 84, 25));
        btlogin.setForeground(new java.awt.Color(1, 1, 1));
        btlogin.setText("Entrar");
        btlogin.setToolTipText("");
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        getContentPane().add(btlogin);
        btlogin.setBounds(330, 340, 80, 23);

        sair.setBackground(new java.awt.Color(207, 84, 25));
        sair.setForeground(new java.awt.Color(1, 1, 1));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(330, 390, 80, 30);

        logo.setForeground(new java.awt.Color(1, 1, 1));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzarella.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(0, 0, 500, 500);

        usuario1.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        usuario1.setForeground(new java.awt.Color(1, 1, 1));
        usuario1.setText("Nome:");
        getContentPane().add(usuario1);
        usuario1.setBounds(100, 340, 70, 20);

        jMenu2.setText("Opções");

        cadmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        cadmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons 1/add.png"))); // NOI18N
        cadmenu.setText("Cadastrar");
        cadmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadmenuActionPerformed(evt);
            }
        });
        jMenu2.add(cadmenu);

        sairmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        sairmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons 1/anchor.png"))); // NOI18N
        sairmenu.setText("Sair");
        sairmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairmenuActionPerformed(evt);
            }
        });
        jMenu2.add(sairmenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(500, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dadosuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadosuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadosuActionPerformed

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
        // TODO add your handling code here:
        String usuari = dadosu.getText();
        String senh = new String(dadoss.getPassword());
        
        if(senh.equals("") || usuari.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um usuário e senha");
        } else{
            if(usuari.equals("grace") && senh.equals("1234")){
                cadastro cad = new cadastro();
                cad.setVisible(true);
                dispose();
            } else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            }
    }//GEN-LAST:event_btloginActionPerformed
                            
    dadosu.setText("");
    dadoss.setText("");
    }
    
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
     System.exit(0);
      
    }//GEN-LAST:event_sairActionPerformed

    private void dadossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadossActionPerformed

    private void cadmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadmenuActionPerformed
              new cadastro().setVisible(true);
              dispose();
                 
    }//GEN-LAST:event_cadmenuActionPerformed

    private void sairmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairmenuActionPerformed
      System.exit(0);
    }//GEN-LAST:event_sairmenuActionPerformed
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlogin;
    private javax.swing.JMenuItem cadmenu;
    private javax.swing.JPasswordField dadoss;
    private javax.swing.JTextField dadosu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton sair;
    private javax.swing.JMenuItem sairmenu;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables
}
