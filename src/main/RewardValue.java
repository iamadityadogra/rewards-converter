public class RewardValue{

    private double miles;
    private double cash;
    public static final double RATE = 0.0035;
    public RewardValue(double valInMiles)
    {
        this.miles = valInMiles;
    }

    public RewardValue(double valInCash)
    {
        this.cash = valInCash;
    }

    //convert miles to cash
    //1 mile = $0.0035
    public double getCashValue()
    {
        int cashVal = (miles * RATE);
        return cashVal;
    }

    //convert cash to miles
    public double getMilesValue()
    {
        int milesVal = (cash)/RATE;
        return milesVal;
    }
}