
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class CheckoutPage extends javax.swing.JFrame {

    /**
     * Creates new form fina
     */
    public CheckoutPage() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1953, 1089));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 70, 49, 30);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 255));
        jTextField2.setForeground(new java.awt.Color(255, 255, 0));
        jTextField2.setText("cvv");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(20, 68, 82, 30);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 204, 0));
        jTextField3.setText("Card number");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(20, 110, 82, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(140, 110, 49, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(200, 110, 55, 30);

        buttonGroup1.add(r1);
        r1.setText("Fedex(3-4 days)");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(410, 450, 170, 23);

        buttonGroup1.add(r2);
        r2.setText("DLF(6-8 days)");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(410, 480, 170, 23);

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setRows(5);
        jScrollPane2.setViewportView(TA1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 198, 166, 96);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(270, 110, 55, 30);

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(341, 194, 98, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("CREDIT CARD DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(213, 11, 160, 27);

        jTextField8.setEditable(false);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(341, 236, 98, 30);

        jLabel2.setText("Discount");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 250, 41, 14);

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(238, 197, 41, 14);

        jLabel4.setBackground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Mode of Shipping");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 420, 97, 28);

        jLabel5.setText("Shipping Price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 280, 66, 14);

        jTextField9.setEditable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(341, 274, 98, 30);

        jLabel6.setText("Total Price");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 320, 50, 14);

        jTextField10.setEditable(false);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(341, 312, 98, 30);

        jButton2.setText("Checkout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 380, 100, 30);

        jTextField11.setEditable(false);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(104, 379, 6, 20);

        jTextField12.setEditable(false);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(204, 379, 6, 20);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 430, 73, 23);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Batman-Arkham-Knight[1].jpg"))); // NOI18N
        getContentPane().add(jButton4);
        jButton4.setBounds(-10, 0, 720, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int sk, up, down, right, hh, h, hht;
    String aka, akb, akc;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextField11.setVisible(false);
        jTextField12.setVisible(false);
        jTextField11.setText("" + BManQuiz.op);
        jTextField12.setText(MagicSquare.tot);
        int aa = Integer.parseInt(jTextField11.getText());
        int bb = Integer.parseInt(jTextField12.getText());
        int cc = aa + bb;
        jTextField8.setText("" + cc);
        TA1.setText(StorePage.ss);
        jTextField7.setText(StorePage.sr);
        jTextField8.setText(BManQuiz.op + MagicSquare.yui + "");
        if (r1.isSelected() == true) {
            sk = 43;
        } else if (r2.isSelected() == true) {
            sk = 23;
        }
        jTextField9.setText("" + sk);
        int a = Integer.parseInt(jTextField7.getText());
        int b = Integer.parseInt(jTextField8.getText());
        int c = Integer.parseInt(jTextField9.getText());
        int kk = a - b + c;
        jTextField10.setText("" + kk);
        jButton3.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        jTextField9.setText("" + 40);
    }//GEN-LAST:event_r2ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ((r1.isSelected() == true || r2.isSelected() == true) && (jTextField1.getText() != "") && (jTextField2.getText() != "") && (jTextField3.getText() != "") && (jTextField4.getText() != "")) {
            aka = "" + (Integer.parseInt(StorePage.ab));
            akb = "" + (Integer.parseInt(StorePage.bc));
            akc = "" + (Integer.parseInt(StorePage.bd));
            up = 3 - Integer.parseInt(aka);
            down = 3 - Integer.parseInt(akb);
            right = 3 - Integer.parseInt(akc);
            h = StorePage.pore;
            hh = StorePage.pore1;
            hht = StorePage.pore2;
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/12pro", "root", "mysql");
                Statement stmt = con.createStatement();
                String query = "Update merch set stock ='" + h + "' where priceperitem='200';";
                String query1 = "Update merch set stock = '" + hh + "' where merchandise='Keychain';";
                String query2 = "Update merch set stock ='" + hht + "' where merchandise='Actionfigure';";
                stmt.executeUpdate(query);
                stmt.executeUpdate(query1);
                stmt.executeUpdate(query2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter necessary details");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        jTextField9.setText("" + 60);
    }//GEN-LAST:event_r1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.print(up);
        System.out.println(down);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckoutPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea TA1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    // End of variables declaration//GEN-END:variables
}
