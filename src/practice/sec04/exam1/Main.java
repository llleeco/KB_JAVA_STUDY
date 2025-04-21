package practice.sec04.exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Payment[] payments = {
//                new CreditCard(),
//                new KakaoPay(),
//                new KakaoPay(),
//                new CreditCard()
//        };
        Scanner sc = new Scanner(System.in);
//
//        for(int i=0;i<payments.length;i++){
//            System.out.println("["+(i+1)+"번 결제수단] 결제 금액을 입력하세요:");
//            System.out.print(">> ");
//            int amount = Integer.parseInt(sc.nextLine());
//            if(payments[i].pay(amount)){
//                payments[i].approve();
//                payments[i].cancel("테스트 취소");
//            }
//            else{
//                System.out.println("[결제 실패: 승인/취소 건너뜀]");
//            }
//
//            System.out.println();
//
//        }
//        System.out.println("=== 결제 수단 선택 ===");
//        System.out.println("=== 유니페이 결제 시스템 ===");
//        System.out.println("[1] 신용카드");
//        System.out.println("[2] 카카오페이");
//        System.out.print("결제 수단을 선택하세요: ");
//
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        Payment p = null;
//        if(n ==1){
//            p = new CreditCard();
//        }else if(n==2){
//            p = new KakaoPay();
//            System.out.println("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)]");
//
//            if(sc.nextLine().equals("y")){
//                ((KakaoPay) p).authenticate();
//            }
//        }
//
//        if(p.beforePay()){
//            System.out.print("결제 금액을 입력하세요: ");
//            if(p.pay(sc.nextInt())){
//                p.approve();
//                p.cancel("테스트 취소");
//                if (p instanceof KakaoPay) {
//                    ((KakaoPay) p).sendNotification();
//                } else {
//                    System.out.println("[알림 서비스 없음]");
//                }
//            }else{
//                System.out.println("[결제 실패: 승인/취소 건너뜀]");
//            }
//
//        }else{
//            System.out.println("[결제 실패: 준비 단계에서 중단]");
//        }
//

//        assert p != null;
//        if (p.pay(sc.nextInt())) {
//            p.approve();
//            p.cancel("테스트 취소");
//
//            if (p instanceof KakaoPay) {
//               ((KakaoPay) p).sendNotification();
//            } else {
//                System.out.println("[알림 서비스 없음]");
//            }
//        } else {
//            System.out.println("[결제 실패: 승인/취소 건너뜀]");
        //}

        PaymentManager pm = new PaymentManager();
        while (true) {
            System.out.println("=== 유니페이 결제 시스템 ===");
            System.out.println("[1] 신용카드");
            System.out.println("[2] 카카오페이");
            System.out.println("[0] 종료");
            System.out.print("결제 수단을 선택하세요: ");

            int num = sc.nextInt();
            sc.nextLine();

            if (num == 0) {
                pm.printSummary();
                break;
            }
            else if (num == 1) {
                System.out.print("결제 금액을 입력하세요: ");
                pm.process(new CreditCard(), sc.nextInt());
            } else if (num == 2) {
                System.out.println("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)]");
                KakaoPay k = new KakaoPay();
                if (sc.nextLine().equals("y")) {
                    k.authenticate();
                }
                System.out.print("결제 금액을 입력하세요: ");
                pm.process(k, sc.nextInt());

            }

            System.out.println();

        }

    }
}

