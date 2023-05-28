public class CartaoCredito implements Pagamento {
    @Override
    public String efetuarPagamento(float valorAPagar) {
        return "Pagamento no valor de R$ " + valorAPagar + " usando cartão de crédito efetuado com sucesso.";
    }
}
