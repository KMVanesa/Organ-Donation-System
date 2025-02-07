/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OPTC_Registry;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OPTC_Enterprise;
import Business.Main.EcoSystem;
import Business.Organization.OPTC_Registry;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.OPTC_Request;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chief_kmv
 */
public class OPTCRegistryMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form OPTCRegistryMainPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem business;
    private OPTC_Enterprise enterprise;

    public OPTCRegistryMainPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.account = account;
        this.enterprise = (OPTC_Enterprise) enterprise;
        this.business = business;
        this.userProcessContainer = userProcessContainer;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecieverListBtn = new javax.swing.JButton();
        newReqBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RecieverListBtn.setText("Manage Reciever List");
        RecieverListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecieverListBtnActionPerformed(evt);
            }
        });
        add(RecieverListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        newReqBtn.setText("Manage New Requests");
        newReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReqBtnActionPerformed(evt);
            }
        });
        add(newReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void newReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReqBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new ManageNewRequests( userProcessContainer, account, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_newReqBtnActionPerformed

    private void RecieverListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecieverListBtnActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new ManageRecieverList(userProcessContainer, account, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RecieverListBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecieverListBtn;
    private javax.swing.JButton newReqBtn;
    // End of variables declaration//GEN-END:variables
}
