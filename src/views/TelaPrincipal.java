package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import model.Funcionario;
import model.dao.FuncionarioDao;

public class TelaPrincipal extends javax.swing.JFrame {

    Funcionario usuario;

    public TelaPrincipal(int idUsuario) {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.initMaximized();
        jToolbarTop.setFloatable(false);
        // Icone
        this.setIconImage(new ImageIcon(getClass().getResource("/views/icons/AppCar.png")).getImage());
        // Nome do Usuário
        usuario = new FuncionarioDao().get(idUsuario);
        labelUsuario.setText(this.usuario.getNome());
        // Versão
        labelVersao.setText("1.0");
    }

    private void initMaximized() {
        int inset = 50;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(inset, inset,
                screenSize.width - inset * 2,
                screenSize.height - inset * 2);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        footer = new javax.swing.JPanel();
        labelVersao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        imagemFundo = new javax.swing.JLabel();
        jToolbarTop = new javax.swing.JToolBar();
        buttonUsuario = new javax.swing.JButton();
        buttonCarro = new javax.swing.JButton();
        buttoOs = new javax.swing.JButton();
        buttonServico = new javax.swing.JButton();
        buttonMecanico = new javax.swing.JButton();
        buttonSettings = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuUsuario = new javax.swing.JMenuItem();
        menuCarro = new javax.swing.JMenuItem();
        menuOs = new javax.swing.JMenu();
        menuGeraOs = new javax.swing.JMenuItem();
        menuListaServico = new javax.swing.JMenuItem();
        menuPainelControle = new javax.swing.JMenu();
        menuMecanico = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuMecanico1 = new javax.swing.JMenuItem();
        menuMecanico2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AppCar");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(939, 665));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jDesktopPane1AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jDesktopPane1AncestorResized(evt);
            }
        });
        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentResized(evt);
            }
        });

        footer.setBackground(new java.awt.Color(255, 255, 255));
        footer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelVersao.setText("1.0");

        jLabel3.setText("Versão:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText(" Usuário:");

        labelUsuario.setText("Guilherme Henrique ");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(labelVersao)
                .addGap(6, 6, 6))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelVersao)
                        .addComponent(jLabel3))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(labelUsuario))))
        );

        imagemFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Fundo.png"))); // NOI18N
        imagemFundo.setDisabledIcon(null);

        jToolbarTop.setBackground(new java.awt.Color(204, 204, 255));
        jToolbarTop.setBorder(null);
        jToolbarTop.setRollover(true);

        buttonUsuario.setBackground(new java.awt.Color(204, 204, 255));
        buttonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Usuario-35.png"))); // NOI18N
        buttonUsuario.setToolTipText("Usuários");
        buttonUsuario.setFocusable(false);
        buttonUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUsuarioActionPerformed(evt);
            }
        });
        jToolbarTop.add(buttonUsuario);

        buttonCarro.setBackground(new java.awt.Color(204, 204, 255));
        buttonCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Carro-35.png"))); // NOI18N
        buttonCarro.setToolTipText("Carro");
        buttonCarro.setFocusable(false);
        buttonCarro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCarro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCarroActionPerformed(evt);
            }
        });
        jToolbarTop.add(buttonCarro);

        buttoOs.setBackground(new java.awt.Color(204, 204, 255));
        buttoOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/OS-35.png"))); // NOI18N
        buttoOs.setToolTipText("Ordem de Serviço");
        buttoOs.setFocusable(false);
        buttoOs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttoOs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttoOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoOsActionPerformed(evt);
            }
        });
        jToolbarTop.add(buttoOs);

        buttonServico.setBackground(new java.awt.Color(204, 204, 255));
        buttonServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Pistao-35.png"))); // NOI18N
        buttonServico.setToolTipText("Lista de Serviço");
        buttonServico.setFocusable(false);
        buttonServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonServicoActionPerformed(evt);
            }
        });
        jToolbarTop.add(buttonServico);

        buttonMecanico.setBackground(new java.awt.Color(204, 204, 255));
        buttonMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Mecanico-35.png"))); // NOI18N
        buttonMecanico.setToolTipText("Mecânico");
        buttonMecanico.setFocusable(false);
        buttonMecanico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMecanico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMecanicoActionPerformed(evt);
            }
        });
        jToolbarTop.add(buttonMecanico);

        buttonSettings.setBackground(new java.awt.Color(204, 204, 255));
        buttonSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Settings-35.png"))); // NOI18N
        buttonSettings.setToolTipText("Configurações");
        buttonSettings.setFocusable(false);
        buttonSettings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSettings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSettingsActionPerformed(evt);
            }
        });
        jToolbarTop.add(buttonSettings);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolbarTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imagemFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jToolbarTop, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagemFundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1.setLayer(footer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(imagemFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jToolbarTop, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuCadastros.setText("Cadastros");
        menuCadastros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Usuario-25.png"))); // NOI18N
        menuUsuario.setText("Cliente");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        menuCadastros.add(menuUsuario);

        menuCarro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        menuCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Carro-25.png"))); // NOI18N
        menuCarro.setText("Carros");
        menuCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCarroActionPerformed(evt);
            }
        });
        menuCadastros.add(menuCarro);

        menuPrincipal.add(menuCadastros);

        menuOs.setText("O.S");
        menuOs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuGeraOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        menuGeraOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/OS-25.png"))); // NOI18N
        menuGeraOs.setText("Abrir O.S");
        menuGeraOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGeraOsActionPerformed(evt);
            }
        });
        menuOs.add(menuGeraOs);

        menuListaServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        menuListaServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Pistao-25.png"))); // NOI18N
        menuListaServico.setText("Lista de Serviços ");
        menuListaServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListaServicoActionPerformed(evt);
            }
        });
        menuOs.add(menuListaServico);

        menuPrincipal.add(menuOs);

        menuPainelControle.setText("Painel de Controle");

        menuMecanico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        menuMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Mecanico-25.png"))); // NOI18N
        menuMecanico.setText("Funcionários");
        menuMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMecanicoActionPerformed(evt);
            }
        });
        menuPainelControle.add(menuMecanico);

        menuPrincipal.add(menuPainelControle);

        menuAjuda.setText("Ajuda");
        menuAjuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuMecanico1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuMecanico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Checado-25.png"))); // NOI18N
        menuMecanico1.setText("Ajuda");
        menuMecanico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMecanico1ActionPerformed(evt);
            }
        });
        menuAjuda.add(menuMecanico1);

        menuMecanico2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuMecanico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Checado-25.png"))); // NOI18N
        menuMecanico2.setText("Sobre");
        menuMecanico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMecanico2ActionPerformed(evt);
            }
        });
        menuAjuda.add(menuMecanico2);

        menuPrincipal.add(menuAjuda);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addInternalFrame(JInternalFrame internal) {
        // Adicionando ao DesktopPane
        jDesktopPane1.add(internal);

        // Centralizando
        centralizeInternalFrame(internal);

        // Visível
        internal.setVisible(true);
    }

    private void disposeAll() {
        // Fechando Todos os JInternalFrames Abertos
        JInternalFrame[] array = jDesktopPane1.getAllFrames();
        for (JInternalFrame internals : array) {
            internals.dispose();
        }
    }

    private void centralizeInternalFrame(JInternalFrame internal) {
        // Centraliza os JInternalFrames
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = internal.getSize();
        internal.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    private void onResize() {
        // Centraliza todos os JInternalFrames quando há resize do JDesktopPane
        JInternalFrame[] array = jDesktopPane1.getAllFrames();
        for (JInternalFrame internal : array) {
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = internal.getSize();
            internal.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
        }
    }

    private void addInternal(JInternalFrame internal) {
        Boolean flag = false;
        JInternalFrame[] array = jDesktopPane1.getAllFrames();

        // Removendo se estiver aberto
        for (JInternalFrame internals : array) {
            if (internals.equals(internal)) {
                internals.dispose();
                jDesktopPane1.remove(internal);
                flag = true;
                break;
            }
        }

        // Adicionando caso não esteja aberto
        if (!flag) {
            addInternalFrame(internal);
        }
    }

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        addInternal(new ClienteView());
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void menuMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMecanicoActionPerformed
        addInternal(new FuncionarioView());
    }//GEN-LAST:event_menuMecanicoActionPerformed

    private void menuCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCarroActionPerformed
        addInternal(new CarroView());
    }//GEN-LAST:event_menuCarroActionPerformed

    private void menuGeraOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGeraOsActionPerformed
        addInternal(new OrdemServico());
    }//GEN-LAST:event_menuGeraOsActionPerformed

    private void menuListaServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListaServicoActionPerformed
        addInternal(new ListaServicos());
    }//GEN-LAST:event_menuListaServicoActionPerformed

    private void buttonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUsuarioActionPerformed
        addInternal(new ClienteView());
    }//GEN-LAST:event_buttonUsuarioActionPerformed

    private void buttonCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCarroActionPerformed
        addInternal(new CarroView());
    }//GEN-LAST:event_buttonCarroActionPerformed

    private void buttoOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoOsActionPerformed
        addInternal(new OrdemServico());
    }//GEN-LAST:event_buttoOsActionPerformed

    private void buttonServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonServicoActionPerformed
        addInternal(new ListaServicos());
    }//GEN-LAST:event_buttonServicoActionPerformed

    private void buttonMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMecanicoActionPerformed
        addInternal(new FuncionarioView());
    }//GEN-LAST:event_buttonMecanicoActionPerformed

    private void buttonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSettingsActionPerformed
        addInternal(new ClienteView());
    }//GEN-LAST:event_buttonSettingsActionPerformed

    private void jDesktopPane1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentResized
        onResize();
    }//GEN-LAST:event_jDesktopPane1ComponentResized

    private void jDesktopPane1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jDesktopPane1AncestorResized

    }//GEN-LAST:event_jDesktopPane1AncestorResized

    private void jDesktopPane1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jDesktopPane1AncestorMoved

    }//GEN-LAST:event_jDesktopPane1AncestorMoved

    private void jDesktopPane1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentMoved

    }//GEN-LAST:event_jDesktopPane1ComponentMoved

    private void menuMecanico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMecanico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMecanico1ActionPerformed

    private void menuMecanico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMecanico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMecanico2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoOs;
    private javax.swing.JButton buttonCarro;
    private javax.swing.JButton buttonMecanico;
    private javax.swing.JButton buttonServico;
    private javax.swing.JButton buttonSettings;
    private javax.swing.JButton buttonUsuario;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolbarTop;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelVersao;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuCarro;
    private javax.swing.JMenuItem menuGeraOs;
    private javax.swing.JMenuItem menuListaServico;
    private javax.swing.JMenuItem menuMecanico;
    private javax.swing.JMenuItem menuMecanico1;
    private javax.swing.JMenuItem menuMecanico2;
    private javax.swing.JMenu menuOs;
    private javax.swing.JMenu menuPainelControle;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem menuUsuario;
    // End of variables declaration//GEN-END:variables
}
