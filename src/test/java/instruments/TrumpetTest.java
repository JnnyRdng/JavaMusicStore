package instruments;

import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("gold", "Yamaha", 200, 300);
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void canPlayTrumpet() {
        assertEquals("parrrrp", trumpet.play());
    }
}
