package proxy;

public class DataBaseProxy implements IDataBase {
    private static final String URL_PREFIX = "localhost:port/";
    private static final DataBaseImpl dataBase = new DataBaseImpl();

    public void connect() {
        System.out.print("подключено " + URL_PREFIX);
        dataBase.connect();
    }
}
