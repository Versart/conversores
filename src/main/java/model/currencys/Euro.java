package model.currencys;

import model.Currency;

public class Euro implements Currency {

    @Override
    public String currencyName() {
        return "EUR";
    }
}
