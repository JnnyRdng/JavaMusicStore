package products;

import instruments.Instrument;

public class SheetMusic extends Product {

    private String title;
    private String composer;
    private String instrument;

    public SheetMusic(int boughtPrice, int sellPrice, String title, String composer, String instrument) {
        super("sheet music", boughtPrice, sellPrice);
        this.title = title;
        this.composer = composer;
        this.instrument = instrument;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public String getInstrument() {
        return instrument;
    }
}
