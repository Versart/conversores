package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public JMenu getConverter() {
        return converter;
    }

    public void setConverter(JMenu converter) {
        this.converter = converter;
    }

    public JMenuItem getjMenuItemCoin() {
        return jMenuItemCoin;
    }

    public void setjMenuItemCoin(JMenuItem jMenuItemCoin) {
        this.jMenuItemCoin = jMenuItemCoin;
    }

    public JMenuItem getjMenuItemTemp() {
        return jMenuItemTemp;
    }

    public void setjMenuItemTemp(JMenuItem jMenuItemTemp) {
        this.jMenuItemTemp = jMenuItemTemp;
    }
}
