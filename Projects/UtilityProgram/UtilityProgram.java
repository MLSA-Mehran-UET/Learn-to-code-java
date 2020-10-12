
import java.awt.List;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isra Khan
 */
public class UtilityProgram extends javax.swing.JFrame {

   
    public UtilityProgram() {
        initComponents();
this.setBounds(0,0,600,600);
    }
    
    





   
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UtilityList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        ipTextField = new javax.swing.JTextField();
        ActionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Utility Program");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(175, 11, 191, 83);

        UtilityList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Calc", "Notepad", "mspaint"};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        UtilityList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                UtilityListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(UtilityList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(293, 100, 207, 406);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Remote IP Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 66, 134, 17);

        ipTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ipTextField);
        ipTextField.setBounds(20, 90, 190, 40);

        ActionButton.setText("Action");
        ActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ActionButton);
        ActionButton.setBounds(290, 510, 210, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipTextFieldActionPerformed
      
    }//GEN-LAST:event_ipTextFieldActionPerformed

    private void ActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionButtonActionPerformed
String ip=ipTextField.getText();
String cmd=(String)UtilityList.getSelectedValue();
try{    
Socket socket=new Socket(ip,9090);
PrintStream out=new PrintStream(socket.getOutputStream());
out.println(cmd);
out.close();
socket.close();
}catch(Exception e){e.printStackTrace();}
    
    }//GEN-LAST:event_ActionButtonActionPerformed

    private void UtilityListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_UtilityListValueChanged
        
        
       
    }//GEN-LAST:event_UtilityListValueChanged

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
            java.util.logging.Logger.getLogger(UtilityProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UtilityProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UtilityProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UtilityProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UtilityProgram().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActionButton;
    private javax.swing.JList UtilityList;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
