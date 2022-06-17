public class Conta {

    //Atribultos
    private String nome;
    private int numero;
    private float saldo;

    //Método contrutor

    public Conta() {
    }

    public Conta(String nome, int numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    //Métodos da classe
    public void Depositar(float valor){
        saldo += valor;
    }

    public void Sacar(float valor){
        saldo -= valor;
    }

    //Métodos getters

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }
}
