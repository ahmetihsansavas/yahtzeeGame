/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import client.Client;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ahmetihsan
 */


public class Yahtzee extends javax.swing.JFrame {
public static ArrayList players=new ArrayList();
public static int nplayer;
ImageIcon ıcon[]=new ImageIcon[5];   
BufferedImage img;
     //    BufferedImage img = ImageIO.read(this.getClass().getResource("/image/Dice-1.png").getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
ImageIcon img1 =new ImageIcon("/image/Dice-1.png");
ImageIcon img2 = new ImageIcon("/image/Dice-2.png");
ImageIcon img3 = new ImageIcon("/image/Dice-3.png");
ImageIcon img4 = new ImageIcon("/image/Dice-4.png");
ImageIcon img5 = new ImageIcon("/image/Dice-5.png");
ImageIcon img6 = new ImageIcon("/image/Dice-6.png");
Random r=new Random();
      int[] zar=new int[6];   
 ArrayList ones=new ArrayList();
 ArrayList twos=new ArrayList();
 ArrayList threes=new ArrayList();
 ArrayList fours=new ArrayList();
  ArrayList fives=new ArrayList();
  ArrayList sixes=new ArrayList();
      int randoms=r.nextInt(6)+1;
    void ZarAt(int a[],int i,JLabel j){
    a[i]=randoms;
    if (a[i]==1) {
        j.setText("*");
       ones.add(a[i]);
    }
    if (a[i]==2) {
        j.setText("* *");
        twos.add(a[i]);
    }
    if (a[i]==3) {
        j.setText("* * *");
        threes.add(a[i]);
    }
    if (a[i]==4) {
        j.setText("* * * *");
        fours.add(a[i]);
    }
    if (a[i]==5) {
        j.setText("* * * * *");
        fives.add(a[i]);
    }
if (a[i]==6) {
        j.setText("* * * * * *");
        sixes.add(a[i]);
}

    };  
      void hesaplama(){
          
      }
    



    /**
     * Creates new form NewJFrame
     */
    public Yahtzee() {
    try {
        this.img = ImageIO.read(this.getClass().getResource("/image/Dice-1.png"));
    } catch (IOException ex) {
        Logger.getLogger(Yahtzee.class.getName()).log(Level.SEVERE, null, ex);
    }
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

        jFrame1 = new javax.swing.JFrame();
        jZar = new javax.swing.JButton();
        jzar1 = new javax.swing.JLabel();
        jZar2 = new javax.swing.JLabel();
        jZar3 = new javax.swing.JLabel();
        jZar4 = new javax.swing.JLabel();
        jZar5 = new javax.swing.JLabel();
        jconnect = new javax.swing.JButton();
        jname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jgiris = new javax.swing.JButton();

        jZar.setText("Zar At");
        jZar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jZarActionPerformed(evt);
            }
        });

        jzar1.setText("jLabel2");

        jZar2.setText("jLabel2");

        jZar3.setText("jLabel2");

        jZar4.setText("jLabel2");

        jZar5.setText("jLabel2");

        jconnect.setText("connect");
        jconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jconnect)
                    .addComponent(jzar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jZar2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jZar3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jZar4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jZar5))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jZar)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jZar)
                            .addComponent(jconnect))
                        .addGap(55, 55, 55)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jZar4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jZar5)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jzar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jZar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jZar3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı:");

        jgiris.setText("Giriş");
        jgiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addComponent(jgiris)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jgirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgirisActionPerformed
        // TODO add your handling code here:
       Yahtzee.players.add(jname);
      
        jFrame1.setVisible(true);
        jFrame1.pack();
    }//GEN-LAST:event_jgirisActionPerformed

    private void jZarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jZarActionPerformed
    
        // TODO add your handling code here:
        this.ZarAt(zar, 1, jzar1);
        this.ZarAt(zar, 2, jZar2);
        this.ZarAt(zar, 3, jZar3);
        this.ZarAt(zar, 4, jZar4);
        this.ZarAt(zar, 5, jZar5);
        System.out.println("");
        
       
        
        
    }//GEN-LAST:event_jZarActionPerformed

    private void jconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconnectActionPerformed
        // TODO add your  
        Client.Start("127.0.1",2000);
    }//GEN-LAST:event_jconnectActionPerformed

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
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yahtzee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jZar;
    private javax.swing.JLabel jZar2;
    private javax.swing.JLabel jZar3;
    private javax.swing.JLabel jZar4;
    private javax.swing.JLabel jZar5;
    private javax.swing.JButton jconnect;
    private javax.swing.JButton jgiris;
    private javax.swing.JTextField jname;
    private javax.swing.JLabel jzar1;
    // End of variables declaration//GEN-END:variables
}
