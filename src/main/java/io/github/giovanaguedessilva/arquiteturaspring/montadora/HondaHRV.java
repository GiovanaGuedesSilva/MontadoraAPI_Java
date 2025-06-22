package io.github.giovanaguedessilva.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{


    public HondaHRV(Motor motor) {
        super(motor);
        setCor(Color.BLACK);
        setModelo("HONDA");
        setMontadora(Montadora.HONDA);
    }
}
