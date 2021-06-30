package Backend.Juego.Casillas;

import Backend.Juego.Tablero;
import Frontend.GraficJugador;

import javax.swing.*;
import java.awt.*;

public class Serpiente extends Casilla {
    public Serpiente(Color color) {
        super(color);
        this.text = "Serpiente /";
    }

    @Override
    public void Accion(GraficJugador jugador) {
        int index = jugador.referencia.index - 1;
        JOptionPane.showMessageDialog(null,"Has caido en una escalera, Tu Ficha se ha movido 10 pocisiones atras");
        jugador.setReferencia(Tablero.casillas[index]);
    }
}
