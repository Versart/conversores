package model.currencys;

import model.Currency;

public class Real implements Currency {
    @Override
    public String currencyName() {
        return "BRL";
    }
}
