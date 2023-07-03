package io.github.pedromeerholz.PhysicsApi.api.calculadoras;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraVelocidadeMedia {
    public static float calcularVelocidadeMedia(float espacoPercorrido, float intervaloTempo) {
        return espacoPercorrido / intervaloTempo;
    }
}
