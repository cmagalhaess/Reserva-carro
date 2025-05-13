/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import static org.junit.jupiter.api.Assertions.*;
import reserva.ReservaService;

public class ReservaSteps {
    private String cidade;
    private String endereco;
    private String mensagemRetorno;
    private final ReservaService reservaService = new ReservaService();

    @Dado("que estou na cidade {string}")
    public void que_estou_na_cidade(String cidade) {
        this.cidade = cidade;
    }

    @Dado("meu endereço é {string}")
    public void meu_endereço_é(String endereco) {
        this.endereco = endereco;
    }

    @Quando("solicito uma reserva de carro")
    public void solicito_uma_reserva_de_carro() {
        this.mensagemRetorno = reservaService.reservar(cidade, endereco);
    }
    
    @Então("deve retornar a mensagem {string}")
    public void deve_retornar_a_mensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, mensagemRetorno);
    }
}
