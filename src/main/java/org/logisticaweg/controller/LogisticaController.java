package org.logisticaweg.controller;

import org.logisticaweg.model.Cliente;
import org.logisticaweg.service.LogisticaService;
import org.logisticaweg.view.InteracaoUsuario;
import org.logisticaweg.view.MensagensSistema;
import org.logisticaweg.view.MenuOpcoes;

public class LogisticaController {

    private LogisticaService service;
    private MensagensSistema mensagensView;
    private MenuOpcoes menuView;
    private InteracaoUsuario interacaoView;

    public LogisticaController(MenuOpcoes menuView, InteracaoUsuario interacaoView, MensagensSistema mensagensView, LogisticaService service) {
        this.menuView = menuView;
        this.interacaoView = interacaoView;
        this.mensagensView = mensagensView;
        this.service = service;
    }

    public void iniciar() {
        boolean executando = true;

        while (executando) {
            int opcaoMenu = menuView.menuPrincipal(0);

            switch (opcaoMenu) {

                //1 - Cadastrar Cliente
                case 1 -> {
                    String[] dados = interacaoView.cadastrarCliente();
                    service.cadastrarCliente(dados);
                    break;
                }

                //2 - Cadastrar Motorista
                case 2 -> {
                    String[] dados = interacaoView.cadastrarMotorista();
                    service.cadastrarMotorista(dados);
                    break;
                }

                //3 - Criar Pedido
                case 3 -> {
                    service.criarPedido();
                    break;
                }

                //4 - Atribuir Pedido a Motorista (Gerar Entrega)
                case 4 -> {
                    service.atribuirPedidoAMotorista();
                    break;
                }

                //5 - Registrar Evento de Entrega (Histórico)
                case 5 -> {
                    service.registrarEventoDeEntrega();
                    break;
                }

                //6 - Atualizar Status da Entrega
                case 6 -> {
                    service.atualizarStatusDaEntrega();
                    break;
                }

                //7 - Listar Todas as Entregas com Cliente e Motorista
                case 7 -> {
                    service.listarTodasAsEntregas();
                    break;
                }

                //8 - Relatório: Total de Entregas por Motorista
                case 8 -> {
                    service.relatorioTotalDeEntregas();
                    break;
                }

                //9 - Relatório: Clientes com Maior Volume Entregue
                case 9 -> {
                    service.relatorioClientesComMaiorVolume();
                    break;
                }

                //10 - Relatório: Pedidos Pendentes por Estado
                case 10 -> {
                    service.relatorioPedidosPendentesPorEstado();
                    break;
                }

                //11 - Relatório: Entregas Atrasadas por Cidade
                case 11 -> {
                    service.relatorioEntregasAtrasadasPorCidade();
                    break;
                }

                //12 - Buscar Pedido por CPF/CNPJ do Cliente
                case 12 -> {
                    service.buscarPedidoPorCliente();
                    break;
                }

                //13 - Cancelar Pedido
                case 13 -> {
                    service.cancelarPedido();
                    break;
                }

                //14 - Excluir Entrega (com validação)
                case 14 -> {
                    service.excluirEntrega();
                    break;
                }

                //15 - Excluir Cliente (com verificação de dependência)
                case 15 -> {
                    String cliente = interacaoView.excluirCliente();

                    /*for (Cliente c : cliente) {

                    }*/

                    service.excluirCliente(cliente);
                    break;
                }

                //16 - Excluir Motorista (com verificação de dependência)
                case 16 -> {
                    service.excluirMotorista();
                    break;
                }

                //0 - Sair
                case 0 -> {
                    service.sair();
                    break;
                }

                //Default
                default -> {
                    mensagensView.mensagemPadraoErroMenuPrincipal();
                    break;
                }

            } //fecha switch

        } //fecha while

    } //fecha iniciar()

}
