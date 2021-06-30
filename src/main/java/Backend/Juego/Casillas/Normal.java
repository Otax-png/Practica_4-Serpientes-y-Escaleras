package Backend.Juego.Casillas;

import Frontend.GraficJugador;

import java.awt.*;

public class Normal extends Casilla {
    public Normal(Color color) {
        super(color);
        this.text = "Normal";
    }

    @Override
    public void Accion(GraficJugador jugador) {

    }
}
