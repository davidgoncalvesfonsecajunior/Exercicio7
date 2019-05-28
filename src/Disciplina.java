
public class Disciplina {
    private String nomeDis;   
    private String area;
    private int cargaHor;//em horas
    
    public void SetNomeDis(String n){
        this.nomeDis = n;
    }
    
    public String getNomeDis(){
        return this.nomeDis;
    }
    
    public void SetArea(String a){
        this.area = a;
    }
    
    public String getArea(){
        return this.area;
    }
    
    public void SetCargaHor(int c){
        this.cargaHor = c;
    }
    
    public int getCargaHor(){
        return this.cargaHor;
    }
    
    public Disciplina (String n, String a, int c){
        this.SetNomeDis(n);
        this.SetArea(a);
        this.SetCargaHor(c);
     }
}
