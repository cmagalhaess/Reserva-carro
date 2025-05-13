/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

/**
 *
 * @author Coliveira
 */

public class ReservaService {
    public String reservar(String cidade, String endereco) {
        if (AreaCobertura.cidadeEstaNaAreaDeCobertura(cidade)) {
            return "Motorista a caminho";
        }
        return "Área fora de cobertura";
    }
}
