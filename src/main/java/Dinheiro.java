public class Dinheiro implements Pagamento {
    @Override
    public String efetuarPagamento(float valorAPagar) {
        return "Pagamento em dinheiro no valor de R$ " + valorAPagar + " efetuado com sucesso!";
    }
}
