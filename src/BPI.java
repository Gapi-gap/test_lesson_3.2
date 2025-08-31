public class BPI {
    int calculate(double massa, double height) {
        double Bpi = massa / (height * height);
        int Result = (int) Bpi;
        return (int) Result;
    }
}
