
public class AlunoGraduacao extends Aluno {
    private String formacaoAtual;
    
    public void SetDisciplinaGraduacao(String f){
        this.formacaoAtual = f;
    }
    
    public String getDisciplinaGraduacao(){
        return this.formacaoAtual;
    }
    
     public  AlunoGraduacao (String n,int i, String m,String f){
        super (n,i,m);
        this.SetDisciplinaGraduacao(f);
    }
}
