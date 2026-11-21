package ExFix;

public class Dollar {
    private double dollar;
    public static final double tax = 6.0;

   public Dollar(double dollar){
    this.dollar = dollar;
   }
   public double getDollar(double dollar){
    return this.dollar;
   }

    public double CurrencyConverter(double money){
        return money * this.dollar * (1 + this.tax / 100 );
    }

}
