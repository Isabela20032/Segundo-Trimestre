public class Principal {
    public static void main(String[] args) {
        Lampada l1 = new Lampada(false);
        l1.acender();
        l1.estado();
        l1.desligada();
        l1.estado();

        Lampada l2 = new Lampada(true);
        l2.estado();

        Lampada l3 = new Lampada(false);
        l3.acender();
        l3.estado();
    }
}
