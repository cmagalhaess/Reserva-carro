/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;
import java.util.Arrays;
import java.util.List;

public class AreaCobertura {
    private static final List<String> CIDADES_COBERTAS = Arrays.asList(
        "Belo Horizonte", 
        "Contagem"
    );
    
    public static boolean cidadeEstaNaAreaDeCobertura(String cidade) {
        return CIDADES_COBERTAS.contains(cidade);
    }
}