package br.com.beertech.fusion.controller.dto;

public class TransferenciaDto {

    private String uuidContaOrigem;
    private String uuidContaDestino;
    private Double valorTransferido;

    public String getUuidContaOrigem() {
        return uuidContaOrigem;
    }

    public void setUuidContaOrigem(String uuidContaOrigem) {
        this.uuidContaOrigem = uuidContaOrigem;
    }

    public String getUuidContaDestino() {
        return uuidContaDestino;
    }

    public void setUuidContaDestino(String uuidContaDestino) {
        this.uuidContaDestino = uuidContaDestino;
    }

    public Double getValorTransferido() {
        return valorTransferido;
    }

    public void setValorTransferido(Double valorTransferido) {
        this.valorTransferido = valorTransferido;
    }

}
