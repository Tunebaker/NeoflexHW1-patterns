package adapter;

public class MemoryCard {
    private final String someData;

    public MemoryCard(String someData) {
        this.someData = someData;
    }

    public String getData(){
        return "Data on this memory card is: " + someData;
    }
}
