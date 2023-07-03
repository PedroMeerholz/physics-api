package io.github.pedromeerholz.PhysicsApi.api.conversorDeTemperatura;

import io.github.pedromeerholz.PhysicsApi.api.resultado.Resultado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConversorDeTemperaturaTest {
    private ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();

    @Test
    void converterCelciusParaFahrenheit() {
        float temperatura = 32;
        Resultado resultado = this.conversorDeTemperatura.converterCelciusParaFahrenheit(temperatura);
        float temperaturaFinal = resultado.getResultado();
        Assertions.assertEquals(89.6, temperaturaFinal, 2);
    }

    @Test
    void converterCelciusParaKelvin() {
        float temperatura = 50;
        Resultado resultado = this.conversorDeTemperatura.converterCelciusParaKelvin(temperatura);
        float temperaturaFinal = resultado.getResultado();
        Assertions.assertEquals(323.15, temperaturaFinal, 2);
    }

    @Test
    void converterFahrenheitParaCelcius() {
        float temperatura = 200.5F;
        Resultado resultado = this.conversorDeTemperatura.converterFahrenheitParaCelcius(temperatura);
        float temperaturaFinal = resultado.getResultado();
        Assertions.assertEquals(93.61, temperaturaFinal, 2);
    }
}