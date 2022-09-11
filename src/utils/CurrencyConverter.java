package utils;

public class CurrencyConverter {
    private static final Double IOF = 1.06;

    public static Double convertDollarToReal(Double dollarsToBuy, Double dollarPrice) {
        return dollarPrice * dollarsToBuy * IOF;
    }

}
