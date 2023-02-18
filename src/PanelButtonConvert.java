import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class PanelButtonConvert extends JPanel implements ActionListener {

    private JButton buttonToConvert;

    private JLabel jLabel;

    private JTextField inputValue;

    private JLabel conversionResult;


    public PanelButtonConvert(){
        this.setBackground(new Color(0x17D781));
        buttonToConvert = new JButton();
        buttonToConvert.addActionListener(this);
        inputValue = new JTextField(20);
        inputValue.setSize(50,30);
        jLabel = new JLabel("Digite o valor:");
        conversionResult = new JLabel();
        conversionResult.setVisible(false);
        buttonToConvert.setText("Converter");
        buttonToConvert.setBackground(new Color(0,0,0));
        buttonToConvert.setForeground(new Color(255,255,255));
        buttonToConvert.setSize(300,300);
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
                this.conversionResult.setText("O valor é:" + valor);
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
}
