# 🚗 Projeto Reserva de Carro

Este é um projeto Java que simula a reserva de um carro por aplicativo, utilizando práticas de **TDD (Test Driven Development)** e **BDD (Behavior Driven Development)** com **JUnit 5** e **Cucumber**.

## 📚 Funcionalidade

Permite que usuários solicitem uma reserva de carro informando a cidade e o endereço. O sistema verifica se a cidade está na área de cobertura e retorna a mensagem apropriada.

## 🧪 Tecnologias utilizadas

- Java 11
- Maven
- JUnit 5
- Cucumber (versão 7.14.0)

## 📁 Estrutura do projeto

reserva_carro/
├── pom.xml
├── src/
│ ├── main/java/reserva/
│ │ ├── AreaCobertura.java
│ │ └── ReservaService.java
│ └── test/
│ ├── java/
│ │ ├── runner/ReservaRun.java
│ │ ├── steps/ReservaSteps.java
│ │ └── ReservaServiceTest.java
│ └── resources/features/reserva.feature


## 🚀 Como executar os testes

### Testes unitários com JUnit

```bash
mvn test -Dtest=ReservaServiceTest

Testes BDD com Cucumber
bash
Copiar
Editar
mvn test
O relatório será gerado em:
target/cucumber-reports.html
