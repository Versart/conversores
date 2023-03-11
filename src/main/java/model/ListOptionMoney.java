package model;

import model.currencys.*;

import java.util.ArrayList;
import java.util.List;

public class ListOptionMoney {

    private List<Currency> conversionMoney;

    public ListOptionMoney() {
        conversionMoney = new ArrayList<>();
        conversionMoney.add(new ArgentinePeso());
        conversionMoney.add(new ChileanPeso());
        conversionMoney.add(new Dolar());
        conversionMoney.add(new Euro());
        conversionMoney.add(new PoundSterling());
        conversionMoney.add(new Real());
    }

    public  List<Currency> getConversionMoney() {
        return this.conversionMoney;
    }
}
