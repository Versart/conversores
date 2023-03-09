package service.temp;

public class ConvertToCelsius {


    public static double toCelsius(double temp, String typeTemp) {
        if(typeTemp.equals("Kelvin")){
            return temp - 273.15;
        }
        else {
            return (temp - 32) * 5 / 9;
        }
    }
}
