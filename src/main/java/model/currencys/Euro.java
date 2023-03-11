package model.currencys;

import model.Currency;

public class Euro implements Currency {

    @Override
    public String currencyNameAbbreviated() {
        return "EUR";
    }

    @Override
    public String toString() {
        return "Euro";
    }
}
