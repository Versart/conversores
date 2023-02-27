package service;

import com.google.gson.Gson;
import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public  class  ConvertValue {

    private  String urlAPI = "https://economia.awesomeapi.com.br/last/";

    /*public static MonetaryAmount convertValue(BigDecimal value,Locale locale){
        ExchangeRateProvider imfProvider = MonetaryConversions.getExchangeRateProvider("IMF");
        CurrencyUnit originalValue = Monetary.getCurrency("BRL");
        CurrencyUnit currencyUnit = Monetary.getCurrency(locale);
        CurrencyConversion imfConvertion = imfProvider.getCurrencyConversion(currencyUnit);


        MonetaryAmount money = Money.of(value, originalValue);
        return   money.with(imfConvertion);
    }*/

//    public static MonetaryAmount convertValue(BigDecimal value, String locale) {
//        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider("IMF");
//        CurrencyUnit originalValue = Monetary.getCurrency("BRL");
//        CurrencyUnit currencyUnit = Monetary.getCurrency(locale);
//        CurrencyConversion conversion = provider.getCurrencyConversion(currencyUnit);
//
//
//        MonetaryAmount money = FastMoney.of(value, originalValue);
//        return   money.with(conversion);
//    }

    public  MonetaryAmount convertValue(BigDecimal value, String localeFrom, String localeTo) {
        if (!localeFrom.equals(localeTo)) {
            HttpClient httpClient = HttpClient.newHttpClient();
            urlAPI += localeFrom + "-";
            urlAPI += localeTo;
            URI uri = URI.create(urlAPI);
            HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
            try {
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                String body = response.body();
                body = body.substring(10, body.length() - 1);
                Gson gson = new Gson();
                Value valueResult = gson.fromJson(body, Value.class);
                value = new BigDecimal(valueResult.getBid());
                CurrencyUnit currencyUnit = Monetary.getCurrency(localeTo);
                return Money.of(value, currencyUnit);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            CurrencyUnit currencyUnit = Monetary.getCurrency(localeTo);
            return Money.of(value, currencyUnit);
        }
    }

}
