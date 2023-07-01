package io.github.pedromeerholz.PhysicsApi.api.service;

import io.github.pedromeerholz.PhysicsApi.api.Resultado;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public Resultado calcularVelocidadeMedia(float espacoPercorrido, float intervaloTempo) {
        float velocidadeMedia = espacoPercorrido / intervaloTempo;
        Resultado resultado = new Resultado();
        resultado.setResultado(velocidadeMedia);
        resultado.setUnidadeDeMedida("m/s");
        return resultado;
    }
}
