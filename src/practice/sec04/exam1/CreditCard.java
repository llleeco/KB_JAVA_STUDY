package practice.sec04.exam1;

public class CreditCard implements Payment{
    private int amount;
    @Override
    public void pay(int amount) {
        this.amount = amount;
        System.out.println("[신용카드] "+amount+"원 결제 완료");
    }

    @Override
    public void approve() {
        System.out.println("[신용카드] 카드 승인 완료");
    }

    @Override
    public void cancel(String reason) {
        System.out.println("[신용카드] "+amount+"원 결제 취소 - 사유: "+reason);
    }
}
