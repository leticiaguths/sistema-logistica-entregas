package org.logisticaweg.dao;

import org.logisticaweg.connection.Conexao;
import org.logisticaweg.model.Cliente;
import org.logisticaweg.view.MensagensSistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    public void cadastrarCliente(Cliente cliente) {

        String query = "INSERT INTO cliente (nome, cpf_cnpj, endereco, cidade, estado) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf_cnpj());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getEstado());
            stmt.executeUpdate();

            MensagensSistema.mensagemPadraoAcerto("Cliente adicionado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
