public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        long annuityPayment1 = service.calculate(1_000_000, 9.99, 1);
        System.out.println("ОР 87991; ФР " + annuityPayment1);
        long annuityPayment2 = service.calculate(1_000_000, 9.99, 2);
        System.out.println("ОР 46140; ФР " + annuityPayment2);
        long annuityPayment3 = service.calculate(1_000_000, 9.99, 3);
        System.out.println("ОР 32262; ФР " + annuityPayment3);
    }
}
