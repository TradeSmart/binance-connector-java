package examples.spot.cryptoloans;

import java.util.LinkedHashMap;

import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class LoanIncome {
    private LoanIncome() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "BNB");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().loanIncome(parameters);
        System.out.println(result);
    }
}
