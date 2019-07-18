import java.math.BigDecimal;
import java.text.DecimalFormat;

public class InvestmentCalculator {
    private DecimalFormat df = new DecimalFormat("#.00");


    public String calculateOneYearProfit(BigDecimal startCapital) {
        RangeFinder rangeFinder = new RangeFinder("progi.csv");
        Range properRangeForCapital = rangeFinder.findProperRangeForCapital(startCapital);
        return df.format(startCapital.multiply(BigDecimal.ONE.add(properRangeForCapital.getInterest())));
    }


}
