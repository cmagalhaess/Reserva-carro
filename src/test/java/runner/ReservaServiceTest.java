/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runner;

/**
 *
 * @author Coliveira
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import reserva.ReservaService;

class ReservaServiceTest {
    private final ReservaService reservaService = new ReservaService();

    @Test
    void reservar_deveRetornarMotoristaACaminho_paraBeloHorizonte() {
        String resultado = reservaService.reservar("Belo Horizonte", "Av. Afonso Pena, 1000");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    void reservar_deveRetornarMotoristaACaminho_paraContagem() {
        String resultado = reservaService.reservar("Contagem", "Rua São Paulo, 500");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    void reservar_deveRetornarAreaForaDeCobertura_paraCidadeNaoCoberta() {
        String resultado = reservaService.reservar("Betim", "Rua das Flores, 200");
        assertEquals("Área fora de cobertura", resultado);
    }
}