package org.logisticaweg.app;

import org.logisticaweg.connection.Conexao;
import org.logisticaweg.controller.LogisticaController;
import org.logisticaweg.service.LogisticaService;
import org.logisticaweg.view.InteracaoUsuario;
import org.logisticaweg.view.MensagensSistema;
import org.logisticaweg.view.MenuOpcoes;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        /* ----------------------------------------------- TESTE DE CONEXÃO COM O BANCO

        try (Connection conn = Conexao.conectar()) {
            if (conn != null) {
                System.out.println("\u001b[34mConexão realizada com sucesso!\u001b[0m");
            } else {
                System.out.println("\u001b[31mFalha na conexão.\u001b[0m");
            }/
        } catch (Exception e) {
            e.printStackTrace();
        }

         */

        try {

            Scanner input = new Scanner(System.in);
            MenuOpcoes menuView = new MenuOpcoes(input);
            InteracaoUsuario interacaoView = new InteracaoUsuario(input);
            MensagensSistema mensagensView = new MensagensSistema();
            LogisticaService service = new LogisticaService();
            LogisticaController control = new LogisticaController(menuView, interacaoView, mensagensView, service);
            control.iniciar();
            input.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }
}
