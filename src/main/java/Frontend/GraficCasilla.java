package Frontend;

import Backend.Juego.Casillas.*;
import javax.swing.*;
import java.awt.*;

public class GraficCasilla extends JPanel {
    public Casilla escaque;
    public int index;
    public int x;
    public int y;
    public JPanel Jugador;

    public GraficCasilla(Casilla escaque, int x, int y, int index){
        setLayout(new GridLayout(2,1));
        this.index = index;
        this.escaque = escaque;
        this.x = x;
        this.y = y;
        setBackground(escaque.color);
        add(new JLabel(escaque.text));

        Jugador = new JPanel();
        Jugador.setLayout(new GridLayout(0,3));

        add(Jugador);

    }



}
