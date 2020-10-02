package instruments;

import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before() {
        piano = new Piano("black", "Yamaha", 400, 450, 88, 3);
    }

//    instrument abstract class tests
    @Test
    public void canGetMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void canChangeColour() {
        piano.paint("white");
        assertEquals("white", piano.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void canGetBoughtPrice() {
        assertEquals(400, piano.getBoughtPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(450, piano.getSellPrice());
    }

    @Test
    public void canSetNewSellPrice() {
        piano.setSellPrice(500);
        assertEquals(500, piano.getSellPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50, piano.calculateMarkup());
    }

//  piano-specific stuff

    @Test
    public void canGetKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canGetPedals() {
        assertEquals(3, piano.getPedals());
    }

    @Test
    public void canPlayThePiano() {
        assertEquals("plinky-plonk", piano.play());
    }

}
