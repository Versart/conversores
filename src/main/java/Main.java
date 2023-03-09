import view.panelscoins.PanelConverterOfCoin;
import view.MainFrame;

public class Main {
    public static void main(String[] args) {


        MainFrame telaPrograma = new MainFrame(3,3,"Conversor");
        telaPrograma.createFrameCoins();
        telaPrograma.setVisible(true);
    }
}