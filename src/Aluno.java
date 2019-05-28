
public class Aluno {

    private String nome;
    private int idade;
    private String matricula;

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setMatricula(String m) {
        this.matricula = m;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Aluno(String n, int i, String m) {
        this.setNome(n);
        this.setIdade(i);
        this.setMatricula(m);

    }

}
