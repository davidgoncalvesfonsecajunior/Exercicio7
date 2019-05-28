
public class Pessoa {

    String nome;
    String endereco;
    String telefone;

    public void setNome(String n) {
        this.nome = n;
    }

    public void setEndereco(String e) {
        this.endereco = e;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public Pessoa(String n, String e, String t) {
        this.setNome(n);
        this.setEndereco(e);
        this.setTelefone(t);

    }
}
