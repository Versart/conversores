package model.currencys;

import model.Currency;

import java.util.Objects;

public class PoundSterling implements Currency {

    private String name = "Libra Esterlina";
    @Override
    public String currencyNameAbbreviated() {
        return "GBP";
    }

    @Override
    public String toString() {
        return "Libra Esterlina";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoundSterling that = (PoundSterling) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
