package io.github.giovanaguedessilva.arquiteturaspring.montadora.configuration;

import io.github.giovanaguedessilva.arquiteturaspring.montadora.Motor;
import io.github.giovanaguedessilva.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motorAspirado (){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        motor.setCilindros(12);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        return motor;
    }

    @Bean
    public Motor motorEletrico (){
        var motor = new Motor();
        motor.setCavalos(100);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        motor.setCilindros(1);
        motor.setLitragem(3.0);
        motor.setModelo("TH-40");
        return motor;
    }

    @Bean
    public Motor motorTurbo (){
        var motor = new Motor();
        motor.setCavalos(190);
        motor.setTipoMotor(TipoMotor.TURBO);
        motor.setCilindros(13);
        motor.setLitragem(4.0);
        motor.setModelo("XX-5H");
        return motor;
    }
}
