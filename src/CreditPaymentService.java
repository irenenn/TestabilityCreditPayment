public class CreditPaymentService {

    public double calculate(double percent, int term, int credit) {
        double i = percent / 12 / 100;
        //i - месячная процентная ставка
        double coefficient = i * (Math.pow((1 + i), term)) / ((Math.pow((1 + i), term)) - 1);
        double creditPayment = coefficient * credit;

        return creditPayment;

    }
}
