package views;

public class CadastroMecanico extends javax.swing.JInternalFrame {

    public CadastroMecanico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        panelProcurar = new javax.swing.JPanel();
        labelPor = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        comboResultaods = new javax.swing.JComboBox<>();
        panelDados = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoRg = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoTelefoneFixo = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        panelDados1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        campoCpf1 = new javax.swing.JTextField();
        campoNome1 = new javax.swing.JTextField();
        campoRg1 = new javax.swing.JTextField();
        campoEmail1 = new javax.swing.JTextField();
        campoTelefone1 = new javax.swing.JTextField();
        campoTelefoneFixo1 = new javax.swing.JTextField();
        comboSexo1 = new javax.swing.JComboBox<>();
        panelEndereco = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoNumero = new javax.swing.JTextField();
        campoCep = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        toolbarCrud = new javax.swing.JToolBar();
        buttonAdicionar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonEditar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonExcluir = new javax.swing.JButton();
        panelAcesso = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        campoNome2 = new javax.swing.JTextField();
        panelDados3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        campoCpf3 = new javax.swing.JTextField();
        campoNome3 = new javax.swing.JTextField();
        campoRg3 = new javax.swing.JTextField();
        campoEmail3 = new javax.swing.JTextField();
        campoTelefone3 = new javax.swing.JTextField();
        campoTelefoneFixo3 = new javax.swing.JTextField();
        comboSexo3 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mecânico");

        titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Mecânico");

        panelProcurar.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar"));

