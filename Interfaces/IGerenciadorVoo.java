package Interfaces;

import java.sql.Date;
import java.util.List;
import Entidades.Voo;
//Interface Segregation
public interface IGerenciadorVoo {
    public List<Voo> buscar(Date data, String origem, String destino);

    public Voo cadastrarVoo(Date data, String origem, String destino, double valor);
}
