package Frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.FileAlreadyExistsException;

public class VentanaPrincipal extends JFrame {
    public PanelPrincipal Principal = new PanelPrincipal();
    public PanelPrincipal Juego = new PanelPrincipal();
    public PanelPrincipal Reporte = new PanelPrincipal();
    public PanelPrincipal Registro = new PanelPrincipal();

    public JButton regresar = new JButton("Regresar");

    public VentanaPrincipal(){
        setBounds(370,250,600,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(Principal);
        Bienvenida();
        regresar.setVisible(false);
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
        Inicio.setBackground(Color.BLACK);
        Inicio.setForeground(Color.WHITE);

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

        Jugar.setBackground(Color.BLACK);
        Jugar.setForeground(Color.WHITE);

        MostrarReportes.setBackground(Color.BLACK);
        MostrarReportes.setForeground(Color.WHITE);

        IngresarJugadores.setBackground(Color.BLACK);
        IngresarJugadores.setForeground(Color.WHITE);

        Salir.setBackground(Color.BLACK);
        Salir.setForeground(Color.WHITE);

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
                limpiarPanel();
                agregarPanel(Juego);
                Juego.IniciarJuego();
            }
        });

        /*
        EVENTO BOTON MOSTAR REPORTES
         */
        MostrarReportes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                limpiarPanel();
                agregarPanel(Reporte);
                regresar.setVisible(true);
                southPane.add(regresar);
                Reporte.MostrarReportes();

            }
        });

        /*
        EVENTO BOTON INGRESAR JUGADOR
         */
        IngresarJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Registro.IngresarJugador();
            }
        });

    }


    public void limpiarPanel(){
        getContentPane().removeAll();
        SwingUtilities.updateComponentTreeUI(this);
    }

    public void agregarPanel(JPanel Panel){
        getContentPane().add(Panel);
        SwingUtilities.updateComponentTreeUI(this);
    }
}
