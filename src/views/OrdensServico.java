package views;

import control.CarroController;
import control.ClienteController;
import control.OrdemServicoController;
import control.ServicoController;
import control.Servico_OSController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carro;
import model.Cliente;
import model.OrdemServico;
import model.Servico;
import model.Servico_OS;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class OrdensServico extends javax.swing.JInternalFrame {

    DefaultTableModel dTable;
    TabelaServicos ts;

    ClienteController cliControl = new ClienteController();
    CarroController carControl = new CarroController();
    OrdemServicoController osControl = new OrdemServicoController();
    ServicoController serControl = new ServicoController();
    Servico_OSController serOS = new Servico_OSController();

    ArrayList<Carro> carros;
    ArrayList<Cliente> clientes;
    ArrayList<OrdemServico> ordens;
    ArrayList<Servico> servicos = new ArrayList<>();

    int funcionario;

    public OrdensServico(int funcionario) {
        initComponents();
        this.preencheProcurar();
        AutoCompleteDecorator.decorate(comboResultados);
        AutoCompleteDecorator.decorate(comboSelectCarro);
        AutoCompleteDecorator.decorate(comboSelectCliente);
        this.funcionario = funcionario;
    }

    private void preencheProcurar() {
        ordens = osControl.getAll();
        clientes = cliControl.getAll();
        carros = carControl.getAll();
        comboResultados.setModel(osControl.procurar(comboTipo.getSelectedIndex()));
        comboSelectCarro.setModel(carControl.procurar(comboTipoCarro.getSelectedIndex()));
        comboSelectCliente.setModel(cliControl.procurar(comboTipoCliente.getSelectedIndex()));
        comboResultados.setSelectedIndex(0);
        comboSelectCarro.setSelectedIndex(0);
        comboSelectCliente.setSelectedIndex(0);
    }

    public void povoaTabela() {
        dTable = criaTabela();
        dTable.addColumn("Código");
        dTable.addColumn("Nome");
        dTable.addColumn("Valor");
        tableServicos.setModel(dTable);
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

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
        for (Servico servico : servicos) {
            dTable.addRow(new Object[]{servico.getCod(), servico.getDescricao(), servico.getValor()});
        }
        tableServicos.setModel(dTable);
        this.atualizaValor();
    }

    public void setServicosOS(ArrayList<Servico> servicos) {
        dTable = criaTabela();
        povoaTabela();
        for (Servico servico : servicos) {
            dTable.addRow(new Object[]{servico.getCod(), servico.getDescricao(), servico.getValor()});
        }
        tableServicos.setModel(dTable);
        this.atualizaValor();
    }

    public void atualizaValor() {
        double a = 0;
        for (int i = 0; i < dTable.getRowCount(); i++) {
            a = a + (double) dTable.getValueAt(i, 2);
        }
        labelValor.setText(String.valueOf(a));
    }

    private void preencher(OrdemServico os) {
        servicos = new ArrayList<>();
        labelCodigo.setText(String.valueOf(os.getCod()));
        labelData.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(os.getData()));
        switch (os.getSituacao()) {
            case 1:
                // Orçamento
                labelSituacao.setText("Orçamento");
                break;
            case 2:
                // Em Andamento
                labelSituacao.setText("Em Andamento");
                break;
            case 3:
                // Finalizada
                labelSituacao.setText("Finalizada");
                break;
            case 4:
                // Cancelada
                labelSituacao.setText("Cancelada");
                break;
        }
        labelValor.setText("");
        tfDescricao.setText(os.getDescricao());
        tfTipo.setText(os.getTipo());
        comboTipoCarro.setSelectedIndex(0);
        comboTipoCliente.setSelectedIndex(0);
        for (Carro carro : carros) {
            if (carro.getCod() == os.getCarCod()) {
                comboSelectCarro.setSelectedIndex(carros.indexOf(carro) + 1);
            }
        }
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == os.getCliCod()) {
                comboSelectCliente.setSelectedIndex(clientes.indexOf(cliente) + 1);
            }
        }
        this.setServicosOS(this.getServicosOS(os.getCod()));
    }

    private ArrayList<Servico> getServicosOS(int os) {
        for (Servico_OS ser : serOS.getAllOS(os)) {
            Servico servico = serControl.get(ser.getSvcCod());
            servicos.add(servico);
        }
        return servicos;
    }

    private void limpar() {
        labelCodigo.setText("");
        labelData.setText("");
        labelSituacao.setText("");
        labelValor.setText("");
        tfTipo.setText("");
        tfDescricao.setText("");
        comboResultados.setSelectedIndex(0);
        comboSelectCarro.setSelectedIndex(0);
        comboSelectCliente.setSelectedIndex(0);
        this.povoaTabela();
        servicos = new ArrayList<>();
    }

    private void editable(boolean flag) {
        buttonAdd.setEnabled(flag);
        buttonExc.setEnabled(flag);
        tfTipo.setEditable(flag);
        tfDescricao.setEditable(flag);
        comboTipoCarro.setEnabled(flag);
        comboTipoCliente.setEnabled(flag);
        comboSelectCarro.setEnabled(flag);
        comboSelectCliente.setEnabled(flag);
        tableServicos.setEnabled(flag);
    }

    private OrdemServico newOS() {
        OrdemServico os = new OrdemServico();
        // Tipo e Data definidos no Controller
        if (comboSelectCarro.getSelectedIndex() == 0) {
            os.setCarCod(0);
        } else {
            os.setCarCod(carros.get(comboSelectCarro.getSelectedIndex() - 1).getCod());
        }
        if (comboSelectCliente.getSelectedIndex() == 0) {
            os.setCarCod(0);
        } else {
            os.setCliCod(clientes.get(comboSelectCliente.getSelectedIndex() - 1).getCodigo());
        }
        os.setTipo(tfTipo.getText());
        os.setDescricao(tfDescricao.getText());
        return os;
    }

    private OrdemServico alteraOS(OrdemServico os) {
        if (comboSelectCarro.getSelectedIndex() == 0) {
            os.setCarCod(0);
        } else {
            os.setCarCod(carros.get(comboSelectCarro.getSelectedIndex() - 1).getCod());
        }
        if (comboSelectCliente.getSelectedIndex() == 0) {
            os.setCliCod(0);
        } else {
            os.setCliCod(clientes.get(comboSelectCliente.getSelectedIndex() - 1).getCodigo());
        }
        os.setTipo(tfTipo.getText());
        os.setDescricao(tfDescricao.getText());
        return os;
    }

    private boolean valida() {
        return Mensagens.errosValidacao(osControl.valida(newOS()));
    }

    private void setOSResultado(int id) {
        this.preencheProcurar();
        for (OrdemServico os : ordens) {
            if (os.getCod() == id) {
                comboResultados.setSelectedIndex(ordens.indexOf(os) + 1);
            }
        }
    }

    private void addServicos_OS(int osCod) {
        for (Servico ser : servicos) {
            Servico_OS os = new Servico_OS(ser.getCod(), osCod, funcionario);
            serOS.add(os);
        }
    }

    private void alteraServicos(int osCod) {
        for (Servico_OS serv : serOS.getAllOS(osCod)) {
            serOS.remove(serv.getCod());
        }
        this.addServicos_OS(osCod);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        panelProcurar = new javax.swing.JPanel();
        labelPor = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<String>();
        comboResultados = new javax.swing.JComboBox<String>();
        toolbarCrud = new javax.swing.JToolBar();
        buttonAdicionar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonEditar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        buttonExcluir = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        panelDados = new javax.swing.JPanel();
        labelMarca1 = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        comboTipoCarro = new javax.swing.JComboBox<String>();
        comboSelectCarro = new javax.swing.JComboBox<String>();
        comboSelectCliente = new javax.swing.JComboBox<String>();
        comboTipoCliente = new javax.swing.JComboBox<String>();
        labelMarca5 = new javax.swing.JLabel();
        labelMarca4 = new javax.swing.JLabel();
        labelMarca2 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        panelTabelaServicos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableServicos = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonExc = new javax.swing.JButton();
        panelValor = new javax.swing.JPanel();
        jLabel0 = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelSituacao = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem de Serviço");

        titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Ordem de Serviço");

        panelProcurar.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar"));

        labelPor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPor.setText("Por:");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Cliente", "Carro", "Data" }));
        comboTipo.setToolTipText("");
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        comboResultados.setEditable(true);
        comboResultados.setToolTipText("");
        comboResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboResultadosActionPerformed(evt);
            }
        });

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
                .addComponent(comboResultados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        panelProcurarLayout.setVerticalGroup(
            panelProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcurarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPor)
                    .addComponent(comboResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

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
        toolbarCrud.add(jSeparator2);

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

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        toolbarCrud.add(jSeparator3);

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

        panelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        labelMarca1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMarca1.setText("Tipo*:");

        tfTipo.setEditable(false);
        tfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipoActionPerformed(evt);
            }
        });
        tfTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTipoKeyTyped(evt);
            }
        });

        comboTipoCarro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboTipoCarro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Placa", "Chassi", "Dono" }));
        comboTipoCarro.setEnabled(false);
        comboTipoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoCarroActionPerformed(evt);
            }
        });

        comboSelectCarro.setEditable(true);
        comboSelectCarro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboSelectCarro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        comboSelectCarro.setToolTipText("");
        comboSelectCarro.setEnabled(false);

        comboSelectCliente.setEditable(true);
        comboSelectCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboSelectCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        comboSelectCliente.setToolTipText("");
        comboSelectCliente.setEnabled(false);

        comboTipoCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboTipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "CPF", "RG" }));
        comboTipoCliente.setEnabled(false);
        comboTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoClienteActionPerformed(evt);
            }
        });

        labelMarca5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMarca5.setText("Cliente*:");

        labelMarca4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMarca4.setText("Carro*:");

        labelMarca2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMarca2.setText("Descrição:");

        tfDescricao.setEditable(false);
        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });
        tfDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDescricaoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMarca5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMarca4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboTipoCliente, 0, 74, Short.MAX_VALUE)
                            .addComponent(comboTipoCarro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSelectCarro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSelectCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDadosLayout.createSequentialGroup()
                                .addComponent(labelMarca1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDadosLayout.createSequentialGroup()
                                .addComponent(labelMarca2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSelectCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSelectCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelTabelaServicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviços"));

        tableServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tableServicos.setEnabled(false);
        tableServicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableServicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableServicos);
        if (tableServicos.getColumnModel().getColumnCount() > 0) {
            tableServicos.getColumnModel().getColumn(0).setMinWidth(75);
            tableServicos.getColumnModel().getColumn(0).setMaxWidth(75);
            tableServicos.getColumnModel().getColumn(2).setMinWidth(120);
            tableServicos.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        buttonAdd.setText("Adicionar");
        buttonAdd.setEnabled(false);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonExc.setText("Excluir");
        buttonExc.setEnabled(false);
        buttonExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTabelaServicosLayout = new javax.swing.GroupLayout(panelTabelaServicos);
        panelTabelaServicos.setLayout(panelTabelaServicosLayout);
        panelTabelaServicosLayout.setHorizontalGroup(
            panelTabelaServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabelaServicosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonExc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(panelTabelaServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelTabelaServicosLayout.setVerticalGroup(
            panelTabelaServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTabelaServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));
        panelValor.setLayout(null);

        jLabel0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel0.setText("Valor:");
        panelValor.add(jLabel0);
        jLabel0.setBounds(420, 20, 31, 20);

        labelValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelValor.setText("____________");
        panelValor.add(labelValor);
        labelValor.setBounds(460, 20, 90, 20);

        jLabel1.setText("Código:");
        panelValor.add(jLabel1);
        jLabel1.setBounds(10, 20, 37, 20);
        panelValor.add(labelCodigo);
        labelCodigo.setBounds(50, 20, 50, 20);

        jLabel3.setText("Data:");
        panelValor.add(jLabel3);
        jLabel3.setBounds(100, 20, 27, 20);
        panelValor.add(labelData);
        labelData.setBounds(130, 20, 120, 20);

        jLabel5.setText("Situação:");
        panelValor.add(jLabel5);
        jLabel5.setBounds(270, 20, 45, 20);
        panelValor.add(labelSituacao);
        labelSituacao.setBounds(320, 20, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabelaServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTabelaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(toolbarCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        ts = new TabelaServicos(this);
        ts.setVisible(true);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcActionPerformed
        if (tableServicos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um serviço para excluir!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            servicos.remove(tableServicos.getSelectedRow());
            dTable.removeRow(tableServicos.getSelectedRow());
            tableServicos.setModel(dTable);
            this.atualizaValor();
        }
    }//GEN-LAST:event_buttonExcActionPerformed

    private void tfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoActionPerformed

    }//GEN-LAST:event_tfTipoActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        this.limpar();
        this.editable(true);
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (this.valida()) {
            if (comboResultados.getSelectedIndex() == 0) {
                int id = osControl.add(newOS());
                this.addServicos_OS(id);
                if (id != 0) {
                    Mensagens.sucessoCreate();
                    this.setOSResultado(id);
                }
            } else {
                osControl.altera(alteraOS(ordens.get(comboResultados.getSelectedIndex() - 1)));
                this.alteraServicos(ordens.get(comboResultados.getSelectedIndex() - 1).getCod());
                this.setOSResultado(ordens.get(comboResultados.getSelectedIndex() - 1).getCod());
                Mensagens.sucessoAlterar();
            }
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        this.limpar();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if (comboResultados.getSelectedIndex() != 0) {
            this.editable(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione alguma O.S para editar!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        if (comboResultados.getSelectedIndex() != 0) {
            osControl.remove(ordens.get(comboResultados.getSelectedIndex() - 1).getCod());
             for (Servico_OS serv : serOS.getAllOS(carros.get(comboResultados.getSelectedIndex() - 1).getCod())) {
            serOS.remove(serv.getCod());
        }
            this.editable(false);
            this.limpar();
            this.preencheProcurar();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione alguma O.S para excluir!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void comboResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboResultadosActionPerformed
        if ((comboResultados.getSelectedIndex() != 0) && (comboResultados.getSelectedIndex() != -1)) {
            this.preencher(ordens.get(comboResultados.getSelectedIndex() - 1));
            this.editable(false);
        }
    }//GEN-LAST:event_comboResultadosActionPerformed

    private void comboTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoClienteActionPerformed
        comboSelectCliente.setModel(cliControl.procurar(comboTipoCliente.getSelectedIndex()));
    }//GEN-LAST:event_comboTipoClienteActionPerformed

    private void comboTipoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoCarroActionPerformed
        comboSelectCarro.setModel(carControl.procurar(comboTipoCarro.getSelectedIndex()));
    }//GEN-LAST:event_comboTipoCarroActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        comboResultados.setModel(osControl.procurar(comboTipo.getSelectedIndex()));
    }//GEN-LAST:event_comboTipoActionPerformed

    private void tfTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTipoKeyTyped
        Mensagens.restringirTamanho(evt, 45);
    }//GEN-LAST:event_tfTipoKeyTyped

    private void tfDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescricaoKeyTyped
        Mensagens.restringirTamanho(evt, 45);
    }//GEN-LAST:event_tfDescricaoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExc;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboResultados;
    private javax.swing.JComboBox<String> comboSelectCarro;
    private javax.swing.JComboBox<String> comboSelectCliente;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox<String> comboTipoCarro;
    private javax.swing.JComboBox<String> comboTipoCliente;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelMarca1;
    private javax.swing.JLabel labelMarca2;
    private javax.swing.JLabel labelMarca4;
    private javax.swing.JLabel labelMarca5;
    private javax.swing.JLabel labelPor;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelValor;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelProcurar;
    private javax.swing.JPanel panelTabelaServicos;
    private javax.swing.JPanel panelValor;
    private javax.swing.JTable tableServicos;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JLabel titulo;
    private javax.swing.JToolBar toolbarCrud;
    // End of variables declaration//GEN-END:variables
}
