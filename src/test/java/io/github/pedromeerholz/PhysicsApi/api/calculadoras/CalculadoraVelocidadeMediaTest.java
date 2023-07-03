package io.github.pedromeerholz.PhysicsApi.api.calculadoras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraVelocidadeMediaTest {

    @Test
    void calcularVelocidadeMedia() {
        float espacoPercorrido = 600;
        float intervaloTempo = 2;

        float intervalo = CalculadoraVelocidadeMedia.calcularVelocidadeMedia(espacoPercorrido, intervaloTempo);

        Assertions.assertEquals(300, intervalo);
    }
}