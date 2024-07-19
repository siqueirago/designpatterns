
# Projeto de Padrões de Projeto com Spring Boot
Este projeto demonstra a implementação de padrões de projeto (Design Patterns) utilizando Spring Boot. Os padrões implementados incluem Singleton, Factory Method e Strategy. Além disso, a documentação da API é gerada automaticamente utilizando Swagger.

## Estrutura do Projeto
* Singleton Pattern: Um único ponto de acesso para uma instância de classe.
* Factory Method Pattern: Uma interface para criar objetos, permitindo que subclasses decidam qual classe instanciar.
* Strategy Pattern: Permite a definição de uma família de algoritmos, encapsulando cada um e tornando-os intercambiáveis.
## Tecnologias Utilizadas
* Java 11
* Spring Boot 2.7.0
* Spring Web
* Lombok
* Swagger (Springdoc OpenAPI)
* Gradle
## Pré-requisitos
* JDK 11 ou superior
* Gradle
* IDE Java (IntelliJ, Eclipse, VS Code, etc.)

## Executando a Aplicação
Execute a classe DemoApplication na sua IDE ou use o comando Gradle para iniciar a aplicação:


A aplicação estará disponível em http://localhost:8080.

## Documentação da API
A documentação da API é gerada automaticamente pelo Swagger. Após iniciar a aplicação, acesse:

Copiar código
http://localhost:8080/swagger-ui.html

## Endpoints da API
### Singleton Endpoint
* GET /api/singleton
* Retorna uma mensagem do Singleton.
### Factory Method Endpoint
* GET /api/animal
* Parâmetro: type (string)
* Retorna o som de um animal com base no tipo fornecido (dog ou cat).
### Strategy Endpoint
* POST /api/pay
* Parâmetros:
* method (string) - Método de pagamento (creditcard ou paypal)
* amount (integer) - Valor a ser pago
* Retorna uma mensagem indicando o sucesso do pagamento.
## Estrutura do Código
* **DesignpatternsApplication.java:**  Classe principal que inicia a aplicação Spring Boot.
* **Singleton.java:** Implementação do padrão Singleton.
* **Animal.java, Dog.java, Cat.java:** Implementações do padrão Factory Method.
* **AnimalFactory.java:** Classe Factory para criar instâncias de Animal.
* **EstratagiaPagamento.java, PagamentoCreditCard.java, PagamentoPayPal.java:** Implementações do padrão Strategy.
* **CarrinhoCompra.java:** Classe que utiliza a estratégia de pagamento.
* **ApiController.java:** Controlador REST que expõe os endpoints da API.
* **SwaggerConfig.java:** Configuração do Swagger para a documentação da API.
## Contribuindo
Se desejar contribuir com este projeto, por favor, faça um fork do repositório e envie um pull request com suas melhorias ou correções.

## Contato
* Email: siqueiragomes123@gmail.com
* LinkedIn:www.linkedin.com/in/julio-siqueira-9bb0a7203


## Autor
* Julio Siqueira
  
Este README fornece uma visão geral do projeto e informações detalhadas sobre como configurar, executar e utilizar a aplicação. Se precisar de mais informações, sinta-se à vontade para abrir uma issue no repositório.

