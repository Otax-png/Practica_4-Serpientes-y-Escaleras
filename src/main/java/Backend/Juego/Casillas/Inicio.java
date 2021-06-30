package Backend.Juego.Casillas;

import Frontend.GraficJugador;

import java.awt.*;

public class Inicio extends Casilla{
    public Inicio(Color color) {
        super(color);
        this.text = "Inicio";
    }

    @Override
    public void Accion(GraficJugador jugador) {

    }
}
