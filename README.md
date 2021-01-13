

# Validador de Senha
 >API em java e Spring Boot para validar senha.

## Descrição

O projeto consiste em uma de API Rest usando Spring Boot, java, Maven.

 Spring Boot na versão 2.5.0 
``https://spring.io/projects/spring-boot`` 

## Pré-requisitos
Você vai precisar:
* Maven - Apache Maven 3.6.1
* Java - JDK 11
* Lombok 

## Iniciando...

- `git clone https://github.com/thisisgh-dev/api-valida-senha.git`

  
# Instruções básicas de como executar o projeto

Vamos construir e executar o programa. Abra uma linha de comando (ou terminal) e navegue até a pasta onde você tem os arquivos do projeto. Podemos construir e executar o aplicativo emitindo o seguinte comando:

OS X & Linux:

```sh
./mvnw spring-boot:run
```

Windows:

```sh
mvnw spring-boot:run
```
## Executando o aplicativo localmente


```sh
http://localhost:8080
```
## /api

| Status | Feature | HTTP | Endpoint                            
| ------| ------- | ------ | -------------------------------- |
| 200   | principal | GET | **/api/validador** |
| 200   | abordagem 01 | GET | **/api/validador1** | 
| 200   | abordagem 02 | GET | **/api/validador2** |


## Swagger
Use a biblioteca Swagger atraves uma GUI para executar testes HTTP GET, POST, PUT, DELETE.

```sh
http://localhost:8080/swagger-ui.html
```
## Lombok
O uso da biblioteca do Lombok para gera getter / setter e implementa os métodos toString() e hashCode() de suas bibliotecas de modelo em tempo de compilação. Ele mantém as classes do modelo organizadas e limpas. 
>Você precisa instalar o plugin lombok na ferramenta IDE. Para o eclipse, baixe o lombok.jar do terminal, execute o jar
```sh
$ java -jar lombok.jar
```

# Detalhes sobre a solução

A API é dividida em domain, Service e Resource.

Nesse desafio usei como solução 3 abordagem diferentes com a intenção de mostar 3 formas diferentes de chegar no mesmo resultado.

Na primeira abordagem, a solução adotada na camada de serviço cada validação foi implementada em metodos separados e no Controller tem uma chamada para cada metodo foi feito uma verificdo se cada metodo retorna true.
Nessa solução a camada de testes foi implementado de forma unitaria.

Na segunda abordagem a validação foi implementada em um unico metodo na camada de serviço utilizando Regex.

Na terceira abordagem a validação foi implementada em um único metodo verificando primeiro em um if a quandade de caracteres em seguida laços para realizar as outras validações.











