import java.util.Map;

public class ConversionResponse {
    private String result;
    private Map<String, Double> conversion_rates;

    public String getResult() {
        return result;
    }
    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }
}
