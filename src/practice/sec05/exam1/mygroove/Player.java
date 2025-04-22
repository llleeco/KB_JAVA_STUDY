package practice.sec05.exam1.mygroove;

public class Player {

    public void logTitle(String title) {

        class Logger {
            String title;  // ❗ title이 가려짐

            public void print() {
                System.out.println("제목: " + title);
            }
            Logger(String title){
                this.title = title;
            }

        }

        Logger logger = new Logger(title);
        logger.print();
    }

    public static void main(String[] args) {
        new Player().logTitle("사건의 지평선");
    }
}
