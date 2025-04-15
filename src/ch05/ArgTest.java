package ch05;

public class ArgTest {
    public static void main(String[] args) {
// String[] args 는 뭘까?
        System.out.println(args.length);
//null은 아닌데, 길이는 0
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
