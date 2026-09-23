package br.com.sistema.view;

import javax.swing.JOptionPane;

/**
 * Menu Principal do Sistema de Barbearia
 */
public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBanner = new javax.swing.JLabel();
        jLabelSub = new javax.swing.JLabel();
        btnQuickAgendamento = new javax.swing.JButton();
        btnQuickBarbeiros = new javax.swing.JButton();
        btnQuickSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barbearia - Menu Principal");
        setResizable(false);

        jLabelBanner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBanner.setText("Sistema de Barbearia");

        jLabelSub.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelSub.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSub.setText("Painel Principal de Gestão e Atendimento");

        btnQuickAgendamento.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnQuickAgendamento.setText("Agendamento de Serviços");
        btnQuickAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickAgendamentoActionPerformed(evt);
            }
        });

        btnQuickBarbeiros.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnQuickBarbeiros.setText("Cadastro de Barbeiros");
        btnQuickBarbeiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickBarbeirosActionPerformed(evt);
            }
        });

        btnQuickSair.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnQuickSair.setText("Sair do Sistema");
        btnQuickSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickSairActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastros");

        jMenuItem3.setText("Barbeiros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Agendamento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu2.add(menuSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuickAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuickBarbeiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuickSair, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelBanner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSub)
                .addGap(35, 35, 35)
                .addComponent(btnQuickAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuickBarbeiros, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuickSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        sair();
    }//GEN-LAST:event_menuSairActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        abrirAgendamentos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        abrirBarbeiros();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnQuickAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickAgendamentoActionPerformed
        abrirAgendamentos();
    }//GEN-LAST:event_btnQuickAgendamentoActionPerformed

    private void btnQuickBarbeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickBarbeirosActionPerformed
        abrirBarbeiros();
    }//GEN-LAST:event_btnQuickBarbeirosActionPerformed

    private void btnQuickSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickSairActionPerformed
        sair();
    }//GEN-LAST:event_btnQuickSairActionPerformed

    private void abrirAgendamentos() {
        FrmAgendamentos frmAgendamentos = new FrmAgendamentos();
        frmAgendamentos.setVisible(true);
    }

    private void abrirBarbeiros() {
        FrmBarbeiros frmBarbeiros = new FrmBarbeiros();
        frmBarbeiros.setVisible(true);
    }

    private void sair() {
        int result = JOptionPane.showConfirmDialog(this,
                "Deseja realmente sair do sistema?",
                "Confirmar saída",
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuickAgendamento;
    private javax.swing.JButton btnQuickBarbeiros;
    private javax.swing.JButton btnQuickSair;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JLabel jLabelSub;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuSair;
    // End of variables declaration//GEN-END:variables
}
