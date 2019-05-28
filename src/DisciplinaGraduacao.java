
public class DisciplinaGraduacao extends Disciplina{
    private String professoGraduacao;
    
    public void SetProfessoGraduacao(String p){
        this.professoGraduacao = p;
    }
    
    public String getProfessoGraduacao(){
        return this.professoGraduacao;
    }
    public DisciplinaGraduacao(String n, String a, int c, String p){
        super(n,a,c);
        this.SetProfessoGraduacao(p);
    }
}
