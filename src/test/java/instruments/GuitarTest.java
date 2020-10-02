package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, true, "red", "Fender", 180, 250);
    }

    @Test
    public void canGetType() {
        assertEquals("stringed", guitar.getType());
    }
    @Test
    public void canGetStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canGetIfElectric() {
        assertTrue(guitar.isElectric());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("twaaang", guitar.play());
    }
}

