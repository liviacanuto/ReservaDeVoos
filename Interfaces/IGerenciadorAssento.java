package Interfaces;

import Entidades.Assento;
import Entidades.Pessoa;

//Interface Segregation
//Open - Closed
public interface IGerenciadorAssento {
    public boolean marcar(Assento assento, Pessoa passageiro);
    public boolean cancelar(Assento assento);
}
