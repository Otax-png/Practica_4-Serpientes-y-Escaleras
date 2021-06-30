package Frontend;

import Backend.Juego.Casillas.Normal;
import Backend.Juego.Tablero;
import Backend.Jugador.Jugador;
import Backend.Utilities;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel implements Utilities {
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
        JLabel title = new JLabel("SERPIENTES Y ESCALERAS");
        JButton tirarDado = new JButton();


        setLayout(new BorderLayout());
        add(centerPane, BorderLayout.CENTER);
        add(northPane, BorderLayout.NORTH);
        add(southPane, BorderLayout.SOUTH);
        add(eastPane, BorderLayout.EAST);
        add(westPane, BorderLayout.WEST);

        eastPane.setLayout(new BorderLayout());


        centerPane.setLayout(new GridLayout(10,10));
        JLabel infoText = new JLabel();
        eastPane.add(infoText);


        northPane.add(title);
        for (int i = juego.casillas.length - 1; i >= 0; i--) {
            centerPane.add(juego.casillas[i]);
        }
        southPane.setLayout(new GridLayout(1,1));
        tirarDado.setText("Tirar Dado");
        southPane.add(tirarDado);

        tirarDado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int aux = 5;
                int random = generarRandom(6,1);

                infoText.setText( "Te has movido " + random + " Casillas");
                juego.moverJugador(random);


                SwingUtilities.updateComponentTreeUI(centerPane);
            }
        });
    }

    public void MostrarReportes(){
        JTable listaJugadores = new JTable();

    }

    public void IngresarJugador(){
        JFrame f = new JFrame();

        String nombre;
        String apellido;

        nombre = JOptionPane.showInputDialog("Ingresa Tu nombre");
        apellido = JOptionPane.showInputDialog("Ingresa Tu Apellido");

        JOptionPane.showMessageDialog(f,"Hola " + nombre  + " " + apellido );



    }

}