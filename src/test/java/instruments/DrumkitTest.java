package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumkitTest {

    private Drumkit drumkit;

    @Before
    public void before() {
        drumkit = new Drumkit("blue", "Zildjian", 300, 450, 6, 4);
    }

    @Test
    public void canGetType() {
        assertEquals("percussion", drumkit.getType());
    }

    @Test
    public void canGetNumberOfDrumsInKit() {
        assertEquals(6, drumkit.getNumDrums());
    }

    @Test
    public void canGetNumberOfCymbalsInKit() {
        assertEquals(4, drumkit.getNumCymbals());
    }

    @Test
    public void canPlayDrumkit() {
        assertEquals("ba-dum-tisch", drumkit.play());
    }
}
