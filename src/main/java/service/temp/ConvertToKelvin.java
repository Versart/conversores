package service.temp;

public class ConvertToKelvin {

    public static double toKelvin(double temp, String typeTemp){
        if(typeTemp.equals("Celsius")){
            return temp + 273.15;
        }
        else {
            return (temp - 32) / 1.8 + 273.15;
        }
    }
}
