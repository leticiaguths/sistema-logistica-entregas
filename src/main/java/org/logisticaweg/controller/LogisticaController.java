package org.logisticaweg.controller;

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

    }

}
