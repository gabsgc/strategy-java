import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void devePagarComDinheiro() {
        Cliente cliente = new Cliente();
        cliente.pagarComDinheiro(20.0f);
        assertEquals("Pagamento em dinheiro no valor de R$ 20.0 efetuado com sucesso!",
                cliente.getComprovanteCompra());
    }

    @Test
    void devePagarComCartaoCredito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoCredito(50.0f);
        assertEquals("Pagamento no valor de R$ 50.0 usando cartão de crédito efetuado com sucesso.",
                cliente.getComprovanteCompra());
    }

    @Test
    void devePagarComPix() {
        Cliente cliente = new Cliente();
        cliente.pagarComPix(30.0f);
        assertEquals("Chave PIX gerada com sucesso para pagamento no valor de R$ 30.0",
                cliente.getComprovanteCompra());
    }
}