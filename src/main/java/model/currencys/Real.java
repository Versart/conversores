package model.currencys;

import model.Currency;

public class Real implements Currency {
    @Override
    public String currencyNameAbbreviated() {
        return "BRL";
    }

    @Override
    public String toString() {
        return "Real";
    }
}
