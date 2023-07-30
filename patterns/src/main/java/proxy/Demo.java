package proxy;

public class Demo {
    public static void main(String[] args) {

        IDataBase dataBase = new DataBaseImpl();  //подключение без прокси
        dataBase.connect();

        IDataBase dataBase2 = new DataBaseProxy(); //подключение через прокси
        dataBase2.connect();
    }

}
