package org.logisticaweg.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entrega {

    private int id;
    private int pedido_id;
    private int motorista_id;
    private LocalDateTime data_saida;
    private LocalDateTime data_entrega;
    private StatusEntrega status;

    public Entrega() {
    }

    public Entrega(int id, int pedido_id, int motorista_id, LocalDateTime data_saida, LocalDateTime data_entrega, StatusEntrega status) {
        this.id = id;
        this.pedido_id = pedido_id;
        this.motorista_id = motorista_id;
        this.data_saida = data_saida;
        this.data_entrega = data_entrega;
        this.status = status;
    }

    public Entrega(int pedido_id, int motorista_id, StatusEntrega status) {
        this.pedido_id = pedido_id;
        this.motorista_id = motorista_id;
        this.data_saida = data_saida;
        this.data_entrega = data_entrega;
        this.status = status;
    }

    public String getData_saida() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return data_saida.format(formatar);
    }

    public String getData_entrega() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return data_entrega.format(formatar);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public int getMotorista_id() {
        return motorista_id;
    }

    public void setMotorista_id(int motorista_id) {
        this.motorista_id = motorista_id;
    }

    public void setData_saida(LocalDateTime data_saida) {
        this.data_saida = data_saida;
    }

    public void setData_entrega(LocalDateTime data_entrega) {
        this.data_entrega = data_entrega;
    }

    public StatusEntrega getStatus() {
        return status;
    }

    public void setStatus(StatusEntrega status) {
        this.status = status;
    }

}
