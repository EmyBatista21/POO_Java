package treinandoConceitos.ventilador;

public class CriandoVentiladores {
    public static void main(String[] args) {
        Ventilador ventilador1 = new Ventilador();
        ventilador1.modelo = "Mondial"; 
        ventilador1.cor = "Preto"; 
        ventilador1.velocidades = 3;
        ventilador1.ligado = false; 
        ventilador1.ligar();
        ventilador1.caracteristicas();

        Ventilador ventilador2 = new Ventilador();
        ventilador2.modelo = "Arno"; 
        ventilador2.cor = "Branco"; 
        ventilador2.velocidades = 4;
        ventilador2.ligado = true; 
    }
}
