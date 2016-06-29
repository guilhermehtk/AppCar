package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;

public class TelaPrincipal extends javax.swing.JFrame {

    CadastroMecanico cadastroMecanico = new CadastroMecanico();
    CadastroUsuario cadastroUsuario = new CadastroUsuario();
    CadastraCarro cadastroCarro = new CadastraCarro();

    public TelaPrincipal() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.initMaximized();
        jLabel2.setText("1.0");
        jToolbarTop.setFloatable(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuOs = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuPainelControle = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();

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

        jLabel2.setText("1.0");

        jLabel3.setText("Versão:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText(" Usuário:");

        jLabel5.setText("Guilherme Henrique ");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(6, 6, 6))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))))
        );

        imagemFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Fundo.png"))); // NOI18N
        imagemFundo.setDisabledIcon(null);

        jToolbarTop.setBackground(new java.awt.Color(204, 204, 255));
        jToolbarTop.setBorder(null);
        jToolbarTop.setRollover(true);

        buttonUsuario.setBackground(new java.awt.Color(204, 204, 255));
        buttonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Usuario-35.png"))); // NOI18N
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

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Usuario-25.png"))); // NOI18N
        jMenuItem2.setText("Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Carro-25.png"))); // NOI18N
        jMenuItem3.setText("Carros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem3);

        menuPrincipal.add(menuCadastros);

        menuOs.setText("O.S");
        menuOs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/OS-25.png"))); // NOI18N
        jMenuItem4.setText("Abrir O.S");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuOs.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Pistao-25.png"))); // NOI18N
        jMenuItem5.setText("Serviços ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuOs.add(jMenuItem5);

        menuPrincipal.add(menuOs);

        menuPainelControle.setText("Painel de Controle");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Mecanico-25.png"))); // NOI18N
        jMenuItem6.setText("Cadastro de Mecânico");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuPainelControle.add(jMenuItem6);

        menuPrincipal.add(menuPainelControle);

        menuAjuda.setText("Ajuda");
        menuAjuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        jDesktopPane1.add(internal, 0);
internal.setBounds(0, 0,300,300);
        internal.setBackground(Color.white);
        internal.setVisible(true);
    }

    private void disposeAll() {
        JInternalFrame[] array = jDesktopPane1.getAllFrames();
        for (JInternalFrame internals : array) {
            internals.dispose();
        }
    }

    private void resizeInternalsFrames() {
        int x = jDesktopPane1.getHeight() - footer.getHeight() - jToolbarTop.getHeight();
        JInternalFrame[] array = jDesktopPane1.getAllFrames();
        for (JInternalFrame internal : array) {
            internal.setBounds(0, jToolbarTop.getHeight(), jDesktopPane1.getWidth(), x);
        }
    }

    private void addInternal(JInternalFrame internal) {
        Boolean flag = false;
        JInternalFrame[] array = jDesktopPane1.getAllFrames();

        for (JInternalFrame internals : array) {
            if (internals.equals(internal)) {
                internals.dispose();
                jDesktopPane1.remove(internal);
                flag = true;
                break;
            }
        }
        if (!flag) {
            addInternalFrame(internal);
        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        addInternal(cadastroUsuario);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        addInternal(cadastroMecanico);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        addInternal(cadastroCarro);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        addInternal(cadastroUsuario);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        addInternal(cadastroUsuario);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void buttonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUsuarioActionPerformed
        addInternal(cadastroUsuario);
    }//GEN-LAST:event_buttonUsuarioActionPerformed

    private void buttonCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCarroActionPerformed
        addInternal(cadastroCarro);
    }//GEN-LAST:event_buttonCarroActionPerformed

    private void buttoOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoOsActionPerformed
        addInternal(cadastroUsuario);
    }//GEN-LAST:event_buttoOsActionPerformed

    private void buttonServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonServicoActionPerformed
        addInternal(cadastroUsuario);
    }//GEN-LAST:event_buttonServicoActionPerformed

    private void buttonMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMecanicoActionPerformed
        addInternal(cadastroMecanico);
    }//GEN-LAST:event_buttonMecanicoActionPerformed

    private void buttonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSettingsActionPerformed
        addInternal(cadastroUsuario);
    }//GEN-LAST:event_buttonSettingsActionPerformed

    private void jDesktopPane1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentResized
        resizeInternalsFrames();
    }//GEN-LAST:event_jDesktopPane1ComponentResized

    private void jDesktopPane1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jDesktopPane1AncestorResized
     
    }//GEN-LAST:event_jDesktopPane1AncestorResized

    private void jDesktopPane1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jDesktopPane1AncestorMoved
       
    }//GEN-LAST:event_jDesktopPane1AncestorMoved

    private void jDesktopPane1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentMoved
      
    }//GEN-LAST:event_jDesktopPane1ComponentMoved

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
                new TelaPrincipal().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolbarTop;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuOs;
    private javax.swing.JMenu menuPainelControle;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
