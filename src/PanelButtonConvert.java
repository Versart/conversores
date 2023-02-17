import javax.swing.*;
import java.awt.*;

public class PanelButtonConvert extends JPanel{

    private JButton buttonToConvert;

    private JLabel jLabel;

    private JTextField inputValue;


    public PanelButtonConvert(){
        this.setBackground(new Color(0x242475));
        buttonToConvert = new JButton();
        inputValue = new JTextField(20);
        inputValue.setSize(50,30);
        jLabel = new JLabel("Digite o valor!");
        buttonToConvert.setText("Converter");
        buttonToConvert.setBackground(new Color(0,0,0));
        buttonToConvert.setForeground(new Color(255,255,255));
        this.add(jLabel);
        this.add(inputValue);
        this.add(buttonToConvert);

    }




}
