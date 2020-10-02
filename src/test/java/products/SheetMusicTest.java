package products;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(200, 899, "Easy Piano Tunes", "Mozart", "piano");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Easy Piano Tunes", sheetMusic.getTitle());
    }

    @Test
    public void canGetComposer() {
        assertEquals("Mozart", sheetMusic.getComposer());
    }

    @Test
    public void canGetInstrument() {
        assertEquals("piano", sheetMusic.getInstrument());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(699, sheetMusic.calculateMarkup());
    }
}
