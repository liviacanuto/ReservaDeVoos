package Entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    private Date data;
    private String origem;
    private String destino;
    private double valor;
    private List<Assento> assentos = new ArrayList<>();


    public Voo(Date data, String origem, String destino, double valor) {
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public void adicionarAssento(Assento a) {
        this.assentos.add(a);
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Voo [data=" + data + ", origem=" + origem + ", destino=" + destino + ", valor=" + valor + ", assentos="
                + assentos + "]";
    }

}
