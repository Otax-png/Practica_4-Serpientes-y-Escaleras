package Backend.Juego.Casillas;

import Backend.Juego.Tablero;
import Frontend.GraficJugador;

import java.awt.*;

public class Serpiente extends Casilla {
    public Serpiente(Color color) {
        super(color);
        this.text = "Serpiente /";
    }

    @Override
    public void Accion(GraficJugador jugador) {
        int index = jugador.referencia.index - 10;
        jugador.setReferencia(Tablero.casillas[index]);
    }
}
