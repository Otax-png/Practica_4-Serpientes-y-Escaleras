package Backend.Juego.Casillas;

import Frontend.GraficJugador;

import java.awt.*;

public abstract class Casilla {

    public Color color;
    public String text;


    public Casilla(Color color) {
        this.color = color;
    }

    public abstract void Accion(GraficJugador jugador);
}
