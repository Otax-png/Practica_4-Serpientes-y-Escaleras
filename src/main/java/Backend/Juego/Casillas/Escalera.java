package Backend.Juego.Casillas;

import Backend.Juego.Tablero;
import Frontend.GraficJugador;

import javax.swing.*;
import java.awt.*;

public class Escalera extends Casilla{
    public Escalera(Color color) {
        super(color);
        this.text = "# Escalera";
    }

    @Override
    public void Accion(GraficJugador jugador) {

        int index = jugador.referencia.index + 15;
        JOptionPane.showMessageDialog(null,"Has caido en una escalera, Tu Ficha se ha movido 10 pocisiones");
        jugador.setReferencia(Tablero.casillas[index]);
    }
}
