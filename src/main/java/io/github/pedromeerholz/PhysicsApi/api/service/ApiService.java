package io.github.pedromeerholz.PhysicsApi.api.service;

import io.github.pedromeerholz.PhysicsApi.api.Resultado;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    public Resultado calcularVelocidadeMedia(float espacoPercorrido, float intervaloTempo) {
        float velocidadeMedia = espacoPercorrido / intervaloTempo;
        return this.criarObjetoResultado(velocidadeMedia, "m/s");
    }

    public Resultado calcularForcaResultante(float massa, float aceleracao) {
        float forcaResultante = massa * aceleracao;
        return this.criarObjetoResultado(forcaResultante, "N");
    }

    public Resultado calcularPeso(float massa, float aceleracaoGravidade) {
        float peso = massa * aceleracaoGravidade;
        return this.criarObjetoResultado(peso, "N");
    }

    private Resultado criarObjetoResultado(float resultadoEquacao, String unidadeDeMedida) {
        Resultado resultado = new Resultado();
        resultado.setResultado(resultadoEquacao);
        resultado.setUnidadeDeMedida(unidadeDeMedida);
        return resultado;
    }
}
