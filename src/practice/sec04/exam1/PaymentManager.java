package practice.sec04.exam1;

public class PaymentManager {
    
    private int totalCount = 0;
    private int totalAmount = 0;
    private int CreditCardCount = 0;
    private int KakaoPayCount = 0;

    public void process(Payment payment, int amount){
        if(payment.beforePay()) {
            if(payment.pay(amount)){
                totalCount++;
                totalAmount += amount;
                payment.approve();
                payment.cancel("테스트 취소");
                if (payment instanceof KakaoPay) {
                    ((KakaoPay) payment).sendNotification();
                    KakaoPayCount++;
                } else {
                    System.out.println("[알림 서비스 없음]");
                    CreditCardCount++;
                }
            }else{
                System.out.println("결제 실패!");
            }
        }else{
            System.out.println("[결제 실패: 준비 단계에서 중단]");
        }
    }

    public void printSummary(){
        System.out.println("✅ 결제 통계 요약");
        System.out.println("총 결제 횟수: "+totalCount);
        System.out.println("총 결제 금액: "+totalAmount+"원");
        System.out.println("[CreditCard] : "+CreditCardCount+"건");
        System.out.println("[KakaoPay] : "+KakaoPayCount+"건");
    }
}
