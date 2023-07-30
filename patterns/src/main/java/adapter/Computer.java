package adapter;

public class Computer {
    public void readFromUsbConnection(AdapterFromComputerToMemoryCard adapter){
        System.out.println("reading data by: " + adapter.getClass());
        System.out.println(adapter.readFromMemoryCard());
    }
}
