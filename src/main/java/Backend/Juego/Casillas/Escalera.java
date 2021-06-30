package Backend.Juego.Casillas;

import Frontend.GraficJugador;

import java.awt.*;

public class Escalera extends Casilla{
    public Escalera(Color color) {
        super(color);
        this.text = "# Escalera";
    }

    @Override
    public void Accion(GraficJugador jugador) {

    }
}
