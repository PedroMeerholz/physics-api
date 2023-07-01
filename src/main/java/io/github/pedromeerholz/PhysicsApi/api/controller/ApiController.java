package io.github.pedromeerholz.PhysicsApi.api.controller;

import io.github.pedromeerholz.PhysicsApi.api.Resultado;
import io.github.pedromeerholz.PhysicsApi.api.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class ApiController {
    private ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping(value = "/velocidadeMedia", produces = "application/json")
    public Resultado calcularVelocidadeMedia(@RequestParam float espacoPercorrido, @RequestParam float intervaloTempo) {
        return this.apiService.calcularVelocidadeMedia(espacoPercorrido, intervaloTempo);
    }

    @GetMapping(value = "/forcaResultante", produces = "application/json")
    public Resultado calcularForcaResultante(@RequestParam float massa, @RequestParam float aceleracao) {
        return this.apiService.calcularForcaResultante(massa, aceleracao);
    }
    
    @GetMapping(value = "/peso", produces = "application/json")
    public Resultado calcularPeso(@RequestParam float massa, @RequestParam float aceleracaoGravidade) {
        return this.apiService.calcularPeso(massa, aceleracaoGravidade);
    }
}
