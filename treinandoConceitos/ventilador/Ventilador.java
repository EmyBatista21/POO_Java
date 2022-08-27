package ventilador;

public class Ventilador {
    String modelo;
    String cor; 
    int velocidades;
    boolean ligado;

    void caracteristicas(){
        System.out.printf("Modelo: %s\nCor: %s\nVelocidades:%d\nLigado: %b\n", this.modelo, this.cor, this.velocidades, this.ligado);
        System.out.println("===============");
    }

    void ligar(){
        ligado = true;
    }
    
    void desligar(){
        ligado = false;
    }
}
