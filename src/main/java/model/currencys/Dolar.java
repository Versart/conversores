package model.currencys;

import model.Currency;

import java.util.Objects;

public class Dolar implements Currency {

    private String name = "Dolar";
    @Override
    public String currencyNameAbbreviated() {
        return "USD";
    }

    @Override
    public String toString() {
        return "Dolar";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dolar dolar = (Dolar) o;
        return Objects.equals(name, dolar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
