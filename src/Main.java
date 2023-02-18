import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        TelaPrograma telaPrograma = new TelaPrograma(3,3,"Conversor de Moeda");
        telaPrograma.addInPosition(2,2,new PanelButtonConvert());
        telaPrograma.setVisible(true);
    }
}