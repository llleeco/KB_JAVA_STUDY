package practice.sec04.exam1;

public interface Payment {
    void pay(int amount);
    void approve();
    void cancel(String reason);
}
