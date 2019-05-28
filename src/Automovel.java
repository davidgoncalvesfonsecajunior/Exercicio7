
public class Automovel extends Terrestre {

    private String cor;
    private int numPortas;
    private String placa;
    
    public void SetCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void SetNumPortas(int nP) {
        this.numPortas = nP;
    }
    
    public int getNumPortas() {
        return this.numPortas;
    }
    
    public void SetPlaca(String p) {
        this.placa = p;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public Automovel(int c, int n, String cor, int nP, String p) {
        super(c, n);
        this.SetCor(cor);
        this.SetNumPortas(nP);
        this.SetPlaca(p);
    }
}
