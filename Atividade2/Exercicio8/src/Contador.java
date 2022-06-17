public class Contador {

    //Atribultos:
    private int valor;

    // Método contrutor:
    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    //Métodos
    public void zerar(){
        valor = 0;
    }

    public void incrementar(){
        valor++;
    }
    public int retornar(){
        System.out.println(valor);
        return valor;
    }
}
