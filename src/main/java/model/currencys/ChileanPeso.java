package model.currencys;

import model.Currency;

import java.util.Objects;

public class ChileanPeso implements Currency {

    private String name = "Peso Chileno";
    @Override
    public String currencyNameAbbreviated() {
        return "CLP";
    }

    @Override
    public String toString() {
        return "Peso Chileno";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChileanPeso that = (ChileanPeso) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
