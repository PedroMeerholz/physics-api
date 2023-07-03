package io.github.pedromeerholz.PhysicsApi.api.calculadoras;

import io.github.pedromeerholz.PhysicsApi.api.resultado.Resultado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraForcaPesoTest {


    @Test
    void calcularPeso() {
        float massa = 100;
        float aceleracaoGravidade = 0.5F;
        float peso = CalculadoraForcaPeso.calcularPeso(massa, aceleracaoGravidade);
        Assertions.assertEquals(50, peso);
    }
}