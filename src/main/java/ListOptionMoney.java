import java.util.ArrayList;
import java.util.List;

public class ListOptionMoney {

    private List<String> conversionMoney;

    public ListOptionMoney() {
        conversionMoney = new ArrayList<>();
        conversionMoney.add("Dolar");
        conversionMoney.add("Euro");
        conversionMoney.add("Libras Esterlinas");
        conversionMoney.add("Peso Argentino");
        conversionMoney.add("Peso Chileno");
    }

    public  List<String> getConversiosMoney() {
        return this.conversionMoney;
    }
}
