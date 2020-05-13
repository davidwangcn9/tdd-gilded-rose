package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.product.Sulfuras;
import org.junit.Assert;
import org.junit.Test;

public class SulfurasTest {
    @Test
    public void getQuality_givenNoMatterHowLongItTakes_qualityStaySame() {
        Sulfuras sulfuras = new Sulfuras(50, 30);
        Assert.assertEquals(30, sulfuras.getQuality());
        sulfuras.increaseStay();
        Assert.assertEquals(30, sulfuras.getQuality());
    }
}
