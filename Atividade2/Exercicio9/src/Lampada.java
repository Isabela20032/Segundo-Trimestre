public class Lampada {

    //Atribultos
    private boolean lampada;

    //Método contrutor

    public Lampada() {}

    public Lampada(boolean lampada) {
        this.lampada = lampada;
    }

    //Métodos
    public void acender(){
        lampada = true;
    }

    public void desligada(){
        lampada = false;
    }

    public boolean estado() {
        if (lampada == true){
            System.out.println("A lâmpada está ligada");
        }else if (lampada == false){
            System.out.println("A lâmpada está desligada");
        }
        return lampada;
    }

}
