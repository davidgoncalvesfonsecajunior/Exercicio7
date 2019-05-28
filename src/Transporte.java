
public class Transporte {

    private int capacidade;

    public void SetCapacidade(int c) {
        this.capacidade = c;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public Transporte(int c) {
        this.SetCapacidade(c);
    }
}
