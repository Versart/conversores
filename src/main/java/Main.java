import view.PanelConverterOfCoin;
import view.MainFrameOfCoins;

public class Main {
    public static void main(String[] args) {


        MainFrameOfCoins telaPrograma = new MainFrameOfCoins(3,3,"Conversor");
        telaPrograma.addInPosition(2,2,new PanelConverterOfCoin());
        telaPrograma.setVisible(true);
    }
}