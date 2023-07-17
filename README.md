# Physics API

## Objetivo
Esta API tem como objetivo realizar cálculos básicos de física, como:
* Velocidade média
* Força resultante
* Calcular peso
* Conversão de temperaturas entre as escalas Celsius, Fahrenheit e Kelvin

## Como executar o projeto?

Para executar o projeto será necessário ter instalado o Docker em seu computador. Caso você não tenha o Docker instalado, você deverá ter:
* Java 17
* Maven 3.6.3 (ou superior)

### Maneira 1 - Sem Docker
1. Faça o clone do projeto utilizando git
2. No diretório raiz do projeto, execute o comando: 
```bash
mvn spring-boot:run
```

### Maneira 2 - Com Docker
1. Faça o pull da imagem em seu computador
```bash
docker pull pedromeerholz/physics-api:1.1
```
2. Rode um container com a imagem da aplicação:
```bash
docker run --name physics-api -p 8080:8080 pedromeerholz/physics-api:1.1
```
ou caso queira que o container seja excluído após ser finalizado, execute:
```bash
docker run --rm -p 8080:8080 pedromeerholz/physics-api:1.1
```
3. Para acessar a documentação da API, acesse em seu navegador:
```bash
http://localhost:8080/swagger-ui/index.html#/
```