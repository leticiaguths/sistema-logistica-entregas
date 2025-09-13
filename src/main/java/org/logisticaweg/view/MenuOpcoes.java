package org.logisticaweg.view;

import java.util.Scanner;

public class MenuOpcoes {

    public int menuPrincipal(int opcaoMenu) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\u001B[35m-------------------------- Sistema de Entregas WEG --------------------------\u001B[0m\n" +
                "\n1. Cadastrar cliente\n" +
                "2. Cadastrar motorista\n" +
                "3. Criar pedido\n" +
                "4. Atribuir Pedido a Motorista (Gerar Entrega)\n" +
                "5. Registrar Evento de Entrega (Histórico)\n" +
                "6. Atualizar Status da Entrega\n" +
                "7. Listar Todas as Entregas com Cliente e Motorista\n" +
                "8. Relatório: Total de Entregas por Motorista\n" +
                "9. Relatório: Clientes com Maior Volume Entregue\n" +
                "10. Relatório: Pedidos Pendentes por Estado\n" +
                "11. Relatório: Entregas Atrasadas por Cidade\n" +
                "12. Buscar Pedido por CPF/CNPJ do Cliente\n" +
                "13. Cancelar Pedido\n" +
                "14. Excluir Entrega (com validação)\n" +
                "15. Excluir Cliente (com verificação de dependência)\n" +
                "16. Excluir Motorista (com verificação de dependência)\n" +
                "0. Sair" +
                "\n\nDigite a opção desejada: ");

        String escolha = input.nextLine();

        try {
            opcaoMenu = Integer.parseInt(escolha);
        } catch (NumberFormatException e){
            System.out.println("\n\u001B[31mOpção inválida! Digite apenas números de 1 a 6.\u001B[0m\n");
        }

        return opcaoMenu;
    }

}
