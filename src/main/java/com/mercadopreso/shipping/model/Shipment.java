package com.mercadopreso.shipping.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private Long transportadoraId;
    private String endereco;
    private Integer tempoEstimado;
    private String linkRastreio;

    public Shipment() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public Long getTransportadoraId() { return transportadoraId; }
    public void setTransportadoraId(Long transportadoraId) { this.transportadoraId = transportadoraId; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Integer getTempoEstimado() { return tempoEstimado; }
    public void setTempoEstimado(Integer tempoEstimado) { this.tempoEstimado = tempoEstimado; }

    public String getLinkRastreio() { return linkRastreio; }
    public void setLinkRastreio(String linkRastreio) { this.linkRastreio = linkRastreio; }
}