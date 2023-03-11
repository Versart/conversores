package service.coins;

import model.Currency;

public class Localization {


    public  static String  getLocale(Currency currency){
        return currency.currencyName();
    }


}
