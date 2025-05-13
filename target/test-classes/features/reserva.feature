# language: pt
Funcionalidade: Reserva de carro por aplicativo
  Como passageiro de um aplicativo de transporte
  Quero reservar um carro informando meu local
  Para que eu possa me deslocar com comodidade e segurança

  Cenário: Reserva dentro da área de cobertura - Belo Horizonte
    Dado que estou na cidade "Belo Horizonte"
    E meu endereço é "Av. Afonso Pena, 1000"
    Quando solicito uma reserva de carro
    Então deve retornar a mensagem "Motorista a caminho"

  Cenário: Reserva dentro da área de cobertura - Contagem
    Dado que estou na cidade "Contagem"
    E meu endereço é "Rua São Paulo, 500"
    Quando solicito uma reserva de carro
    Então deve retornar a mensagem "Motorista a caminho"

  Cenário: Reserva fora da área de cobertura
    Dado que estou na cidade "Betim"
    E meu endereço é "Rua das Flores, 200"
    Quando solicito uma reserva de carro
    Então deve retornar a mensagem "Área fora de cobertura"
