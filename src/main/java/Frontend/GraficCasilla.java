package Frontend;

import Backend.Juego.Casillas.*;

import javax.management.DescriptorAccess;
import javax.swing.*;
import java.awt.*;

public class GraficCasilla extends JButton {
    Casilla escaque;
    int x;
    int y;

    public GraficCasilla(Casilla escaque, int x, int y){
        this.escaque = escaque;
        this.x = x;
        this.y = y;
        setBackground(escaque.color);
        setText(escaque.text);
    }



}
