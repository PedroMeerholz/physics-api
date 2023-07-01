package io.github.pedromeerholz.PhysicsApi.api.conversorDeTemperatura;

import io.github.pedromeerholz.PhysicsApi.api.resultado.Resultado;
import org.springframework.stereotype.Component;

@Component
public class ConversorDeTemperatura {
    public Resultado converterCelciusParaFahrenheit(float temperatura) {
        float temperaturaFinal = temperatura * (9/5) + 32;
        return this.criarObjetoResultado(temperaturaFinal, "°F");
    }

    public Resultado converterCelciusParaKelvin(float temperatura) {
        float temperaturaFinal = (float) (temperatura + (273.15));
        return this.criarObjetoResultado(temperaturaFinal, "K");
    }

    public Resultado converterFahrenheitParaCelcius(float temperatura) {
        float temperaturaFinal = (float) ((temperatura - 32) / 1.8);
        return this.criarObjetoResultado(temperaturaFinal, "°C");
    }

    public Resultado converterFahrenheitParaKelvin(float temperatura) {
        float temperaturaFinal = (float) ((temperatura + 459.67) / 1.8);
        return this.criarObjetoResultado(temperaturaFinal, "K");
    }

    public Resultado converterKelvinParaCelcius(float temperatura) {
        float temperaturaFinal = (float) (temperatura - 273.15);
        return this.criarObjetoResultado(temperaturaFinal, "°C");
    }

    public Resultado converterKelvinParaFahrenheit(float temperatura) {
        float temperaturaFinal = (float) ((temperatura - 273.15) * 1.8 + 32);
        return this.criarObjetoResultado(temperaturaFinal, "°F");
    }

    private Resultado criarObjetoResultado(float resultadoEquacao, String unidadeDeMedida) {
        Resultado resultado = new Resultado();
        resultado.setResultado(resultadoEquacao);
        resultado.setUnidadeDeMedida(unidadeDeMedida);
        return resultado;
    }
}
