public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.modelo = "bic";
        c1.tampada = false;
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.ponta = 0.7f;
        c2.cor = "verde";
        c2.modelo = "compacto";
        c2.tampada = true;
        c2.status();
        c2.rabiscar();
    }
}
