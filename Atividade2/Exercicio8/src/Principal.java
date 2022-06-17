public class Principal {
    public static void main(String[] args) {
        Contador c1 = new Contador(52);
        c1.incrementar();
        c1.retornar();
        c1.zerar();
        c1.retornar();

        Contador c2 = new Contador(2);
        c2.incrementar();
        c2.retornar();

        Contador c3 = new Contador(2);
        c3.zerar();
        c3.retornar();
    }
}
