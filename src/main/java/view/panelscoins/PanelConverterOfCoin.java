package view.panelscoins;

import model.Currency;
import service.coins.ConvertValue;
import model.ListOptionMoney;
import service.coins.Localization;
import view.PanelOptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PanelConverterOfCoin extends JPanel implements ActionListener {

    private JButton buttonToConvert;

    private JLabel jLabel;

    private JTextField inputValue;

    private JLabel conversionResult;

    private JComboBox optionsConversionFrom;

    private JComboBox optionsConversionTo;

    private JButton buttonTo;

    private List<String> options;

    private boolean active;
    public PanelConverterOfCoin(){
        this.setBackground(new Color(0xD3D3D1));
        this.setLayout(new GridLayout(5,1,0,20));
        List<Currency> inverted = new ListOptionMoney().getConversionMoney();
        Collections.reverse(inverted);
        optionsConversionFrom = new JComboBox<>(new ListOptionMoney().getConversionMoney().toArray());
        optionsConversionTo = new JComboBox<>(new ListOptionMoney().getConversionMoney().toArray());
        buttonTo = new JButton();
        buttonTo.setText("⇆");
        buttonTo.setFont(new Font(null,SOMEBITS,30));
        buttonTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                optionsConversionFrom.setSelectedItem((Currency)optionsConversionTo.getSelectedItem());
                optionsConversionTo.setSelectedItem((Currency)optionsConversionFrom.getSelectedItem());
            }
        });
        PanelOptions panelOptions = new PanelOptions();
        panelOptions.add(optionsConversionFrom);
        panelOptions.add(buttonTo);
        panelOptions.add(optionsConversionTo);
        buttonToConvert = new JButton();
        buttonToConvert.addActionListener(this);
        inputValue = new JTextField(10);
        jLabel = new JLabel("Digite o valor:");
        conversionResult = new JLabel();
        conversionResult.setFont(new Font(null,SOMEBITS,20));
        conversionResult.setVisible(false);
        buttonToConvert.setText("Converter");
        this.add(panelOptions);
        this.add(jLabel);
        this.add(inputValue);
        this.add(buttonToConvert);
        this.add(conversionResult);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(inputValue.getText().trim().length() > 0){
            try {
                String input = inputValue.getText();
                BigDecimal valor = new BigDecimal(input);
                String valueFrom = Localization.getLocale((Currency) optionsConversionFrom.getSelectedItem());
                String valueTo = Localization.getLocale((Currency) optionsConversionTo.getSelectedItem());

                this.conversionResult.setText("O valor convertido é: " + new ConvertValue().convertValue(valor,valueFrom,valueTo));
                this.conversionResult.setVisible(true);
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Digite um número válido",
                        "Valor inválido",JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Nenhum valor no input",
                    "Sem valor",JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
