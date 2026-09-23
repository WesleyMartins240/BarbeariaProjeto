package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Barbeiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object para Barbeiro
 */
public class BarbeiroDAO {

    public void salvar(Barbeiro barbeiro) {
        String sql = "INSERT INTO tb_barbeiro (nome, cpf) VALUES (?, ?)";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, barbeiro.getNome());
            stmt.setString(2, barbeiro.getCpf());
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao salvar barbeiro: " + erro.getMessage());
        }
    }

    public List<Barbeiro> pesquisarPorNome(String nome) {
        List<Barbeiro> barbeiros = new ArrayList<>();
        String sql = "SELECT * FROM tb_barbeiro WHERE LOWER(nome) LIKE LOWER(?) OR cpf LIKE ? ORDER BY nome";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            stmt.setString(2, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Barbeiro barbeiro = new Barbeiro();
                barbeiro.setId(rs.getInt("id"));
                barbeiro.setNome(rs.getString("nome"));
                barbeiro.setCpf(rs.getString("cpf"));
                barbeiros.add(barbeiro);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao pesquisar barbeiro: " + erro.getMessage());
        }

        return barbeiros;
    }

    public List<Barbeiro> listar() {
        String sql = "SELECT * FROM tb_barbeiro ORDER BY id";
        List<Barbeiro> barbeiros = new ArrayList<>();

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Barbeiro barbeiro = new Barbeiro();
                barbeiro.setId(rs.getInt("id"));
                barbeiro.setNome(rs.getString("nome"));
                barbeiro.setCpf(rs.getString("cpf"));
                barbeiros.add(barbeiro);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao listar barbeiros: " + erro.getMessage());
        }

        return barbeiros;
    }

    public void atualizar(Barbeiro barbeiro) {
        String sql = "UPDATE tb_barbeiro SET nome = ?, cpf = ? WHERE id = ?";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, barbeiro.getNome());
            stmt.setString(2, barbeiro.getCpf());
            stmt.setInt(3, barbeiro.getId());
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar barbeiro: " + erro.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM tb_barbeiro WHERE id = ?";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao excluir barbeiro: " + erro.getMessage());
        }
    }
}
