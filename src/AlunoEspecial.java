
public class AlunoEspecial extends Aluno {
    private String areaDePesquisa;
    
    public void SetAreaDePesquisa(String a){
        this.areaDePesquisa = a;
    }
    
    public String getAreaDePesquisa(){
        return this.areaDePesquisa;
    }
    public  AlunoEspecial (String n,int i, String m,String j){
        super (n,i,m);
       
    } 
}
