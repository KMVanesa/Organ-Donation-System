/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantArea;


import Business.LabTest.LabTest;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    DoctorRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, WorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = (DoctorRequest) request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bloodtypeTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        resultJTextField1 = new javax.swing.JTextField();
        infectiousTxt = new javax.swing.JTextField();
        sugarTxt = new javax.swing.JTextField();
        tissueTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, 30));
        add(bloodtypeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 88, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, -1, -1));
        add(resultJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 88, -1));
        add(infectiousTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 88, -1));
        add(sugarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 88, -1));
        add(tissueTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 88, -1));

        jLabel2.setText("Infectious Diseases");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 406, -1, 20));

        jLabel3.setText("Blood Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel4.setText("Tissue Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 20));

        jLabel5.setText("Blood Sugar");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        LabTest labtest = new LabTest();
        labtest.setBloodType(bloodtypeTxt.getText());
        labtest.setTissueType(tissueTxt.getText());
        labtest.setTestResult(resultJTextField1.getText());
        labtest.setInfectiousDiseases(infectiousTxt.getText());
        labtest.setBloodSugar(sugarTxt.getText());
        request.setLabtest(labtest);
        request.setStatus("Completed");
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodtypeTxt;
    private javax.swing.JTextField infectiousTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField resultJTextField1;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField sugarTxt;
    private javax.swing.JTextField tissueTxt;
    // End of variables declaration//GEN-END:variables
}
