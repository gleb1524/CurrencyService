package ru.gkaraban.currency.service.service;

public interface OpenExchangeRatesService {

    Double getLatestCurrencyRate(String selectedCurrency, String basicCurrency);

    Double getYesterdayCurrencyRate(String selectedCurrency, String basicCurrency);
}
