
public class TestaProfessor {

    public static void main(String[] args) {
        ProfessorRI p1 = new ProfessorRI("Humeberto Eishten", 30, "123", 4000);
        System.out.println("Salario mensal do professor Regime Integral: " + p1.SalarioRIMensal());

        ProfessorHorista p2 = new ProfessorHorista("nicolau Tesla", 26, "234", 75, 160);
        System.out.println("Salario mensal do professor Horista: " + p2.SalarioHorista());

    }
}
