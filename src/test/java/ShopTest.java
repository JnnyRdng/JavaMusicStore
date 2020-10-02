import behaviours.ISell;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import products.Product;
import products.SheetMusic;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private Piano piano;
    private SheetMusic sheetMusic;
    private Product plectrum;

    @Before
    public void before() {
        piano = new Piano("black", "Yamaha", 40000, 56000, 88, 3);
        sheetMusic = new SheetMusic(200, 699, "6/9 Freeform Jazz for Beginners", "Bach", "piano");
        plectrum = new Product("plectrum", 10, 100);
        shop = new Shop("Ray's Musical Emporium of Wonders", 100000);
    }

    @Test
    public void canGetNameOfShop() {
        assertEquals("Ray's Musical Emporium of Wonders", shop.getName());
    }

    @Test
    public void canGetTillValue() {
        assertEquals(100000, shop.getTill());
    }

    @Test
    public void canAddToTill() {
        shop.useTill(10000);
        assertEquals(110000, shop.getTill());
    }

    @Test
    public void canRemoveFromTill() {
        shop.useTill(-50000);
        assertEquals(50000, shop.getTill());
    }

    @Test
    public void canGetStock() {
        assertEquals(0, shop.getStock().size());
        assertEquals(new ArrayList<ISell>(), shop.getStock());
    }

    @Test
    public void canAddStock() {
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        assertTrue(shop.removeStock(piano));
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canNotRemoveStockShopDoesNotHave() {
        shop.addStock(sheetMusic);
        assertFalse(shop.removeStock(piano));
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canAffordItem() {
        assertTrue(shop.canAfford(piano));
    }

    @Test
    public void canNotAffordItem() {
        shop = new Shop("cheap music shop", 10);
        assertFalse(shop.canAfford(piano));
    }

    @Test
    public void shopCanBuyItem() {
        shop.buy(piano);
        assertEquals(1, shop.getStock().size());
        assertEquals(piano, shop.getStock().get(0));
        assertEquals(60000, shop.getTill());
    }

    @Test
    public void shopCanSellItem() {
        shop.buy(piano);
        shop.sell(piano);
        assertEquals(0, shop.getStock().size());
        assertEquals(116000, shop.getTill());
    }

    @Test
    public void canCalculatePotentialProfitOnAllStock() {
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        shop.addStock(plectrum);
        assertEquals(16589, shop.potentialProfit());
    }
}
