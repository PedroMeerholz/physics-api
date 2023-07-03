package io.github.pedromeerholz.PhysicsApi.api.calculadoras;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraForcaPeso {
    public static float calcularPeso(float massa, float aceleracaoGravidade) {
        return massa * aceleracaoGravidade;
    }
}
