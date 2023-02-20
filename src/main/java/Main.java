import javax.swing.*;
import java.awt.*;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {


        TelaPrograma telaPrograma = new TelaPrograma(3,3,"Conversor");
        telaPrograma.addInPosition(2,2,new PanelButtonConvert());
        telaPrograma.setVisible(true);

    }
}