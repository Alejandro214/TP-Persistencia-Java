package ar.edu.unq.epers.bichomon.backend.model.condicionesEvolucion;

import ar.edu.unq.epers.bichomon.backend.model.bicho.Bicho;
import ar.edu.unq.epers.bichomon.backend.model.entrenador.Entrenador;

import javax.persistence.Entity;

@Entity
public class CondBasadaEnEnergia extends CondicionEvolucion {

    private int energiaPedida;

    public CondBasadaEnEnergia(int energiaPedida) {
        this.energiaPedida = energiaPedida;
    }


    @Override
    public boolean puedeEvolucionar(Bicho b, Entrenador e) {
        return b.getEnergia() >= energiaPedida;
    }

}
