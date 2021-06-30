package Frontend;

import Backend.Jugador.Jugador;

import javax.swing.*;
import java.awt.*;

public class GraficJugador extends JButton {

    public Jugador Usuario;
    public GraficCasilla referencia = null;
    public Color colorUsuario;

    public GraficJugador(Jugador usuario, Color colorUsuario) {
        Usuario = usuario;
        this.colorUsuario = colorUsuario;
        setBackground(colorUsuario);
    }

    public void setReferencia(GraficCasilla referencia) {
        referencia.add(this);
        this.referencia = referencia;
        this.referencia.escaque.Accion(this);
    }


}