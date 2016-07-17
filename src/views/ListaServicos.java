package views;

import control.ServicosController;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Servico;

public class ListaServicos extends javax.swing.JInternalFrame {

    ServicosController serCon = new ServicosController();
    ArrayList<Servico> servicos;
    DefaultTableModel dTable;

    public ListaServicos() {
        initComponents();
        this.povoaTabela();
        tabelaServicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private DefaultTableModel criaTabela() {

        DefaultTableModel dTable = new DefaultTableModel() {

            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        ;

        };
         

    
    return dTable;
    }

    private void povoaTabela() {
        dTable = criaTabela();
        dTable.addColumn("Código");
        dTable.addColumn("Nome");
        dTable.addColumn("Valor");
        tabelaServicos.setModel(dTable);
        servicos = serCon.getAll();
        if (!servicos.isEmpty()){
               for (Servico servico : servicos) {
            dTable.addRow(new Object[]{servico.getCod(), servico.getDescricao(), servico.getValor()});
        }
        }
        tabelaServicos.setModel(dTable);
    }

    private int retornaLinha() {
        int linha = tabelaServicos.getSelectedRow();
        return linha;
    }

    private void pegaSelecionado() {
        int linha = tabelaServicos.getSelectedRow();
        tfNome.setText(servicos.get(linha).getDescricao());
        tfValor.setText(String.valueOf(servicos.get(linha).getValor()));
    }

    private Servico newServico() {
        Servico servico = new Servico(tfNome.getText(), Double.parseDouble(tfValor.getText()));

        return servico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaServicos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        toolbarCrud = new javax.swing.JToolBar();
        buttonAdicionar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonEditar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        buttonExcluir = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        labelAno = new javax.swing.JLabel();
        labelAno1 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();

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
        tabelaServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaServicosMouseClicked(evt);
            }
        });
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
        jScrollPane1.setBounds(30, 50, 590, 280);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviço"));

        toolbarCrud.setBackground(new java.awt.Color(204, 204, 255));
        toolbarCrud.setFloatable(false);
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
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        toolbarCrud.add(buttonEditar);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        toolbarCrud.add(jSeparator5);

        buttonExcluir.setBackground(new java.awt.Color(204, 204, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Lixeira-50.png"))); // NOI18N
        buttonExcluir.setFocusable(false);
        buttonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        toolbarCrud.add(buttonExcluir);

        tfNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfNome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tfNomeInputMethodTextChanged(evt);
            }
        });
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });

        labelAno.setText("Nome:*");

        labelAno1.setText("Valor:*");

        tfValor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfValor.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tfValorInputMethodTextChanged(evt);
            }
        });
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });
        tfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAno, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tfNomeInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeInputMethodTextChanged

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed

    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped

    }//GEN-LAST:event_tfNomeKeyTyped

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        serCon.add(newServico());
        this.povoaTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void tfValorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tfValorInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorInputMethodTextChanged

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed

    }//GEN-LAST:event_tfValorActionPerformed

    private void tfValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_tfValorKeyTyped

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        Servico servico = servicos.get(retornaLinha());
        servico.setDescricao(tfNome.getText());
        servico.setValor(Double.parseDouble(tfValor.getText()));
        serCon.altera(servico);
        this.povoaTabela();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void tabelaServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaServicosMouseClicked
        this.pegaSelecionado();
    }//GEN-LAST:event_tabelaServicosMouseClicked

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        Servico servico = servicos.get(retornaLinha());
        serCon.remove(servico.getCod()); 
        this.povoaTabela();
    }//GEN-LAST:event_buttonExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelAno1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tabelaServicos;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfValor;
    private javax.swing.JToolBar toolbarCrud;
    // End of variables declaration//GEN-END:variables
}
