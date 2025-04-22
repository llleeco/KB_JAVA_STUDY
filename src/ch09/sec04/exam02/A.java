package ch09.sec04.exam02;

public class A {
    void useB(){
        class B{
            int filed1 = 1;

            static int field2 = 2;

            B(){
                System.out.println("B-생성자 실행");
            }
        }
    }
}
