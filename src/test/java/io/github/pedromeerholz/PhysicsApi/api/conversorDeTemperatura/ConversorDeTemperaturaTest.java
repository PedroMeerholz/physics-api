package io.github.pedromeerholz.PhysicsApi.api.conversorDeTemperatura;

import io.github.pedromeerholz.PhysicsApi.api.resultado.Resultado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorDeTemperaturaTest {
    private ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();

    @Test
    void converterCelciusParaFahrenheit() {
        float temperatura = 32;
        Resultado resultado = this.conversorDeTemperatura.converterCelciusParaFahrenheit(temperatura);
        float temperaturaFinal = resultado.getResultado();
        Assertions.assertEquals(89.6, temperaturaFinal, 2);
    }
}