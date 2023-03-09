package view.panelstemp;

import model.ListOptionTemp;
import service.temp.ConvertToCelsius;
import service.temp.ConvertToFahrenheit;
import service.temp.ConvertToKelvin;
import view.PanelOptions;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
public class PanelTemp extends JPanel implements ChangeListener {

    private JLabel jLabel = new JLabel();

    private JSlider jSlider = new JSlider(-100,1000,50);

    private JComboBox optionsConversionFrom;

    private JComboBox optionsConversionTo;
    private PanelOptions panelOptions;

    private JButton buttonTo;
    private boolean active;

    private JLabel labelTemp;



    public PanelTemp() {

        this.setBackground(new Color(0xD3D3D1));
        this.setLayout(new GridLayout(5,1,0,20));
        List<String> inverted = new ListOptionTemp().getConversionTemp();
        Collections.reverse(inverted);
        panelOptions = new PanelOptions();
        labelTemp = new JLabel();
        labelTemp.setFont(new Font(null,Font.PLAIN,25));
        jSlider.addChangeListener(this);
        optionsConversionFrom = new JComboBox<>(new ListOptionTemp().getConversionTemp().toArray());
        optionsConversionTo = new JComboBox<>( inverted.toArray());
        buttonTo = new JButton();
        buttonTo.setText("⇆");
        buttonTo.setFont(new Font(null,SOMEBITS,30));
        buttonTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItemFrom = optionsConversionFrom.getSelectedItem().toString();
                String selectedItemTo = optionsConversionTo.getSelectedItem().toString();
                optionsConversionFrom.setSelectedItem(selectedItemTo);
                optionsConversionTo.setSelectedItem(selectedItemFrom);
            }
        });
        panelOptions.add(optionsConversionFrom);
        panelOptions.add(buttonTo);
        panelOptions.add(optionsConversionTo);
        jLabel.setText("Temperatura");
        this.add(panelOptions);
        this.add(jSlider);
        this.add(jLabel);
        this.add(labelTemp);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        double resultConversion;
        if(optionsConversionTo.getSelectedItem().toString().equals("Celsius")){
           resultConversion = ConvertToCelsius.toCelsius(jSlider.getValue(),optionsConversionFrom.getSelectedItem().toString());
        }
        else if(optionsConversionTo.getSelectedItem().toString().equals("Kelvin")){
            resultConversion = ConvertToKelvin.toKelvin(jSlider.getValue(), optionsConversionFrom.getSelectedItem().toString());
        }
        else {
           resultConversion = ConvertToFahrenheit.toFahrenheit(jSlider.getValue(), optionsConversionFrom.getSelectedItem().toString());
        }
        labelTemp.setText(jSlider.getValue() +" " + optionsConversionFrom.getSelectedItem().toString()
                + " = " + resultConversion + optionsConversionTo.getSelectedItem().toString());
    }
}
