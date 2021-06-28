package Frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    public PanelPrincipal Principal = new PanelPrincipal();

    public VentanaPrincipal(){
        setBounds(370,250,600,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(Principal);
        Bienvenida();

    }

    public void Bienvenida(){
        JPanel northPane = new JPanel();
        JPanel centerPane = new JPanel();
        JPanel southPane = new JPanel();
        Principal.setLayout(new BorderLayout());

        Principal.add(northPane,BorderLayout.NORTH);
        Principal.add(centerPane,BorderLayout.CENTER);
        Principal.add(southPane, BorderLayout.SOUTH);

        JLabel welcomeText = new JLabel();
        JLabel gameText = new JLabel();
        JButton Inicio = new JButton();

        northPane.add(welcomeText, BorderLayout.NORTH);
        centerPane.add(gameText, BorderLayout.CENTER);
        southPane.add(Inicio, BorderLayout.SOUTH);

        welcomeText.setText("BIENVENIDO");

        gameText.setText("SERPIENTES Y ESCALERAS");

        Inicio.setText("Comenzar");

        Inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PanelPrincipal.LimpiarPanel(Principal);
                MenuInicio();
            }
        });
    }

    public void MenuInicio(){
        JButton Jugar = new JButton("Jugar");
        JButton MostrarReportes = new JButton("Mostrar Reportes");
        JButton IngresarJugadores = new JButton(" Ingresar Jugadores");
        JButton Salir = new JButton("Salir");

        JPanel northPane = new JPanel();
        JPanel centerPane = new JPanel();
        JPanel southPane = new JPanel();
        JPanel eastPane = new JPanel();
        JPanel westPane = new JPanel();

        setBounds(250,150,900,500);
        Principal.setLayout(new BorderLayout());
        Principal.add(northPane,BorderLayout.NORTH);
        Principal.add(centerPane,BorderLayout.CENTER);
        Principal.add(southPane, BorderLayout.SOUTH);
        Principal.add(eastPane, BorderLayout.EAST);
        Principal.add(westPane, BorderLayout.WEST);
        westPane.setLayout(new GridLayout(4,1));

        northPane.add(new JLabel("Serpientes y Escaleras"));

        westPane.add(Jugar);
        westPane.add(MostrarReportes);
        westPane.add(IngresarJugadores);
        westPane.add(Salir);
        /*
        EVENTO BOTON SALIR
         */
        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f,"              Adios");
                System.exit(0);
            }
        });

        /*
        EVENTO BOTON JUGAR
         */
        Jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PanelPrincipal.LimpiarPanel(Principal);
                Principal.IniciarJuego();
            }
        });

        /*
        EVENTO BOTON MOSTAR REPORTES
         */
        MostrarReportes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PanelPrincipal.LimpiarPanel(Principal);
            }
        });

        /*
        EVENTO BOTON INGRESAR JUGADOR
         */
        IngresarJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PanelPrincipal.LimpiarPanel(Principal);
            }
        });

    }

}
