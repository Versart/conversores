package model.currencys;

import model.Currency;

import java.util.Objects;

public class Real implements Currency {

    private String name = "Real";
    @Override
    public String currencyNameAbbreviated() {
        return "BRL";
    }

    @Override
    public String toString() {
        return "Real";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Real real = (Real) o;
        return Objects.equals(name, real.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
