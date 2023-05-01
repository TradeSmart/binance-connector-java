package examples.spot.margin;

import java.util.LinkedHashMap;

import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class GetIsolatedTransfer {
    private GetIsolatedTransfer() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol", "BNBUSDT");

        String result = client.createMargin().getIsolatedTransfer(parameters);
        System.out.println(result);
    }
}
