import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;


public class PanelButtonConvert extends JPanel implements ActionListener {

    private JButton buttonToConvert;

    private JLabel jLabel;

    private JTextField inputValue;

    private JLabel conversionResult;

    private JComboBox optionsConversion;

    private List<String> options;
    public PanelButtonConvert(){
        this.setBackground(new Color(0x17D781));
        this.setLayout(new GridLayout(5,1,0,20));
        optionsConversion = new JComboBox<>(new ListOptionMoney().getConversiosMoney().toArray());
        buttonToConvert = new JButton();
        buttonToConvert.addActionListener(this);
        inputValue = new JTextField(10);
        jLabel = new JLabel("Digite o valor:");
        conversionResult = new JLabel();
        conversionResult.setVisible(false);
        buttonToConvert.setText("Converter");
        buttonToConvert.setBackground(new Color(0,0,0));
        buttonToConvert.setForeground(new Color(255,255,255));
        this.add(optionsConversion);
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
                String local = Localization.getLocale(optionsConversion.getSelectedItem().toString());
                this.conversionResult.setText("O valor convertido é: " + new ConvertValue().convertValue(valor,local));
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
