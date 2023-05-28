public class Cliente {
    private String comprovanteCompra;

    public String getComprovanteCompra() {
        return comprovanteCompra;
    }

    public void pagarComDinheiro(float valorCompra) {
        Caixa caixa = new Caixa(valorCompra);
        this.comprovanteCompra = caixa.realizarPagamento(new Dinheiro());
    }

    public void pagarComCartaoCredito(float valorCompra) {
        Caixa caixa = new Caixa(valorCompra);
        this.comprovanteCompra = caixa.realizarPagamento(new CartaoCredito());
    }

    public void pagarComPix(float valorCompra) {
        Caixa caixa = new Caixa(valorCompra);
        this.comprovanteCompra = caixa.realizarPagamento(new Pix());
    }
}
