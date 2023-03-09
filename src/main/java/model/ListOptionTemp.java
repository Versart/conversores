package model;

import java.util.ArrayList;
import java.util.List;

public class ListOptionTemp {


    private List<String> conversionTemp;

    public ListOptionTemp() {
        conversionTemp = new ArrayList<>();
        conversionTemp.add("Celsius");
        conversionTemp.add("Fahrenheit");
        conversionTemp.add("Kelvin");
    }

    public List<String> getConversionTemp(){
        return this.conversionTemp;
    }
}
