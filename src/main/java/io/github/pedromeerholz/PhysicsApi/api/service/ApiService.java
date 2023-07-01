package io.github.pedromeerholz.PhysicsApi.api.service;

import io.github.pedromeerholz.PhysicsApi.api.resultado.Resultado;
import io.github.pedromeerholz.PhysicsApi.api.conversorDeTemperatura.ConversorDeTemperatura;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    private ConversorDeTemperatura conversorDeTemperatura;

    public ApiService(ConversorDeTemperatura conversorDeTemperatura) {
        this.conversorDeTemperatura = conversorDeTemperatura;
    }

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
            return this.conversorDeTemperatura.converterCelciusParaFahrenheit(temperatura);
        } else if (escalaOriginal.equals("Celcius") && escalaFinal.equals("Kelvin")) {
            return this.conversorDeTemperatura.converterCelciusParaKelvin(temperatura);
        } else if (escalaOriginal.equals("Fahrenheit") && escalaFinal.equals("Celcius")) {
            return this.conversorDeTemperatura.converterFahrenheitParaCelcius(temperatura);
        } else if (escalaOriginal.equals("Fahrenheit") && escalaFinal.equals("Kelvin")) {
            return this.conversorDeTemperatura.converterFahrenheitParaKelvin(temperatura);
        } else if (escalaOriginal.equals("Kelvin") && escalaFinal.equals("Celcius")) {
            return this.conversorDeTemperatura.converterKelvinParaCelcius(temperatura);
        } else if (escalaOriginal.equals("Kelvin") && escalaFinal.equals("Fahrenheit")) {
            return this.conversorDeTemperatura.converterKelvinParaFahrenheit(temperatura);
        }
        return new Resultado();
    }

    private Resultado criarObjetoResultado(float resultadoEquacao, String unidadeDeMedida) {
        Resultado resultado = new Resultado();
        resultado.setResultado(resultadoEquacao);
        resultado.setUnidadeDeMedida(unidadeDeMedida);
        return resultado;
    }
}
