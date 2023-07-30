package adapter;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard("some data on the memory card");
        AdapterFromComputerToMemoryCard adapter = new AdapterFromComputerToMemoryCard(memoryCard);
        computer.readFromUsbConnection(adapter);
    }
}
