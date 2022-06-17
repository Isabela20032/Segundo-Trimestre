public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta("João", 1, 520.20f);
        c1.Depositar(1100);
        c1.Sacar(25.30f);
        System.out.println(c1.getNumero() + " " +c1.getNome() + " " +  c1.getSaldo());

        Conta c2 = new Conta("Maria", 2, 1200);
        c2.Depositar(560);
        System.out.println(c2.getNumero() + " " + c2.getNome() + " " +  c2.getSaldo());
    }
}
