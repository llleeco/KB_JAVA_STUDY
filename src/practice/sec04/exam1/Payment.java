package practice.sec04.exam1;

public interface Payment {
    //    void pay(int amount);
//    void approve();
//    void cancel(String reason);
    default boolean beforePay() {
        System.out.println("[공통] 결제를 준비합니다...");
        return true;
    }

    boolean pay(int amount);      // 결제: 성공 여부 반환

    void approve();               // 승인

    void cancel(String reason);   // 취소

    static void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
