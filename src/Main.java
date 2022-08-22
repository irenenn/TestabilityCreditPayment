public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99;
        int term = 36;
        int credit = 1_000_000;
        double creditPayment = service.calculate(percent, term, credit);
        String result = String.format("%.0f", creditPayment);
        System.out.println("Ежемесячный платеж = " + result);

    }

}
