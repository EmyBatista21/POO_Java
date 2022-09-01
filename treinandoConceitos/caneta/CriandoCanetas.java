package treinandoConceitos.caneta;
public class CriandoCanetas {
    public static void main(String[] args) {
        // Instancias
        Caneta caneta1 = new Caneta(); // Método construtor de objeto
        caneta1.modelo = "Bic"; 
        caneta1.cor = "Azul"; 
        caneta1.ponta = 0.5f;
        caneta1.carga = 50;
        caneta1.tampada = true; 
        caneta1.tampar(); 
        caneta1.rabiscar(); 
        //caneta1.status(); 
        
        Caneta caneta2 = new Caneta(); // Método construtor de objeto
        caneta2.modelo = "Bic"; 
        caneta2.cor = "Preta"; 
        caneta2.ponta = 0.4f;
        caneta2.carga = 70;
        caneta2.tampada = false; 
        caneta2.destampar(); 
        caneta2.rabiscar(); 
        //caneta2.status(); 
    }
}
