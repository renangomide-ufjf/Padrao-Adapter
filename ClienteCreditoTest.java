package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteCreditoTest {

    @Test
    void deveRetornarRatingCliente() {
        ClienteCredito cliente = new ClienteCredito();
        cliente.setScore("A");

        assertEquals("A", cliente.getScore());
    }

    @Test
    void deveRetornarPontuacaoCliente() {
        ClienteCredito cliente = new ClienteCredito();
        cliente.setScore("A");

        assertEquals(900.0f, cliente.getPontuacao());
    }

    @Test
    void deveRetornarRatingEPontuacaoParaDemaisFaixas() {
        ClienteCredito cliente = new ClienteCredito();

        cliente.setScore("B");
        assertEquals("B", cliente.getScore());
        assertEquals(700.0f, cliente.getPontuacao());

        cliente.setScore("C");
        assertEquals("C", cliente.getScore());
        assertEquals(500.0f, cliente.getPontuacao());

        cliente.setScore("D");
        assertEquals("D", cliente.getScore());
        assertEquals(300.0f, cliente.getPontuacao());
    }
}
