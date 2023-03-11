package model.currencys;

import model.Currency;

public class Dolar implements Currency {

    @Override
    public String currencyNameAbbreviated() {
        return "USD";
    }

    @Override
    public String toString() {
        return "Dolar";
    }
}
