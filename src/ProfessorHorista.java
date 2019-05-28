
public class ProfessorHorista extends Professor {

    private double valorHora;
    private int horasTrabalhadas;

    public void setValorHora(double v) {
        this.valorHora = v;
    }

    public double getValorHoras() {
        return this.valorHora;
    }

    public void setHorasTrabalhadas(int h) {
        this.horasTrabalhadas = h;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public double SalarioHorista() {
        double salario = this.getHorasTrabalhadas() * this.getValorHoras();
        return salario;
    }

    public ProfessorHorista(String n, int i, String m, double v, int h) {
        super(n, i, m);
        this.setValorHora(v);
        this.setHorasTrabalhadas(h);
    }
}
