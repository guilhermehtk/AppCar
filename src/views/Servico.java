/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Alunos
 */
public class Servico extends javax.swing.JInternalFrame {

    /**
     * Creates new form Servico
     */
    public Servico() {
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

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cadastra3 = new javax.swing.JButton();
        cadastra1 = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        cadastra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTitulo.setText("Serviço");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(260, 10, 70, 22);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(120);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(1).setMinWidth(340);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(340);
            jTable1.getColumnModel().getColumn(2).setMinWidth(120);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 570, 420);

        cadastra3.setText("Adcionar");
        cadastra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastra3ActionPerformed(evt);
            }
        });
        jPanel1.add(cadastra3);
        cadastra3.setBounds(160, 430, 110, 20);

        cadastra1.setText("Excluir");
        cadastra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastra1ActionPerformed(evt);
            }
        });
        jPanel1.add(cadastra1);
        cadastra1.setBounds(330, 430, 110, 20);

        cancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Cancelar-25.png"))); // NOI18N
        cancela.setText("Cancelar");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });
        jPanel1.add(cancela);
        cancela.setBounds(410, 480, 110, 40);

        cadastra.setText("Salvar");
        cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraActionPerformed(evt);
            }
        });
        jPanel1.add(cadastra);
        cadastra.setBounds(30, 480, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 590, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastra3ActionPerformed

    private void cadastra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastra1ActionPerformed

    }//GEN-LAST:event_cadastra1ActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        dispose();
    }//GEN-LAST:event_cancelaActionPerformed

    private void cadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraActionPerformed

    }//GEN-LAST:event_cadastraActionPerformed

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
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastra;
    private javax.swing.JButton cadastra1;
    private javax.swing.JButton cadastra3;
    private javax.swing.JButton cancela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
