import java.util.Scanner;

public class AdvinaNum {

    private Scanner entrada = new Scanner(System.in);
    private boolean juegoact = true;

    public void jugar(){
        String nombreJugador = pidiendoDatos();

        while (juegoact){
            int intentos = 0;
            int min = 0;
            int max = 100;
            int numJuego = generarnumeroaleatorio(1, 100);
            //System.out.println(numJuego);
            System.out.printf("%s, tienes que advinar un numero entre %d y %d\n", nombreJugador, min, max);

            int numeroJugador;

            do {
                numeroJugador = escogerNum();
                mensaje(numJuego, numeroJugador);

                intentos++;

            }while (numJuego != numeroJugador);
                juegoact = denuevo();
        }

    }
    private int generarnumeroaleatorio(int min, int max){
        return min + (int) (Math.random() * ((max - min) +1));
    }
    private String pidiendoDatos(){
        System.out.println("¿Cual es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar \n", nombreJugador);
        return nombreJugador;
    }
    private int escogerNum() {
        System.out.println("Escoge un numero");
        return entrada.nextInt();
    }
    private void mensaje(int numJuego, int numeroJugador){
        if (numJuego < numeroJugador) {
            System.out.println("Es un numero muy alto, intente otra vez");
        } else if (numJuego > numeroJugador) {
            System.out.println("Es un numero muy bajo, intente otra vez");
        }
    }
    public boolean denuevo (){
        System.out.println("¿Jugar nuevamente?\n1. Si\n2. No");
        int respuesta = entrada.nextInt();
        if (respuesta == 1){
            System.out.println("Bien, volvamos a jugar");
            return true;
        }else {
            System.out.println("Gracias por jugar");
            return false;
        }
    }
}