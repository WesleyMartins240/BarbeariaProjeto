package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object para Agendamento
 */
public class AgendamentoDAO {

    public void salvar(Agendamento agendamento) {
        String sql = "INSERT INTO tb_agendamento (cliente, barbeiro, servico, data, horario, valor) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, agendamento.getCliente());
            stmt.setString(2, agendamento.getBarbeiro());
            stmt.setString(3, agendamento.getServico());
            stmt.setString(4, agendamento.getData());
            stmt.setString(5, agendamento.getHorario());
            stmt.setDouble(6, agendamento.getValor());
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao salvar agendamento: " + erro.getMessage());
        }
    }

    public List<Agendamento> pesquisarPorCliente(String texto) {
        List<Agendamento> agendamentos = new ArrayList<>();
        String sql = "SELECT * FROM tb_agendamento WHERE LOWER(cliente) LIKE LOWER(?) OR LOWER(barbeiro) LIKE LOWER(?) ORDER BY id";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + texto + "%");
            stmt.setString(2, "%" + texto + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Agendamento a = new Agendamento();
                a.setId(rs.getInt("id"));
                a.setCliente(rs.getString("cliente"));
                a.setBarbeiro(rs.getString("barbeiro"));
                a.setServico(rs.getString("servico"));
                a.setData(rs.getString("data"));
                a.setHorario(rs.getString("horario"));
                a.setValor(rs.getDouble("valor"));
                agendamentos.add(a);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao pesquisar agendamento: " + erro.getMessage());
        }

        return agendamentos;
    }

    public List<Agendamento> listar() {
        String sql = "SELECT * FROM tb_agendamento ORDER BY id";
        List<Agendamento> agendamentos = new ArrayList<>();

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Agendamento a = new Agendamento();
                a.setId(rs.getInt("id"));
                a.setCliente(rs.getString("cliente"));
                a.setBarbeiro(rs.getString("barbeiro"));
                a.setServico(rs.getString("servico"));
                a.setData(rs.getString("data"));
                a.setHorario(rs.getString("horario"));
                a.setValor(rs.getDouble("valor"));
                agendamentos.add(a);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao listar agendamentos: " + erro.getMessage());
        }

        return agendamentos;
    }

    public void atualizar(Agendamento agendamento) {
        String sql = "UPDATE tb_agendamento SET cliente = ?, barbeiro = ?, servico = ?, data = ?, horario = ?, valor = ? WHERE id = ?";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, agendamento.getCliente());
            stmt.setString(2, agendamento.getBarbeiro());
            stmt.setString(3, agendamento.getServico());
            stmt.setString(4, agendamento.getData());
            stmt.setString(5, agendamento.getHorario());
            stmt.setDouble(6, agendamento.getValor());
            stmt.setInt(7, agendamento.getId());
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar agendamento: " + erro.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM tb_agendamento WHERE id = ?";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao excluir agendamento: " + erro.getMessage());
        }
    }
}
