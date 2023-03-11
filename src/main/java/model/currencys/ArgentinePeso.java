package model.currencys;

import model.Currency;

import java.util.Objects;

public class ArgentinePeso implements Currency {

    private String name = "Peso argentino";
    @Override
    public String currencyNameAbbreviated() {
        return "ARS";
    }

    @Override
    public String toString() {
        return "Peso Argentino";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArgentinePeso that = (ArgentinePeso) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
