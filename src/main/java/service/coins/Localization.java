package service.coins;

public class Localization {


    public  static String  getLocale(String locale){
        if(locale.equals("Dolar")){
            return "USD";
        }
        else if(locale.equals("Euro")){
            return "EUR";
        }
        else if(locale.equals("Libras Esterlinas")){
            return "GBP";
        }
        else if(locale.equals("Peso Argentino")){
            return "ARS";
        }
        else if(locale.equals("Peso Chileno")){
            return "CLP";
        } else if (locale.equals("Real")) {
            return "BRL";
        } else{
            return null;
        }
    }


}
