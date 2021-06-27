package Backend.Juego;

import Backend.Utilities;

public class Dado implements Utilities {

    private int numeroDado;

    public Dado(int numeroDado) {
        this.numeroDado = numeroDado;
    }

    private void tirarDado(int numeroDado){
        numeroDado = generarRandom(6,1);
    }

}
