package org.logisticaweg.view;

import java.util.Scanner;

public class InteracaoUsuario {
    private Scanner input;

    public InteracaoUsuario(Scanner input) {
        this.input = input;
    }

    public String[] cadastrarCliente() {
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu CPF/CNPJ: ");
        String cpf_cnpj = input.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = input.nextLine();

        System.out.println("Digite sua cidade: ");
        String cidade = input.nextLine();

        System.out.println("Digite seu estado(sigla): ");
        String estado = input.nextLine();

        return new String[]{nome, cpf_cnpj, endereco, cidade, estado};
    }

    public String[] cadastrarMotorista() {
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua CNH: ");
        String cnh = input.nextLine();

        System.out.println("Digite seu veículo: ");
        String veiculo = input.nextLine();

        System.out.println("Digite sua cidade base: ");
        String cidade_base = input.nextLine();

        return new String[]{nome, cnh, veiculo, cidade_base};
    }

}
