package service.temp;

public class ConvertToFahrenheit {

    public static double toFahrenheit(double temp, String typeTemp) {
        if(typeTemp.equals("Celsius")){
            return temp * 1.8 + 32;
        }
        else {
            return temp * 1.8 - 459.67;
        }
    }
}
