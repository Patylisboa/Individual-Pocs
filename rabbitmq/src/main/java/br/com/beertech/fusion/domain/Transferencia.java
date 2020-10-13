package br.com.beertech.fusion.domain;

import java.util.Objects;

public class Transferencia {

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

    public void setUuidContaDestino(String UuidContaDestino) {
        this.uuidContaDestino = UuidContaDestino;
    }

    public Double getValorTransferido() {
        return valorTransferido;
    }

    public void setValorTransferido(Double valorTransferido) {
        this.valorTransferido = valorTransferido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidContaOrigem, uuidContaDestino, valorTransferido);
    }

    @Override
    public String toString() {
        return "Transferencia [uuidContaOrigem=" + uuidContaOrigem + ", uuidContaDestino="
                + uuidContaDestino + ", valorTransferido=" + valorTransferido + "]";
    }

}
