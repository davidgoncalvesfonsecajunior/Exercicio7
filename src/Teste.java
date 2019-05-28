
public class Teste {

    public static void main(String[] args) {
        //teste de inserção e apresentação de pessoa 
        Pessoa p = new Pessoa("David", "Cidade: VZP RUA: abc N: 123", "38 9 9999 9999");
        Fornecedor f = new Fornecedor("david1", "anonimo", "38 9 8888 8888", 1000, 150);
        System.out.println("saldo do fornecedor: " + f.obterSaldo());
        Empregado e = new Empregado("David2", "Morador de rua", "38 9 7777 7777", "123456", 1600, 11);
        System.out.println("Salario do empregado com desconto: " + e.calcularSalario());
    }
}
