public class Caneta {

    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean tampada;

    void status (){
        System.out.println("Uma caneta " + this.cor + ".");
        System.out.println("A caneta está tampada:" + this.tampada + ".");
        System.out.println("A caneta é "  + this.modelo + ".");
        System.out.println("A caneta tem a ponta " + this.ponta + ".");

    }
    void rabiscar (){
        if (this.tampada == true) {
            System.out.println("A Caneta está tampada, não posso rabiscar.");
        }   else {
            System.out.println("Estou rabiscando...");
        };
    }

    void tampar(){
        this.tampada = true;

    }
    void destampar(){
        this.tampada = false;
    }
}
