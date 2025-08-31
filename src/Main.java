public class Main {
    public static void main(String[] args) {
        BPI service = new BPI();
        double Height = 1.87;
        double Massa = 98;
        int result = service.calculate(Massa, Height); // должно получиться 500
        System.out.println(result);
    }
}