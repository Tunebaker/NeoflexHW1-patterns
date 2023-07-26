public class DataBaseImpl implements IDataBase {

    private static final String dataBaseName = "MyDataBase";

    @Override
    public void connect() {
        System.out.println(dataBaseName);
    }
}
