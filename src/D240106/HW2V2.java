package D240106;

public class HW2V2 {
    public static void main(String[] args) {

        HW2V2Fuelling fuelling = new HW2V2Fuelling();

        fuelling.fuelType();

        fuelling.fuelling();

        HW2V2Payment payment = new HW2V2Payment();

        payment.payment(fuelling);
    }
}