package instruments;

public class Drumkit extends Instrument {

    private int numDrums;
    private int numCymbals;

    public Drumkit(String colour, String brand, int boughtPrice, int sellPrice, int numDrums, int numCymbals) {
        super("wood", colour, "percussion", brand, boughtPrice, sellPrice);
        this.numDrums = numDrums;
        this.numCymbals = numCymbals;
    }

    public int getNumDrums() {
        return numDrums;
    }

    public int getNumCymbals() {
        return numCymbals;
    }

    public String play() {
        return "ba-dum-tisch";
    }
}
