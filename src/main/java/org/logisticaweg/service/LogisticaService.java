package org.logisticaweg.service;

import org.logisticaweg.dao.ClienteDAO;
import org.logisticaweg.dao.MotoristaDAO;
import org.logisticaweg.model.Cliente;
import org.logisticaweg.model.Motorista;

public class LogisticaService {

    public void cadastrarCliente(String[] dados) {
        var cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4]);
        var dao = new ClienteDAO();
        dao.cadastrarCliente(cliente);
    }

    public void cadastrarMotorista(String[] dados) {
        var motorista = new Motorista(dados[0], dados[1], dados[2], dados[3]);
        var dao = new MotoristaDAO();
        dao.cadastrarMotorista(motorista);
    }

    public void criarPedido() {
    }

    public void atribuirPedidoAMotorista() {
    }

    public void registrarEventoDeEntrega() {
    }

    public void atualizarStatusDaEntrega() {
    }

    public void listarTodasAsEntregas() {
    }

    public void relatorioTotalDeEntregas() {
    }

    public void relatorioClientesComMaiorVolume() {
    }

    public void relatorioPedidosPendentesPorEstado() {
    }

    public void relatorioEntregasAtrasadasPorCidade() {
    }

    public void buscarPedidoPorCliente() {
    }

    public void cancelarPedido() {
    }

    public void excluirEntrega() {
    }

    public void excluirCliente(String cliente) {
    }

    public void excluirMotorista() {
    }

    public void sair() {
    }

}
