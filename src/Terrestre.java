
public class Terrestre extends Transporte {

    private int numRodas;

    public void SetNumRodas(int n) {
        this.numRodas = n;
    }

    public int getNumRodas() {
        return this.numRodas;
    }

    public Terrestre(int c, int n) {
        super(c);
        this.SetNumRodas(n);
    }
}
