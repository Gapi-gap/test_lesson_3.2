public class Main {
    public static void main(String[] args) {
        BPI service = new BPI();
        double height = 1.87;
        double massa = 98;
        int result = service.calculate(massa, height); // должно получиться 500
        System.out.println(result);
    }
}