package ch07.sec03.exam02;



public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone  myPhone = new SmartPhone("갤럭시", "은색");

//        model과 color는 부모클래스인 Phone에서 상속받음
        System.out.println("모델: "+myPhone.model);
        System.out.printf("색상: "+myPhone.color);
    }
}
