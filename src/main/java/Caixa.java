public class Caixa {
    private float valorAPagar;

    public Caixa(float valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public String realizarPagamento(Pagamento pagamento) {
        return pagamento.efetuarPagamento(valorAPagar);
    }
}
