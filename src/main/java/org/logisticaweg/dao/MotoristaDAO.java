package org.logisticaweg.dao;

import org.logisticaweg.connection.Conexao;
import org.logisticaweg.model.Motorista;
import org.logisticaweg.view.MensagensSistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MotoristaDAO {

    public void cadastrarMotorista(Motorista motorista) {

        String query = "INSERT INTO motorista (nome, cnh, veiculo, cidade_base) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getCnh());
            stmt.setString(3, motorista.getVeiculo());
            stmt.setString(4, motorista.getCidade_base());
            stmt.executeUpdate();

            MensagensSistema.mensagemPadraoAcerto("Motorista adicionado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
