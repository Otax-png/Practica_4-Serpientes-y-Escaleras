package Frontend;

import Backend.Juego.Casillas.*;

import javax.management.DescriptorAccess;
import javax.swing.*;
import java.awt.*;

public class Botones extends JButton {
    Casilla escaque;
    int x;
    int y;

    public Botones(Casilla escaque){
        this.escaque = escaque;
        setBackground(escaque.color);
        setText(escaque.text);
    }



}
