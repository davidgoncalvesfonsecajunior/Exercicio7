
public class Empregado extends Pessoa {

    String codigoSetor;
    double salarioBase;
    double imposto;

    public void setCodigoSetor(String c) {
        this.codigoSetor = c;
    }

    public String getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setSalarioBase(double s) {
        this.salarioBase = s;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setImposto(double i) {
        this.imposto = i;
    }

    public double getImposto() {
        return this.imposto;
    }

    public double calcularSalario() {
        double salario = this.getSalarioBase();
        salario -= (this.getSalarioBase() * (this.getImposto() * .01));
        return salario;
    }

    public Empregado(String n, String e, String t, String c, double s, double i) {
        super(n, e, t);
        this.setCodigoSetor(c);
        this.setSalarioBase(s);
        this.setImposto(i);

    }
}
