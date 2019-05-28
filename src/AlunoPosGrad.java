
public class AlunoPosGrad extends Aluno {
     private String areaDeAtuacao;
    
    public void SetAreaDeAtuacao(String a){
        this.areaDeAtuacao = a;
    }
    
    public String getAreaDeAtuacao(){
        return this.areaDeAtuacao;
    }
    
     public  AlunoPosGrad (String n,int i, String m,String a){
        super (n,i,m);
        this.SetAreaDeAtuacao(a);
    }
}
