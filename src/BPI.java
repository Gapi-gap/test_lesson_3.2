public class BPI {
    int calculate(double massa, double height){
        double bpi =  massa/(height*height);
        int result = (int)bpi;
        return (int)result;
    }
}
