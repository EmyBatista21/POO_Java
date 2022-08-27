package caneta;
/**
 * caneta
 */
public class Caneta { // Classe caneta 
    // Atributos da classe caneta
    String modelo; 
    String cor;
    float ponta; 
    int carga;
    boolean tampada; 

    void status(){
        System.out.printf("Modelo: %s\nCor: %s\nPonta: %.1f\nCarga: %d\nTampada: %b\n", this.modelo, this.cor, this.ponta, this.carga, tampada);
        System.out.println("=============================");
    }


    void rabiscar(){ // Método rabiscar
        if(this.tampada){
            System.out.println("Caneta com tampa não rabisca");
        }else{
            System.out.println("Rabiscando");
        }
    }

    void tampar(){ // Método tampar
        tampada = true; 
    }

    void destampar(){
        tampada = false; 
    }
    
}