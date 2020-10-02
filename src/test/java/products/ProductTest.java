package products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Product product;

    @Before
    public void before() {
        product = new Product("plectrum", 20, 100);
    }

    @Test
    public void canGetDescription() {
        assertEquals("plectrum", product.getDescription());
    }

    @Test
    public void canGetBoughtPrice() {
        assertEquals(20, product.getBoughtPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(100, product.getSellPrice());
    }

    @Test
    public void canSetDescription() {
        product.setDescription("drum sticks");
        assertEquals("drum sticks", product.getDescription());
    }

    @Test
    public void canSetSellPrice() {
        product.setSellPrice(500);
        assertEquals(500, product.getSellPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(80, product.calculateMarkup());
    }
}
