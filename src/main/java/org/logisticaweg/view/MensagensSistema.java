package org.logisticaweg.view;

public class MensagensSistema {

    public void mensagemPadraoErroMenuPrincipal() {
    }

    public static void mensagemPadraoAcerto(String mensagem) {
        System.out.println("\n\u001b[32m✅ " + mensagem + "! \u001b[0m\n");
    }

    public static void mensagemPadraoErro(String mensagem) {
        System.out.println("\n\u001b[32m❌ " + mensagem + "! \u001b[0m\n");
    }

}
