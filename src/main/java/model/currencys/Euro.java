package model.currencys;

import model.Currency;

import java.util.Objects;

public class Euro implements Currency {

    private String name = "Euro";
    @Override
    public String currencyNameAbbreviated() {
        return "EUR";
    }

    @Override
    public String toString() {
        return "Euro";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return Objects.equals(name, euro.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
