package Implementacoes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Entidades.Voo;
import Interfaces.IGerenciadorVoo;
//Inversão de Dependdencias
public class GerenciadorVoo implements IGerenciadorVoo {
    private List<Voo> voos = new ArrayList<>();

    @Override
    public List<Voo> buscar(Date data, String origem, String destino) {
        List<Voo> voosEncontrados = new ArrayList<>();
        for (Voo voo : voos) {
            boolean mesmaOrigem = voo.getOrigem().equals(origem);
            boolean mesmoDestino = voo.getDestino().equals(destino);
            boolean mesmaData = voo.getData().toLocalDate().equals(data.toLocalDate());
            if (mesmaOrigem && mesmoDestino && mesmaData) {
                voosEncontrados.add(voo);
            }
        }
        return voosEncontrados;
    }

    @Override
    public Voo cadastrarVoo(Date data, String origem, String destino, double valor) {
        Voo voo = new Voo(data, origem, destino, valor);
        this.voos.add(voo);
        return voo;
    }
}
