package io.github.giovanaguedessilva.arquiteturaspring.montadora.configuration;

import io.github.giovanaguedessilva.arquiteturaspring.montadora.Motor;
import io.github.giovanaguedessilva.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor (){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        motor.setCilindros(12);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        return motor;
    }
}
