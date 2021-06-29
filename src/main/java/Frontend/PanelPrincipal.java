package Frontend;

import Backend.Juego.Casillas.Normal;
import Backend.Juego.Tablero;
import Backend.Jugador.Jugador;


import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    Tablero juego;
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
        int contador = 0;

        juego = new Tablero(10,10);
        JLabel title = new JLabel("HOLA");

        setLayout(new BorderLayout());
        add(centerPane, BorderLayout.CENTER);
        add(northPane, BorderLayout.NORTH);
        add(southPane, BorderLayout.SOUTH);
        add(eastPane, BorderLayout.EAST);
        add(westPane, BorderLayout.WEST);

        centerPane.setLayout(new GridLayout(10,10));
        northPane.add(title);

        for (int i = juego.casillas.length - 1; i >= 0; i--) {
            centerPane.add(juego.casillas[i]);
        }
    }

    public void MostrarReportes(){
        JTable listaJugadores = new JTable();

    }

    public void IngresarJugador(){
        JFrame f = new JFrame();

        int id = 0;
        String nombre;
        String apellido;

        nombre = JOptionPane.showInputDialog("Ingresa Tu nombre");
        apellido = JOptionPane.showInputDialog("Ingresa Tu Apellido");

        JOptionPane.showMessageDialog(f,"Hola " + nombre  + " " + apellido );


    }

}
