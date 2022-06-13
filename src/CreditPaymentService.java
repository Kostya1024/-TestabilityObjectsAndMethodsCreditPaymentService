public class CreditPaymentService {
    public long calculate(int creditAmount, double interestRate, int creditTermYear) {
        int creditTermMonth = creditTermYear * 12;
        double annuityPaymentAccurate = creditAmount * ((interestRate / 100 / 12) * Math.pow((1 + (interestRate / 100 / 12)), creditTermMonth)) / (Math.pow((1 + (interestRate / 100 / 12)), creditTermMonth) - 1);
        long annuityPayment = (long) annuityPaymentAccurate;
        return annuityPayment;
    }
}
