/*Autoras: 
    Gabrielly Sena RA: 164912
    Livia Canuto RA: 164921  
*/

import java.time.Instant;
import java.sql.Date;
import Entidades.Assento;
import Entidades.Pessoa;
import Entidades.Voo;
import Implementacoes.GerenciadorAssento;
import Implementacoes.GerenciadorVoo;
import Interfaces.IGerenciadorAssento;
import Interfaces.IGerenciadorVoo;

//Principio Demeter
public class Main {
    public static void main(String[] args) {
        IGerenciadorAssento gerenciadorAssento = new GerenciadorAssento();
        IGerenciadorVoo gerenciadorVoo = new GerenciadorVoo();

        long diaEmSegundos = 24 * 60 * 60;
        Date hoje = new Date(Instant.now().toEpochMilli());
        Date amanha = new Date(Instant.now().plusSeconds(diaEmSegundos).toEpochMilli());

        Voo v1 = gerenciadorVoo.cadastrarVoo(hoje, "Jesuania", "Lambari", 4.75);
        Voo v2 = gerenciadorVoo.cadastrarVoo(hoje, "Olimpio", "SL", 12.75);
        Voo v3 = gerenciadorVoo.cadastrarVoo(hoje, "Jesuania", "Lambari", 19.50);

        
        Assento assento1v1 = new Assento(1, v1);
        Assento assento2v1 = new Assento(2, v1);
        Assento assento3v1 = new Assento(3, v1);

        Assento assento1v3 = new Assento(1, v3);
        Assento assento2v3 = new Assento(2, v3);
        Assento assento3v3 = new Assento(3, v3);


        Pessoa li = new Pessoa("li", "11111");
        Pessoa mo = new Pessoa("mo", "22222");
        gerenciadorAssento.marcar(assento3v3, li);
        gerenciadorAssento.marcar(assento3v1, mo);
        gerenciadorAssento.cancelar(assento3v1);

        System.out.println(
            gerenciadorVoo.buscar(hoje, "Jesuania", "Lambari")
        );
    }
}
