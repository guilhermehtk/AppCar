package views;

public class CadastroCarro extends javax.swing.JInternalFrame {

    public CadastroCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButtons = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        panelProcurar = new javax.swing.JPanel();
        labelPor = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<String>();
        comboResultaods = new javax.swing.JComboBox<String>();
        titulo = new javax.swing.JLabel();
        panelDados = new javax.swing.JPanel();
        labelModelo2 = new javax.swing.JLabel();
        modelo2 = new javax.swing.JComboBox();
        labelCor = new javax.swing.JLabel();
        labelChassi = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        km = new javax.swing.JTextField();
        labelKm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        labelObs = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cor1 = new javax.swing.JComboBox();
        chassi1 = new javax.swing.JTextField();
        labelAno = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        modelo3 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        labelMarca1 = new javax.swing.JLabel();
        toolbarCrud = new javax.swing.JToolBar();
        buttonAdicionar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonEditar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        buttonExcluir = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carro");

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Checado-25.png"))); // NOI18N
        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelButtons.add(buttonSalvar);

        buttonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Limpar-25.png"))); // NOI18N
        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });
        panelButtons.add(buttonLimpar);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Cancelar-25.png"))); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setMaximumSize(null);
        buttonCancelar.setMinimumSize(null);
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelButtons.add(buttonCancelar);

        panelProcurar.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar"));

        labelPor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPor.setText("Por:");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Placa", "Chassi", "Dono" }));
        comboTipo.setToolTipText("");

        comboResultaods.setEditable(true);
        comboResultaods.setToolTipText("");
        comboResultaods.setFocusCycleRoot(true);

        javax.swing.GroupLayout panelProcurarLayout = new javax.swing.GroupLayout(panelProcurar);
        panelProcurar.setLayout(panelProcurarLayout);
        panelProcurarLayout.setHorizontalGroup(
            panelProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcurarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboResultaods, 0, 393, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        panelProcurarLayout.setVerticalGroup(
            panelProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcurarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPor)
                    .addComponent(comboResultaods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Carro");

        panelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        panelDados.setLayout(null);

        labelModelo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelModelo2.setText("Modelo:");
        panelDados.add(labelModelo2);
        labelModelo2.setBounds(10, 70, 50, 15);

        modelo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        modelo2.setEnabled(false);
        modelo2.setMinimumSize(new java.awt.Dimension(81, 20));
        modelo2.setPreferredSize(new java.awt.Dimension(81, 20));
        modelo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo2ActionPerformed(evt);
            }
        });
        panelDados.add(modelo2);
        modelo2.setBounds(60, 30, 110, 20);

        labelCor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCor.setText("Cor:");
        panelDados.add(labelCor);
        labelCor.setBounds(310, 30, 30, 20);

        labelChassi.setText("Número chassi:");
        panelDados.add(labelChassi);
        labelChassi.setBounds(10, 150, 80, 20);

        labelPlaca.setText("Placa:");
        panelDados.add(labelPlaca);
        labelPlaca.setBounds(10, 210, 70, 20);

        placa.setEnabled(false);
        placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaActionPerformed(evt);
            }
        });
        panelDados.add(placa);
        placa.setBounds(100, 210, 390, 20);

        km.setEnabled(false);
        panelDados.add(km);
        km.setBounds(100, 180, 390, 20);

        labelKm.setText("Quilometragem:");
        panelDados.add(labelKm);
        labelKm.setBounds(10, 180, 80, 20);

        obs.setColumns(20);
        obs.setRows(4);
        obs.setEnabled(false);
        jScrollPane1.setViewportView(obs);

        panelDados.add(jScrollPane1);
        jScrollPane1.setBounds(100, 240, 390, 80);

        labelObs.setText("Observações:");
        panelDados.add(labelObs);
        labelObs.setBounds(10, 240, 80, 20);
        panelDados.add(jSeparator6);
        jSeparator6.setBounds(440, 380, 0, 20);

        cor1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prata ", "Preto  ", "Branco ", "Cinza ", "Azul ", "Vermelho ", "Marrom/Bege ", "Verde ", "Amarelo/Dourado", " " }));
        cor1.setEnabled(false);
        cor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cor1ActionPerformed(evt);
            }
        });
        panelDados.add(cor1);
        cor1.setBounds(340, 30, 110, 20);

        chassi1.setEnabled(false);
        chassi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chassi1ActionPerformed(evt);
            }
        });
        panelDados.add(chassi1);
        chassi1.setBounds(100, 150, 390, 20);

        labelAno.setText("Ano:");
        panelDados.add(labelAno);
        labelAno.setBounds(10, 120, 30, 20);

        ano.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ano.setEnabled(false);
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
        panelDados.add(ano);
        ano.setBounds(100, 120, 390, 20);

        modelo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        modelo3.setEnabled(false);
        modelo3.setMinimumSize(new java.awt.Dimension(81, 20));
        modelo3.setPreferredSize(new java.awt.Dimension(81, 20));
        modelo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo3ActionPerformed(evt);
            }
        });
        panelDados.add(modelo3);
        modelo3.setBounds(60, 70, 110, 20);
        panelDados.add(jSeparator2);
        jSeparator2.setBounds(10, 100, 520, 10);

        labelMarca1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMarca1.setText("Marca:");
        panelDados.add(labelMarca1);
        labelMarca1.setBounds(10, 30, 50, 20);

        toolbarCrud.setBackground(new java.awt.Color(204, 204, 255));
        toolbarCrud.setFloatable(false);
        toolbarCrud.setOrientation(javax.swing.SwingConstants.VERTICAL);
        toolbarCrud.setRollover(true);

        buttonAdicionar.setBackground(new java.awt.Color(204, 204, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Adicionar-50.png"))); // NOI18N
        buttonAdicionar.setFocusable(false);
        buttonAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAdicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        toolbarCrud.add(buttonAdicionar);
        toolbarCrud.add(jSeparator1);

        buttonEditar.setBackground(new java.awt.Color(204, 204, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Editar-50.png"))); // NOI18N
        buttonEditar.setFocusable(false);
        buttonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarCrud.add(buttonEditar);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        toolbarCrud.add(jSeparator5);

        buttonExcluir.setBackground(new java.awt.Color(204, 204, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Lixeira-50.png"))); // NOI18N
        buttonExcluir.setFocusable(false);
        buttonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarCrud.add(buttonExcluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modelo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelo2ActionPerformed

    }//GEN-LAST:event_modelo2ActionPerformed

    private void placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaActionPerformed

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

    private void modelo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelo3ActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField chassi1;
    private javax.swing.JComboBox<String> comboResultaods;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox cor1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField km;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelChassi;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelKm;
    private javax.swing.JLabel labelMarca1;
    private javax.swing.JLabel labelModelo2;
    private javax.swing.JLabel labelObs;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPor;
    private javax.swing.JComboBox modelo2;
    private javax.swing.JComboBox modelo3;
    private javax.swing.JTextArea obs;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelProcurar;
    private javax.swing.JTextField placa;
    private javax.swing.JLabel titulo;
    private javax.swing.JToolBar toolbarCrud;
    // End of variables declaration//GEN-END:variables
}
