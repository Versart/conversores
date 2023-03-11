package model.currencys;

import model.Currency;

public class Dolar implements Currency {

    @Override
    public String currencyName() {
        return "USD";
    }
}
