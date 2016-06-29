package views;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public final class CadastraCarro extends javax.swing.JInternalFrame implements InternalFrameListener{

    public CadastraCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelModelo = new javax.swing.JLabel();
        modelo = new javax.swing.JComboBox();
        labelCor = new javax.swing.JLabel();
        labelChassi = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        km = new javax.swing.JTextField();
        labelKm = new javax.swing.JLabel();
        cadastra = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        labelObs = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        cor1 = new javax.swing.JComboBox();
        labelTitulo = new javax.swing.JLabel();
        chassi1 = new javax.swing.JTextField();
        labelAno = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        modelo1 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jSeparator2 = new javax.swing.JSeparator();
        labelTitulo1 = new javax.swing.JLabel();
        labelMarca1 = new javax.swing.JLabel();
        labelMarca2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Cadastro de Carro");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        labelModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelModelo.setText("Modelo:");
        jPanel1.add(labelModelo);
        labelModelo.setBounds(10, 180, 50, 15);

        modelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        modelo.setMinimumSize(new java.awt.Dimension(81, 20));
        modelo.setPreferredSize(new java.awt.Dimension(81, 20));
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });
        jPanel1.add(modelo);
        modelo.setBounds(60, 140, 110, 20);

        labelCor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCor.setText("Cor:");
        jPanel1.add(labelCor);
        labelCor.setBounds(290, 140, 30, 20);

        labelChassi.setText("Número chassi:");
        jPanel1.add(labelChassi);
        labelChassi.setBounds(10, 260, 80, 20);

        labelPlaca.setText("Placa:");
        jPanel1.add(labelPlaca);
        labelPlaca.setBounds(10, 320, 70, 20);

        placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaActionPerformed(evt);
            }
        });
        jPanel1.add(placa);
        placa.setBounds(100, 320, 390, 20);
        jPanel1.add(km);
        km.setBounds(100, 290, 390, 20);

        labelKm.setText("Quilometragem:");
        jPanel1.add(labelKm);
        labelKm.setBounds(10, 290, 80, 20);

        cadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Checado-25.png"))); // NOI18N
        cadastra.setText("Cadastrar");
        cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraActionPerformed(evt);
            }
        });
        jPanel1.add(cadastra);
        cadastra.setBounds(30, 440, 110, 40);

        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Limpar-25.png"))); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel1.add(limpar);
        limpar.setBounds(200, 440, 110, 40);

        cancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Cancelar-25.png"))); // NOI18N
        cancela.setText("Cancelar");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });
        jPanel1.add(cancela);
        cancela.setBounds(400, 440, 110, 40);

        obs.setColumns(20);
        obs.setRows(5);
        jScrollPane1.setViewportView(obs);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 350, 390, 80);

        labelObs.setText("Observações:");
        jPanel1.add(labelObs);
        labelObs.setBounds(10, 350, 80, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 100, 540, 10);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(440, 380, 0, 20);

        cor1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prata ", "Preto  ", "Branco ", "Cinza ", "Azul ", "Vermelho ", "Marrom/Bege ", "Verde ", "Amarelo/Dourado", " " }));
        cor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cor1ActionPerformed(evt);
            }
        });
        jPanel1.add(cor1);
        cor1.setBounds(340, 140, 110, 20);

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTitulo.setText("Procurar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(10, 10, 120, 22);

        chassi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chassi1ActionPerformed(evt);
            }
        });
        jPanel1.add(chassi1);
        chassi1.setBounds(100, 260, 390, 20);

        labelAno.setText("Ano:");
        jPanel1.add(labelAno);
        labelAno.setBounds(10, 230, 70, 20);

        ano.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ano.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                anoInputMethodTextChanged(evt);
            }
        });
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });
        ano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anoKeyTyped(evt);
            }
        });
        jPanel1.add(ano);
        ano.setBounds(100, 230, 390, 20);

        modelo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        modelo1.setMinimumSize(new java.awt.Dimension(81, 20));
        modelo1.setPreferredSize(new java.awt.Dimension(81, 20));
        modelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo1ActionPerformed(evt);
            }
        });
        jPanel1.add(modelo1);
        modelo1.setBounds(60, 180, 110, 20);

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox1.setToolTipText("");
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(130, 70, 400, 21);

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Placa", "Chassi", "Dono" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(10, 70, 90, 21);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 210, 540, 10);

        labelTitulo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTitulo1.setText("Carro");
        jPanel1.add(labelTitulo1);
        labelTitulo1.setBounds(220, 110, 60, 22);

        labelMarca1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMarca1.setText("Marca:");
        jPanel1.add(labelMarca1);
        labelMarca1.setBounds(10, 140, 50, 20);

        labelMarca2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMarca2.setText("Por:");
        jPanel1.add(labelMarca2);
        labelMarca2.setBounds(10, 40, 50, 20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 649;
        gridBagConstraints.ipady = 489;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        dispose();
    }//GEN-LAST:event_cancelaActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed

    }//GEN-LAST:event_limparActionPerformed

    private void cadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraActionPerformed

    }//GEN-LAST:event_cadastraActionPerformed

    private void placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed

    }//GEN-LAST:event_modeloActionPerformed

    private void cor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cor1ActionPerformed

    private void chassi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chassi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chassi1ActionPerformed

    private void anoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_anoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_anoInputMethodTextChanged

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed

    }//GEN-LAST:event_anoActionPerformed

    private void anoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        if (ano.getText().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_anoKeyTyped

    private void modelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastra;
    private javax.swing.JButton cancela;
    private javax.swing.JTextField chassi1;
    private javax.swing.JComboBox cor1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField km;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelChassi;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelKm;
    private javax.swing.JLabel labelMarca1;
    private javax.swing.JLabel labelMarca2;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelObs;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JButton limpar;
    private javax.swing.JComboBox modelo;
    private javax.swing.JComboBox modelo1;
    private javax.swing.JTextArea obs;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
 this.setVisible(false);
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
      this.setVisible(false);
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        this.setVisible(false);
    }

  
}
