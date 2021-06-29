package Frontend;

import Backend.Juego.Casillas.Normal;
import Backend.Jugador.Jugador;


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

        centerPane.setLayout(new GridLayout(10,10));
        northPane.add(title);
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
