/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerfrancia;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class Grafica extends javax.swing.JFrame {

    /**
     * Creates new form Grafica
     */
    public Grafica() {
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

        Log_Juego = new javax.swing.JScrollPane();
        Log_Texto = new javax.swing.JTextField();
        Def_a_1 = new javax.swing.JLabel();
        Def_a_2 = new javax.swing.JLabel();
        Def_a_3 = new javax.swing.JLabel();
        Def_a_4 = new javax.swing.JLabel();
        Med_a_1 = new javax.swing.JLabel();
        Med_a_2 = new javax.swing.JLabel();
        Med_a_3 = new javax.swing.JLabel();
        Med_a_4 = new javax.swing.JLabel();
        Atc_a_1 = new javax.swing.JLabel();
        Atc_a_2 = new javax.swing.JLabel();
        Atc_a_3 = new javax.swing.JLabel();
        Portero_a = new javax.swing.JLabel();
        Marcador = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        Portero_b = new javax.swing.JLabel();
        Def_b_1 = new javax.swing.JLabel();
        Def_b_2 = new javax.swing.JLabel();
        Def_b_3 = new javax.swing.JLabel();
        Def_b_4 = new javax.swing.JLabel();
        Med_b_1 = new javax.swing.JLabel();
        Med_b_2 = new javax.swing.JLabel();
        Med_b_3 = new javax.swing.JLabel();
        Med_b_4 = new javax.swing.JLabel();
        Atc_b_1 = new javax.swing.JLabel();
        Atc_b_2 = new javax.swing.JLabel();
        Atc_b_3 = new javax.swing.JLabel();
        Restart = new javax.swing.JButton();
        Formacion_a = new javax.swing.JComboBox<>();
        Formacion_b = new javax.swing.JComboBox<>();
        Equipo_a = new javax.swing.JTextField();
        Equipo_b = new javax.swing.JTextField();
        Start = new javax.swing.JButton();
        Fondo_log = new javax.swing.JLabel();
        Fondo_Campo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Log_Juego.setBackground(new java.awt.Color(153, 153, 153));

        Log_Texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Log_Texto.setText("aqui va el texto de hector");
        Log_Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_TextoActionPerformed(evt);
            }
        });
        Log_Juego.setViewportView(Log_Texto);

        getContentPane().add(Log_Juego);
        Log_Juego.setBounds(960, 110, 410, 250);

        Def_a_1.setText("jLabel3");
        getContentPane().add(Def_a_1);
        Def_a_1.setBounds(190, 630, 34, 15);

        Def_a_2.setText("jLabel1");
        getContentPane().add(Def_a_2);
        Def_a_2.setBounds(130, 250, 34, 15);

        Def_a_3.setText("jLabel1");
        getContentPane().add(Def_a_3);
        Def_a_3.setBounds(130, 420, 34, 15);

        Def_a_4.setText("jLabel1");
        getContentPane().add(Def_a_4);
        Def_a_4.setBounds(190, 60, 34, 15);

        Med_a_1.setText("jLabel1");
        getContentPane().add(Med_a_1);
        Med_a_1.setBounds(280, 250, 34, 15);

        Med_a_2.setText("jLabel1");
        getContentPane().add(Med_a_2);
        Med_a_2.setBounds(280, 440, 34, 15);

        Med_a_3.setText("jLabel1");
        getContentPane().add(Med_a_3);
        Med_a_3.setBounds(340, 350, 34, 15);

        Med_a_4.setText("jLabel1");
        getContentPane().add(Med_a_4);
        Med_a_4.setBounds(230, 350, 34, 15);

        Atc_a_1.setText("jLabel1");
        getContentPane().add(Atc_a_1);
        Atc_a_1.setBounds(430, 350, 34, 15);

        Atc_a_2.setText("jLabel1");
        getContentPane().add(Atc_a_2);
        Atc_a_2.setBounds(420, 120, 34, 15);

        Atc_a_3.setText("jLabel1");
        getContentPane().add(Atc_a_3);
        Atc_a_3.setBounds(410, 640, 34, 15);

        Portero_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soccerfrancia/Visual/Real Madrid/Porteros/1_rezized.png"))); // NOI18N
        getContentPane().add(Portero_a);
        Portero_a.setBounds(10, 290, 110, 100);

        Marcador.setText("Aqui va el contador");
        getContentPane().add(Marcador);
        Marcador.setBounds(1220, 30, 130, 30);

        Tiempo.setText("Aqui va el tiempo");
        getContentPane().add(Tiempo);
        Tiempo.setBounds(980, 30, 120, 50);

        Portero_b.setText("jLabel1");
        getContentPane().add(Portero_b);
        Portero_b.setBounds(920, 350, 34, 15);

        Def_b_1.setText("jLabel2");
        getContentPane().add(Def_b_1);
        Def_b_1.setBounds(790, 630, 34, 15);

        Def_b_2.setText("jLabel1");
        getContentPane().add(Def_b_2);
        Def_b_2.setBounds(790, 450, 34, 15);

        Def_b_3.setText("jLabel1");
        getContentPane().add(Def_b_3);
        Def_b_3.setBounds(790, 260, 34, 15);

        Def_b_4.setText("jLabel1");
        getContentPane().add(Def_b_4);
        Def_b_4.setBounds(790, 70, 34, 15);

        Med_b_1.setText("jLabel1");
        getContentPane().add(Med_b_1);
        Med_b_1.setBounds(660, 190, 34, 15);

        Med_b_2.setText("jLabel1");
        getContentPane().add(Med_b_2);
        Med_b_2.setBounds(660, 470, 34, 15);

        Med_b_3.setText("jLabel1");
        getContentPane().add(Med_b_3);
        Med_b_3.setBounds(600, 350, 34, 15);

        Med_b_4.setText("jLabel1");
        getContentPane().add(Med_b_4);
        Med_b_4.setBounds(710, 350, 34, 15);

        Atc_b_1.setText("jLabel1");
        getContentPane().add(Atc_b_1);
        Atc_b_1.setBounds(500, 350, 34, 15);

        Atc_b_2.setText("jLabel1");
        getContentPane().add(Atc_b_2);
        Atc_b_2.setBounds(500, 120, 34, 15);

        Atc_b_3.setText("jLabel1");
        getContentPane().add(Atc_b_3);
        Atc_b_3.setBounds(510, 630, 34, 15);

        Restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soccerfrancia/Visual/Photoshop_General/Reset_rezized.png"))); // NOI18N
        Restart.setBorderPainted(false);
        Restart.setContentAreaFilled(false);
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        getContentPane().add(Restart);
        Restart.setBounds(970, 530, 120, 120);

        Formacion_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4-3-3(a)", "4-3-3(b)" }));
        Formacion_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Formacion_aActionPerformed(evt);
            }
        });
        getContentPane().add(Formacion_a);
        Formacion_a.setBounds(990, 460, 110, 24);

        Formacion_b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"4-3-3(a)", "4-3-3(b)" }));
        getContentPane().add(Formacion_b);
        Formacion_b.setBounds(1220, 460, 120, 24);

        Equipo_a.setBackground(new java.awt.Color(204, 204, 204));
        Equipo_a.setForeground(new java.awt.Color(102, 102, 102));
        Equipo_a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Equipo_a.setText("Juventus");
        Equipo_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipo_aActionPerformed(evt);
            }
        });
        getContentPane().add(Equipo_a);
        Equipo_a.setBounds(1000, 420, 70, 30);

        Equipo_b.setBackground(new java.awt.Color(255, 51, 51));
        Equipo_b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Equipo_b.setText("Barcelona");
        Equipo_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipo_bActionPerformed(evt);
            }
        });
        getContentPane().add(Equipo_b);
        Equipo_b.setBounds(1220, 420, 90, 30);

        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soccerfrancia/Visual/Photoshop_General/Start_rezized.png"))); // NOI18N
        Start.setBorderPainted(false);
        Start.setContentAreaFilled(false);
        getContentPane().add(Start);
        Start.setBounds(1170, 540, 220, 100);

        Fondo_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soccerfrancia/Visual/Photoshop_General/Background_Contador.jpg"))); // NOI18N
        Fondo_log.setText("Fondo_Contador");
        getContentPane().add(Fondo_log);
        Fondo_log.setBounds(960, 0, 410, 770);

        Fondo_Campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soccerfrancia/try.jpg"))); // NOI18N
        Fondo_Campo.setText("Fondo_Campo");
        getContentPane().add(Fondo_Campo);
        Fondo_Campo.setBounds(0, 0, 960, 710);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1230, 430, 55, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Equipo_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipo_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Equipo_aActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestartActionPerformed

    private void Equipo_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipo_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Equipo_bActionPerformed

    private void Log_TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_TextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Log_TextoActionPerformed

    private void Formacion_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Formacion_aActionPerformed

    }//GEN-LAST:event_Formacion_aActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atc_a_1;
    private javax.swing.JLabel Atc_a_2;
    private javax.swing.JLabel Atc_a_3;
    private javax.swing.JLabel Atc_b_1;
    private javax.swing.JLabel Atc_b_2;
    private javax.swing.JLabel Atc_b_3;
    private javax.swing.JLabel Def_a_1;
    private javax.swing.JLabel Def_a_2;
    private javax.swing.JLabel Def_a_3;
    private javax.swing.JLabel Def_a_4;
    private javax.swing.JLabel Def_b_1;
    private javax.swing.JLabel Def_b_2;
    private javax.swing.JLabel Def_b_3;
    private javax.swing.JLabel Def_b_4;
    private javax.swing.JTextField Equipo_a;
    private javax.swing.JTextField Equipo_b;
    private javax.swing.JLabel Fondo_Campo;
    private javax.swing.JLabel Fondo_log;
    private javax.swing.JComboBox<String> Formacion_a;
    private javax.swing.JComboBox<String> Formacion_b;
    private javax.swing.JScrollPane Log_Juego;
    private javax.swing.JTextField Log_Texto;
    private javax.swing.JLabel Marcador;
    private javax.swing.JLabel Med_a_1;
    private javax.swing.JLabel Med_a_2;
    private javax.swing.JLabel Med_a_3;
    private javax.swing.JLabel Med_a_4;
    private javax.swing.JLabel Med_b_1;
    private javax.swing.JLabel Med_b_2;
    private javax.swing.JLabel Med_b_3;
    private javax.swing.JLabel Med_b_4;
    private javax.swing.JLabel Portero_a;
    private javax.swing.JLabel Portero_b;
    private javax.swing.JButton Restart;
    private javax.swing.JButton Start;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
