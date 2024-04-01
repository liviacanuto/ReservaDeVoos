package Implementacoes;

import Entidades.Assento;
import Entidades.Pessoa;
import Interfaces.IGerenciadorAssento;
//Inversão de Dependdencias
public class GerenciadorAssento implements IGerenciadorAssento {

    @Override
    public boolean marcar(Assento assento, Pessoa passageiro) {
        if(assento.isMarcado()) {
            return false;
        }
        assento.setPassageiro(passageiro);
        return true;
    }

    @Override
    public boolean cancelar(Assento assento) {
        if(!assento.isMarcado()) {
            return false;
        }
        assento.setPassageiro(null);
        return true;
    }
    
}
