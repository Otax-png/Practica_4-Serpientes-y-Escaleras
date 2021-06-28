package Frontend;

import Backend.Jugador.Jugador;
import Backend.Jugador.Usuario;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    Jugador[] listaUsuarios = new Jugador[12];

    JPanel centerPane = new JPanel();
    JPanel northPane = new JPanel();
    JPanel southPane = new JPanel();
    JPanel eastPane = new JPanel();
    JPanel westPane = new JPanel();

    public PanelPrincipal(){
        setVisible(true);
    }

    /**
     * ELIMINA LOS ELEMENTOS DE UN PANEL
     * @param Panel
     */
    public static void LimpiarPanel(JPanel Panel){
        Panel.removeAll();
        Panel.revalidate();
        Panel.repaint();
    }

    public void IniciarJuego(){
        JLabel title = new JLabel("HOLA");

        setLayout(new BorderLayout());
        add(centerPane, BorderLayout.CENTER);
        add(northPane, BorderLayout.NORTH);
        add(southPane, BorderLayout.SOUTH);
        add(eastPane, BorderLayout.EAST);
        add(westPane, BorderLayout.WEST);


        northPane.add(title);
    }

    public void MostrarReportes(){

    }

    public void IngresarJugador(){
        Usuario jugador1 = new Usuario();
    }

}
