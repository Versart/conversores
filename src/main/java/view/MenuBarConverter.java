package view;

import javax.swing.*;
import java.awt.*;

public class MenuBarConverter extends JMenuBar {

    private JMenu converter;
    private JMenuItem jMenuItemCoin;
    private JMenuItem jMenuItemTemp;

    public MenuBarConverter() {
        jMenuItemCoin = new JMenuItem("Conversor de Moeda");
        jMenuItemTemp = new JMenuItem("Conversor de Temperatura");
        converter = new JMenu("☰");
        converter.setFont(new Font(null,SOMEBITS,25));
        converter.add(jMenuItemCoin);
        converter.add(jMenuItemTemp);
        this.add(converter);
       
    }
}
