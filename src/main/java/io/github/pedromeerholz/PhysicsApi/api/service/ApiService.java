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

    public Resultado converterTemperatura(String escalaOriginal, String escalaFinal, float temperatura) {
        if(escalaOriginal.equals("Celcius") && escalaFinal.equals("Fahrenheit")) {
            return this.converterCelciusParaFahrenheit(temperatura);
        }
        return new Resultado();
    }

    private Resultado converterCelciusParaFahrenheit(float temperatura) {
        float temperaturaFinal = temperatura * (9/5) + 32;
        return this.criarObjetoResultado(temperaturaFinal, "F");
    }

    private Resultado criarObjetoResultado(float resultadoEquacao, String unidadeDeMedida) {
        Resultado resultado = new Resultado();
        resultado.setResultado(resultadoEquacao);
        resultado.setUnidadeDeMedida(unidadeDeMedida);
        return resultado;
    }
}
