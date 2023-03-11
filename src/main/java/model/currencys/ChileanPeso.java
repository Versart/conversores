package model.currencys;

import model.Currency;

public class ChileanPeso implements Currency {

    @Override
    public String currencyNameAbbreviated() {
        return "CLP";
    }

    @Override
    public String toString() {
        return "Peso Chileno";
    }
}
