package Frontend;

import javax.swing.*;

public class PanelPrincipal extends JPanel {

    public PanelPrincipal(){
        setVisible(true);
    }

    public static void LimpiarPanel(JPanel Panel){
        Panel.removeAll();
        Panel.revalidate();
        Panel.repaint();
    }

    

}
