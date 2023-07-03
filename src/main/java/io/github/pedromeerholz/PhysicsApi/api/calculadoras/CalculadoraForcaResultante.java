package io.github.pedromeerholz.PhysicsApi.api.calculadoras;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraForcaResultante {
    public static float calcularForcaResultante(float massa, float aceleracao) {
        return massa * aceleracao;
    }
}
