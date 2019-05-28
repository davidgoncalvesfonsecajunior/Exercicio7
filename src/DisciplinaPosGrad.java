
public class DisciplinaPosGrad extends Disciplina{
    private String professoPos;
    
    public void SetProfessoPos(String p){
        this.professoPos = p;
    }
    
    public String getProfessoPos(){
        return this.professoPos;
    }
    
     public DisciplinaPosGrad(String n, String a, int c, String p){
        super(n,a,c);
        this.SetProfessoPos(p);
    }
}