        labelPor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPor.setText("Por:");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "CPF", "RG" }));
        comboTipo.setToolTipText("");

        comboResultaods.setEditable(true);
        comboResultaods.setToolTipText("");

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
                .addComponent(comboResultaods, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        panelProcurarLayout.setVerticalGroup(
            panelProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcurarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPor)
                    .addComponent(comboResultaods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        panelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        panelDados.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Nome*:");
        panelDados.add(jLabel7);
        jLabel7.setBounds(37, 30, 50, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Sexo:");
        panelDados.add(jLabel8);
        jLabel8.setBounds(50, 210, 30, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Telefone*:");
        panelDados.add(jLabel10);
        jLabel10.setBounds(30, 150, 60, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Telefone Fixo:");
        panelDados.add(jLabel11);
        jLabel11.setBounds(10, 180, 76, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("CPF*:");
        panelDados.add(jLabel12);
        jLabel12.setBounds(47, 60, 40, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("RG*:");
        panelDados.add(jLabel13);
        jLabel13.setBounds(60, 90, 30, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Email:");
        panelDados.add(jLabel14);
        jLabel14.setBounds(50, 120, 35, 20);

        campoCpf.setEnabled(false);
        panelDados.add(campoCpf);
        campoCpf.setBounds(90, 60, 240, 20);

        campoNome.setEnabled(false);
        panelDados.add(campoNome);
        campoNome.setBounds(90, 30, 240, 20);

        campoRg.setEnabled(false);
        panelDados.add(campoRg);
        campoRg.setBounds(90, 90, 240, 20);

        campoEmail.setEnabled(false);
        panelDados.add(campoEmail);
        campoEmail.setBounds(90, 120, 240, 20);

        campoTelefone.setEnabled(false);
        panelDados.add(campoTelefone);
        campoTelefone.setBounds(90, 150, 240, 20);

        campoTelefoneFixo.setEnabled(false);
        panelDados.add(campoTelefoneFixo);
        campoTelefoneFixo.setBounds(90, 180, 240, 20);

        comboSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        comboSexo.setEnabled(false);
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });
        panelDados.add(comboSexo);
        comboSexo.setBounds(90, 210, 112, 20);

        panelDados1.setBackground(new java.awt.Color(255, 255, 255));
        panelDados1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        panelDados1.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Nome:");
        panelDados1.add(jLabel23);
        jLabel23.setBounds(50, 30, 37, 20);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Sexo:");
        panelDados1.add(jLabel24);
        jLabel24.setBounds(50, 210, 30, 20);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel25.setText("Telefone:");
        panelDados1.add(jLabel25);
        jLabel25.setBounds(30, 150, 60, 20);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setText("Telefone Fixo:");
        panelDados1.add(jLabel26);
        jLabel26.setBounds(10, 180, 76, 20);

        jLabel27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel27.setText("CPF:");
        panelDados1.add(jLabel27);
        jLabel27.setBounds(60, 60, 27, 20);

        jLabel28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel28.setText("RG:");
        panelDados1.add(jLabel28);
        jLabel28.setBounds(60, 90, 30, 20);

        jLabel29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel29.setText("Email:");
        panelDados1.add(jLabel29);
        jLabel29.setBounds(50, 120, 35, 20);
        panelDados1.add(campoCpf1);
        campoCpf1.setBounds(90, 60, 240, 20);
        panelDados1.add(campoNome1);
        campoNome1.setBounds(90, 30, 240, 20);
        panelDados1.add(campoRg1);
        campoRg1.setBounds(90, 90, 240, 20);
        panelDados1.add(campoEmail1);
        campoEmail1.setBounds(90, 120, 240, 20);
        panelDados1.add(campoTelefone1);
        campoTelefone1.setBounds(90, 150, 240, 20);
        panelDados1.add(campoTelefoneFixo1);
        campoTelefoneFixo1.setBounds(90, 180, 240, 20);

        comboSexo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        comboSexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexo1ActionPerformed(evt);
            }
        });
        panelDados1.add(comboSexo1);
        comboSexo1.setBounds(90, 210, 112, 20);

        panelDados.add(panelDados1);
        panelDados1.setBounds(0, 0, 0, 0);

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        panelEndereco.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("CEP:");
        panelEndereco.add(jLabel21);
        jLabel21.setBounds(60, 150, 40, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Complemento:");
        panelEndereco.add(jLabel22);
        jLabel22.setBounds(10, 180, 82, 20);

        campoRua.setEnabled(false);
        panelEndereco.add(campoRua);
        campoRua.setBounds(100, 60, 227, 20);

        campoBairro.setEnabled(false);
        panelEndereco.add(campoBairro);
        campoBairro.setBounds(100, 90, 227, 20);

        campoNumero.setEnabled(false);
        campoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroActionPerformed(evt);
            }
        });
        campoNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNumeroKeyTyped(evt);
            }
        });
        panelEndereco.add(campoNumero);
        campoNumero.setBounds(100, 30, 227, 20);

        campoCep.setEnabled(false);
        panelEndereco.add(campoCep);
        campoCep.setBounds(100, 150, 227, 20);

        campoCidade.setEnabled(false);
        panelEndereco.add(campoCidade);
        campoCidade.setBounds(100, 120, 227, 20);

        campoComplemento.setEnabled(false);
        panelEndereco.add(campoComplemento);
        campoComplemento.setBounds(100, 180, 227, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Número*:");
        panelEndereco.add(jLabel9);
        jLabel9.setBounds(40, 30, 60, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Rua*:");
        panelEndereco.add(jLabel18);
        jLabel18.setBounds(60, 60, 40, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Bairro*:");
        panelEndereco.add(jLabel19);
        jLabel19.setBounds(50, 90, 41, 20);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Cidade*:");
        panelEndereco.add(jLabel20);
        jLabel20.setBounds(45, 120, 48, 20);

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

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        toolbarCrud.add(jSeparator2);

        buttonExcluir.setBackground(new java.awt.Color(204, 204, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Lixeira-50.png"))); // NOI18N
        buttonExcluir.setFocusable(false);
        buttonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarCrud.add(buttonExcluir);

        panelAcesso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acesso"));
        panelAcesso.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Login:");
        panelAcesso.add(jLabel15);
        jLabel15.setBounds(70, 30, 34, 20);

        jLabel31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel31.setText("Senha:");
        panelAcesso.add(jLabel31);
        jLabel31.setBounds(60, 60, 40, 20);

        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setText("Confirmar Senha:");
        panelAcesso.add(jLabel32);
        jLabel32.setBounds(10, 90, 100, 20);

        campoNome2.setEnabled(false);
        panelAcesso.add(campoNome2);
        campoNome2.setBounds(110, 30, 240, 20);

        panelDados3.setBackground(new java.awt.Color(255, 255, 255));
        panelDados3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        panelDados3.setLayout(null);

        jLabel34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel34.setText("Nome:");
        panelDados3.add(jLabel34);
        jLabel34.setBounds(50, 30, 37, 20);

        jLabel35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("Sexo:");
        panelDados3.add(jLabel35);
        jLabel35.setBounds(50, 210, 30, 20);

        jLabel36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel36.setText("Telefone:");
        panelDados3.add(jLabel36);
        jLabel36.setBounds(30, 150, 60, 20);

        jLabel37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel37.setText("Telefone Fixo:");
        panelDados3.add(jLabel37);
        jLabel37.setBounds(10, 180, 76, 20);

        jLabel38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel38.setText("CPF:");
        panelDados3.add(jLabel38);
        jLabel38.setBounds(60, 60, 27, 20);

        jLabel39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel39.setText("RG:");
        panelDados3.add(jLabel39);
        jLabel39.setBounds(60, 90, 30, 20);

        jLabel40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel40.setText("Email:");
        panelDados3.add(jLabel40);
        jLabel40.setBounds(50, 120, 35, 20);
        panelDados3.add(campoCpf3);
        campoCpf3.setBounds(90, 60, 240, 20);
        panelDados3.add(campoNome3);
        campoNome3.setBounds(90, 30, 240, 20);
        panelDados3.add(campoRg3);
        campoRg3.setBounds(90, 90, 240, 20);
        panelDados3.add(campoEmail3);
        campoEmail3.setBounds(90, 120, 240, 20);
        panelDados3.add(campoTelefone3);
        campoTelefone3.setBounds(90, 150, 240, 20);
        panelDados3.add(campoTelefoneFixo3);
        campoTelefoneFixo3.setBounds(90, 180, 240, 20);

        comboSexo3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboSexo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        comboSexo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexo3ActionPerformed(evt);
            }
        });
        panelDados3.add(comboSexo3);
        comboSexo3.setBounds(90, 210, 112, 20);

        panelAcesso.add(panelDados3);
        panelDados3.setBounds(0, 0, 0, 0);

        jPasswordField1.setEnabled(false);
        panelAcesso.add(jPasswordField1);
        jPasswordField1.setBounds(110, 90, 240, 20);

        jPasswordField2.setEnabled(false);
        panelAcesso.add(jPasswordField2);
        jPasswordField2.setBounds(110, 60, 240, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelProcurar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelAcesso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(panelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

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

    private void comboSexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexo1ActionPerformed

    private void comboSexo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexo3ActionPerformed

    private void campoNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNumeroKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campoNumeroKeyTyped

    private void campoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroActionPerformed

    }//GEN-LAST:event_campoNumeroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoCpf1;
    private javax.swing.JTextField campoCpf3;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEmail1;
    private javax.swing.JTextField campoEmail3;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNome1;
    private javax.swing.JTextField campoNome2;
    private javax.swing.JTextField campoNome3;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRg;
    private javax.swing.JTextField campoRg1;
    private javax.swing.JTextField campoRg3;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoTelefone1;
    private javax.swing.JTextField campoTelefone3;
    private javax.swing.JTextField campoTelefoneFixo;
    private javax.swing.JTextField campoTelefoneFixo1;
    private javax.swing.JTextField campoTelefoneFixo3;
    private javax.swing.JComboBox<String> comboResultaods;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> comboSexo1;
    private javax.swing.JComboBox<String> comboSexo3;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JLabel labelPor;
    private javax.swing.JPanel panelAcesso;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelDados1;
    private javax.swing.JPanel panelDados3;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelProcurar;
    private javax.swing.JLabel titulo;
    private javax.swing.JToolBar toolbarCrud;
    // End of variables declaration//GEN-END:variables
}
