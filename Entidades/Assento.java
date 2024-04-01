package Entidades;

public class Assento {
    Pessoa passageiro;
    int numero;
    Voo voo;

    public Assento(int numero, Voo voo) {
        this.numero = numero;
        this.voo = voo;
        voo.adicionarAssento(this);
    }

    public boolean isMarcado() {
        return this.passageiro != null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Pessoa getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Pessoa passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        return "Assento [passageiro=" + passageiro + ", numero=" + numero + "]";
    }
}
