package model.currencys;

import model.Currency;

public class ArgentinePeso implements Currency {

    @Override
    public String currencyNameAbbreviated() {
        return "ARS";
    }

    @Override
    public String toString() {
        return "Peso Argentino";
    }
}
