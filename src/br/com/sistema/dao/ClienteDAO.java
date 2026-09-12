package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prof.Darlon Franklin
 */
public class ClienteDAO {

    public void salvar(Cliente cliente) {

        String sql = "INSERT INTO tb_cliente (nome, cpf) VALUES (?, ?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.executeUpdate();
        } catch (SQLException erro) {
            System.out.println("Erro ao salvar cliente: " + erro.getMessage());
        }
    }

    public List<Cliente> pesquisarPorNome(String nome) {

        List<Cliente> clientes = new ArrayList<>();

        String sql = "SELECT * FROM tb_cliente WHERE LOWER(nome) LIKE LOWER(?) OR cpf LIKE ? ORDER BY nome";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            stmt.setString(2, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                clientes.add(cliente);
            }

        } catch (SQLException erro) {
            System.out.println("Erro ao pesquisar cliente: "
                    + erro.getMessage());
        }

        return clientes;
    }

    // LISTAR
    public List<Cliente> listar() {

        String sql = "SELECT * FROM tb_cliente ORDER BY id";

        List<Cliente> clientes = new ArrayList<>();

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                clientes.add(cliente);
            }

        } catch (SQLException erro) {
            System.out.println("Erro ao listar clientes: " + erro.getMessage());
        }

        return clientes;
    }
    // ATUALIZAR

    public void atualizar(Cliente cliente) {

        String sql = "UPDATE tb_cliente SET nome = ?, cpf = ? WHERE id = ?";

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setInt(3, cliente.getId());
            stmt.executeUpdate();
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar cliente: " + erro.getMessage());
        }
    }

    // EXCLUIR
    public void excluir(int id) {

        String sql = "DELETE FROM tb_cliente WHERE id = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException erro) {
            System.out.println("Erro ao excluir cliente: " + erro.getMessage());
        }
    }
}
