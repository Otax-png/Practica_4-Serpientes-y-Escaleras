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

        Inicio.setText("Iniciar Partida");

        Inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PanelPrincipal.LimpiarPanel(Principal);
                MenuInicio();
            }
        });
    }


    public void MenuInicio(){
        setBounds(250,150,900,500);
        Principal.setLayout(new BorderLayout());

        JLabel welcomeText = new JLabel("Hola");
        Principal.add(welcomeText,BorderLayout.NORTH);
    }



}
