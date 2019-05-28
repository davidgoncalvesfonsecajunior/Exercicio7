
public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public void setValorCredito(double c) {
        this.valorCredito = c;
    }

    public void setValorDivida(double d) {
        this.valorDivida = d;
    }

    public double getValorCredito() {
        return this.valorCredito;
    }

    public double getValorDivida() {
        return this.valorDivida;
    }

    public double obterSaldo() {
        double saldo = this.getValorCredito() - this.getValorDivida();
        return saldo;
    }

    public Fornecedor(String n, String e, String t, double c, double d) {
        super(n, e, t);
        this.setValorCredito(c);
        this.setValorDivida(d);

    }
}
