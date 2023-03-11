package model.currencys;

import model.Currency;

public class PoundSterling implements Currency {

    @Override
    public String currencyNameAbbreviated() {
        return "GBP";
    }

    @Override
    public String toString() {
        return "Libra Esterlina";
    }
}
