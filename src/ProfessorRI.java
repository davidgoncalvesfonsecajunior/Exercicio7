
public class ProfessorRI extends Professor {

    private double salarioFixo;

    public void setSalarioFixo(double s) {
        this.salarioFixo = s;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double SalarioRIMensal() {
        double salario = this.getSalarioFixo() * 4;
        return salario;
    }

    public ProfessorRI(String n, int i, String m, double s) {
        super(n, i, m);
        this.setSalarioFixo(s);
    }
}
