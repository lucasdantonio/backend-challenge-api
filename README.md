
# BackEnd Challenge API
[Movies APIREST](https://movieapi-challenge.herokuapp.com/swagger-ui.html)

**O desafio foi feito utilizando:**

 - **Eclipse Java EE IDE for Web Developers 4.13.0** - IDE que eu já utilizo a um bom tempo desenvolvendo em Java, porém algumas vezes também uso IntelliJ
 - **Java 8** - Versão que eu utilizo com frequência
 - **Maven** - Controle de dependências
 - **Spring Boot 2.2.4** - Versão a gosto
 - **PostgreeSQL 42.2.9** - Banco de dados a gosto
 - **Lombok 1.18.10** - Usado pra evitar boilerplate code
 - **SpringFox Swagger 2.7.0** - Gosto de utilizar ao criar APIs para gerar
   uma documentação dela e uma parte visual que facilite seu
   entendimento e uso(para testes)
 - **JUnit, Mockito, entre outros que iria utilizar, o motivo está mais
   abaixo...**

  

## Uso

Você deve ter em seu stack obrigatoriamente:

 - **Java 8 ou +**
 - **Maven**
 - **Docker**

A aplicação pode ter testada no seu ambiente, que ao executar estará rodando na porta padrão **8080**, por meio da **Swagger UI** pelo link [/Swagger-ui.html](/Swagger-ui.html)

*E pode também ser testada pelo link:* https://movieapi-challenge.herokuapp.com/swagger-ui.html

## Métodos

A API possui 2 métodos simples(para visualizar pelo swagger pasta clicar em "Show/Hide")

 1. **GET /api/movies** - Retorna, de acordo com o parâmetro censorship, uma lista de filmes.
 2. **POST /api/movies** - Adiciona um novo filme, por meio de uma estrutura json simples.

  
## Arquitetura

 - **Config** - Configurações do Swagger
 - **Exception** - As exceções personalizadas
 - **Model** - Entidades
 - **Repository** - Interface JPA
 - **Resources** - Implementa as regras de negócio

  
## Testes

As classes de testes não foram feitas por conta do tempo..

Atualmente estou responsável pelo desenvolvimento de um projeto no qual uma das sprints termina nesta sexta-feira(28/02)

e por conta disso só tive um dia de manhã livre pra conseguir realizar este desafio