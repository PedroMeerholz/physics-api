package io.github.pedromeerholz.PhysicsApi.api.calculadoras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraForcaResultanteTest {

    @Test
    void calcularForcaResultante() {
        float massa = 300;
        float aceleracao = 0.5F;

        float forca = CalculadoraForcaResultante.calcularForcaResultante(massa, aceleracao);
        Assertions.assertEquals(150, forca);
    }
}