public class Pix implements Pagamento {
    @Override
    public String efetuarPagamento(float valorAPagar) {
        return "Chave PIX gerada com sucesso para pagamento no valor de R$ " + valorAPagar;
    }
}
