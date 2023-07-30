package adapter;

public class AdapterFromComputerToMemoryCard {

    private final MemoryCard memoryCard;

    public AdapterFromComputerToMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    public String readFromMemoryCard() {
        return memoryCard.getData();
    }
}
