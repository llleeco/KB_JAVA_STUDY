package practice.sec02;

public class Database {
    private String connection ="MySQL";

    private static Database db = new Database();

    private Database(){}

    public static Database getInstance(){
        return db;
    }

    public String connect(){
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close(){
        System.out.println(connection+"을 닫습니다.");
    }

}
