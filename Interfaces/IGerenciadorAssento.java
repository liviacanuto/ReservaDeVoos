package Interfaces;

import Entidades.Assento;
import Entidades.Pessoa;

//Interface Segregation
public interface IGerenciadorAssento {
    public boolean marcar(Assento assento, Pessoa passageiro);
    public boolean cancelar(Assento assento);
}
