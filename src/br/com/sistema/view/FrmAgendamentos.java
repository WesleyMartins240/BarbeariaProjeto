package br.com.sistema.view;

import br.com.sistema.dao.AgendamentoDAO;
import br.com.sistema.dao.BarbeiroDAO;
import br.com.sistema.dao.ClienteDAO;
import br.com.sistema.model.Agendamento;
import br.com.sistema.model.Barbeiro;
import br.com.sistema.model.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de Agendamentos de Serviços
 */
public class FrmAgendamentos extends javax.swing.JFrame {

    AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
    ClienteDAO clienteDAO = new ClienteDAO();
    BarbeiroDAO barbeiroDAO = new BarbeiroDAO();

    public FrmAgendamentos() {
        initComponents();
        rowClickEditar();
        setLocationRelativeTo(null);
        carregarCombos();
        listarAgendamentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<String>();
        jLabelBarbeiro = new javax.swing.JLabel();
        cbBarbeiro = new javax.swing.JComboBox<String>();
        jLabelServico = new javax.swing.JLabel();
        cbServico = new javax.swing.JComboBox<String>();
        jLabelData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabelHorario = new javax.swing.JLabel();
        cbHorario = new javax.swing.JComboBox<String>();
        jLabelValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabelPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgendamentos = new javax.swing.JTable();
        jPanelAcoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamento de Serviços");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("Agendamento de Serviços");

        jLabelCliente.setText("Cliente:");

        cbCliente.setEditable(true);

        jLabelBarbeiro.setText("Barbeiro:");

        cbBarbeiro.setEditable(true);

        jLabelServico.setText("Serviço:");

        cbServico.setEditable(true);
        cbServico.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Corte de Cabelo", "Barba", "Corte + Barba", "Pezinho", "Sobrancelha", "Luzes / Platinado", "Outro" }));

        jLabelData.setText("Data (DD/MM/AAAA):");

        jLabelHorario.setText("Horário:");

        cbHorario.setEditable(true);
        cbHorario.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { 
            "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", 
            "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", 
            "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", 
            "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00" 
        }));

        jLabelValor.setText("Valor (R$):");

        jLabelPesquisar.setText("Pesquisar:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Barbeiro", "Serviço", "Data", "Horário", "Valor"
            }
        ));
        tabelaAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAgendamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAgendamentos);

        jPanelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAcoesLayout = new javax.swing.GroupLayout(jPanelAcoes);
        jPanelAcoes.setLayout(jPanelAcoesLayout);
        jPanelAcoesLayout.setHorizontalGroup(
            jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcoesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanelAcoesLayout.setVerticalGroup(
            jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCliente)
                                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBarbeiro)
                                    .addComponent(cbBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelServico)
                                    .addComponent(cbServico, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelData)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelHorario)
                                    .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelValor)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelPesquisar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jPanelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCliente)
                            .addComponent(jLabelBarbeiro)
                            .addComponent(jLabelServico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelData)
                            .addComponent(jLabelHorario)
                            .addComponent(jLabelValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAgendamentosMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tabelaAgendamentos.getSelectedRow();
            if (linha != -1) {
                cbCliente.setSelectedItem(tabelaAgendamentos.getValueAt(linha, 1) != null ? tabelaAgendamentos.getValueAt(linha, 1).toString() : "");
                cbBarbeiro.setSelectedItem(tabelaAgendamentos.getValueAt(linha, 2) != null ? tabelaAgendamentos.getValueAt(linha, 2).toString() : "");
                cbServico.setSelectedItem(tabelaAgendamentos.getValueAt(linha, 3) != null ? tabelaAgendamentos.getValueAt(linha, 3).toString() : "");
                txtData.setText(tabelaAgendamentos.getValueAt(linha, 4) != null ? tabelaAgendamentos.getValueAt(linha, 4).toString() : "");
                cbHorario.setSelectedItem(tabelaAgendamentos.getValueAt(linha, 5) != null ? tabelaAgendamentos.getValueAt(linha, 5).toString() : "08:00");
                txtValor.setText(tabelaAgendamentos.getValueAt(linha, 6) != null ? tabelaAgendamentos.getValueAt(linha, 6).toString() : "");
            }
        }
    }//GEN-LAST:event_tabelaAgendamentosMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        alterar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void carregarCombos() {
        cbCliente.removeAllItems();
        cbBarbeiro.removeAllItems();

        try {
            List<Cliente> clientes = clienteDAO.listar();
            for (Cliente c : clientes) {
                cbCliente.addItem(c.getNome());
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar clientes: " + e.getMessage());
        }

        try {
            List<Barbeiro> barbeiros = barbeiroDAO.listar();
            for (Barbeiro b : barbeiros) {
                cbBarbeiro.addItem(b.getNome());
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar barbeiros: " + e.getMessage());
        }
    }

    private void rowClickEditar() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[]{"ID", "Cliente", "Barbeiro", "Serviço", "Data", "Horário", "Valor"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tabelaAgendamentos.setModel(modelo);
        tabelaAgendamentos.setRowHeight(24);
        if (tabelaAgendamentos.getColumnModel().getColumnCount() > 0) {
            tabelaAgendamentos.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabelaAgendamentos.getColumnModel().getColumn(1).setPreferredWidth(140);
            tabelaAgendamentos.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabelaAgendamentos.getColumnModel().getColumn(3).setPreferredWidth(110);
            tabelaAgendamentos.getColumnModel().getColumn(4).setPreferredWidth(85);
            tabelaAgendamentos.getColumnModel().getColumn(5).setPreferredWidth(65);
            tabelaAgendamentos.getColumnModel().getColumn(6).setPreferredWidth(75);
        }
    }

    private void salvar() {
        String nomeCliente = cbCliente.getSelectedItem() != null ? cbCliente.getSelectedItem().toString().trim() : "";
        String nomeBarbeiro = cbBarbeiro.getSelectedItem() != null ? cbBarbeiro.getSelectedItem().toString().trim() : "";
        String horario = cbHorario.getSelectedItem() != null ? cbHorario.getSelectedItem().toString().trim() : "";

        if (nomeCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe ou selecione o nome do cliente!");
            cbCliente.requestFocus();
            return;
        }

        if (nomeBarbeiro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe ou selecione o barbeiro!");
            cbBarbeiro.requestFocus();
            return;
        }

        Agendamento a = new Agendamento();
        a.setCliente(nomeCliente);
        a.setBarbeiro(nomeBarbeiro);
        a.setServico(cbServico.getSelectedItem() != null ? cbServico.getSelectedItem().toString() : "");
        a.setData(txtData.getText().trim());
        a.setHorario(horario);

        try {
            a.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));
        } catch (NumberFormatException e) {
            a.setValor(0.0);
        }

        agendamentoDAO.salvar(a);
        JOptionPane.showMessageDialog(this, "Agendamento cadastrado com sucesso!");
        limparCampos();
        listarAgendamentos();
    }

    private void pesquisar() {
        String texto = txtPesquisar.getText().trim();
        DefaultTableModel modelo = (DefaultTableModel) tabelaAgendamentos.getModel();
        modelo.setRowCount(0);
        List<Agendamento> lista = agendamentoDAO.pesquisarPorCliente(texto);
        for (Agendamento a : lista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getCliente(),
                a.getBarbeiro(),
                a.getServico(),
                a.getData(),
                a.getHorario(),
                a.getValor()
            });
        }
    }

    private void listarAgendamentos() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAgendamentos.getModel();
        modelo.setRowCount(0);
        List<Agendamento> lista = agendamentoDAO.listar();

        for (Agendamento a : lista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getCliente(),
                a.getBarbeiro(),
                a.getServico(),
                a.getData(),
                a.getHorario(),
                a.getValor()
            });
        }
    }

    private void alterar() {
        int linha = tabelaAgendamentos.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um agendamento na tabela!");
            return;
        }

        String nomeCliente = cbCliente.getSelectedItem() != null ? cbCliente.getSelectedItem().toString().trim() : "";
        String nomeBarbeiro = cbBarbeiro.getSelectedItem() != null ? cbBarbeiro.getSelectedItem().toString().trim() : "";
        String horario = cbHorario.getSelectedItem() != null ? cbHorario.getSelectedItem().toString().trim() : "";

        if (nomeCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe ou selecione o nome do cliente!");
            cbCliente.requestFocus();
            return;
        }

        if (nomeBarbeiro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe ou selecione o barbeiro!");
            cbBarbeiro.requestFocus();
            return;
        }

        int id = (int) tabelaAgendamentos.getValueAt(linha, 0);
        Agendamento a = new Agendamento();
        a.setId(id);
        a.setCliente(nomeCliente);
        a.setBarbeiro(nomeBarbeiro);
        a.setServico(cbServico.getSelectedItem() != null ? cbServico.getSelectedItem().toString() : "");
        a.setData(txtData.getText().trim());
        a.setHorario(horario);

        try {
            a.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));
        } catch (NumberFormatException e) {
            a.setValor(0.0);
        }

        agendamentoDAO.atualizar(a);
        JOptionPane.showMessageDialog(this, "Agendamento atualizado com sucesso!");
        limparCampos();
        listarAgendamentos();
    }

    private void excluir() {
        int linha = tabelaAgendamentos.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um agendamento na tabela!");
            return;
        }

        int confirma = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir este agendamento?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            int id = (int) tabelaAgendamentos.getValueAt(linha, 0);
            agendamentoDAO.excluir(id);
            JOptionPane.showMessageDialog(this, "Agendamento excluído com sucesso!");
            limparCampos();
            listarAgendamentos();
        }
    }

    private void limparCampos() {
        txtData.setText("");
        txtValor.setText("");
        txtPesquisar.setText("");
        if (cbCliente.getItemCount() > 0) cbCliente.setSelectedIndex(0);
        if (cbBarbeiro.getItemCount() > 0) cbBarbeiro.setSelectedIndex(0);
        if (cbServico.getItemCount() > 0) cbServico.setSelectedIndex(0);
        if (cbHorario.getItemCount() > 0) cbHorario.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(FrmAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgendamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbBarbeiro;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbHorario;
    private javax.swing.JComboBox<String> cbServico;
    private javax.swing.JLabel jLabelBarbeiro;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanelAcoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAgendamentos;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
