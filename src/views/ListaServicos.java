package views;

public class ListaServicos extends javax.swing.JInternalFrame {

    public ListaServicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaServicos = new javax.swing.JTable();
        panelButtonsTable = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonExc = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        cadastra = new javax.swing.JButton();
        cancela = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Serviços");
        setMaximumSize(new java.awt.Dimension(666, 618));
        setMinimumSize(new java.awt.Dimension(666, 618));
        setPreferredSize(new java.awt.Dimension(666, 618));

        panelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelPrincipal.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Lista de Serviços");
        labelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelPrincipal.add(labelTitulo);
        labelTitulo.setBounds(0, 10, 640, 22);

        tabelaServicos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaServicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaServicos);
        if (tabelaServicos.getColumnModel().getColumnCount() > 0) {
            tabelaServicos.getColumnModel().getColumn(0).setMinWidth(120);
            tabelaServicos.getColumnModel().getColumn(0).setMaxWidth(120);
            tabelaServicos.getColumnModel().getColumn(1).setMinWidth(340);
            tabelaServicos.getColumnModel().getColumn(1).setMaxWidth(340);
            tabelaServicos.getColumnModel().getColumn(2).setMinWidth(120);
            tabelaServicos.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        panelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 580, 420);

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Checado-25.png"))); // NOI18N
        buttonAdd.setText("Adicionar");
        buttonAdd.setMaximumSize(new java.awt.Dimension(113, 33));
        buttonAdd.setMinimumSize(new java.awt.Dimension(113, 33));
        buttonAdd.setPreferredSize(new java.awt.Dimension(113, 33));
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        panelButtonsTable.add(buttonAdd);

        buttonExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Cancelar-25.png"))); // NOI18N
        buttonExc.setText("Excluir");
        buttonExc.setMaximumSize(new java.awt.Dimension(103, 33));
        buttonExc.setMinimumSize(new java.awt.Dimension(103, 33));
        buttonExc.setPreferredSize(new java.awt.Dimension(103, 33));
        buttonExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcActionPerformed(evt);
            }
        });
        panelButtonsTable.add(buttonExc);

        panelPrincipal.add(panelButtonsTable);
        panelButtonsTable.setBounds(10, 473, 620, 40);

        cadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Checado-25.png"))); // NOI18N
        cadastra.setText("Salvar");
        cadastra.setMaximumSize(new java.awt.Dimension(103, 33));
        cadastra.setMinimumSize(new java.awt.Dimension(103, 33));
        cadastra.setPreferredSize(new java.awt.Dimension(103, 33));
        cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraActionPerformed(evt);
            }
        });
        panelButtons.add(cadastra);

        cancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Cancelar-25.png"))); // NOI18N
        cancela.setText("Cancelar");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });
        panelButtons.add(cancela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelButtons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcActionPerformed

    }//GEN-LAST:event_buttonExcActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        dispose();
    }//GEN-LAST:event_cancelaActionPerformed

    private void cadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraActionPerformed

    }//GEN-LAST:event_cadastraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonExc;
    private javax.swing.JButton cadastra;
    private javax.swing.JButton cancela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonsTable;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tabelaServicos;
    // End of variables declaration//GEN-END:variables
}
