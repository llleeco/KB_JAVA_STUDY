package practice.sec04.exam1;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay(5000);
        payment.approve();
        payment.cancel("단순 변심");
    }
}

