package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.product.AgedBrie;
import org.junit.Assert;
import org.junit.Test;

public class AgedBrieTest {
    @Test
    public void getQuality_givenKeepLonger_qualityRise() {
        AgedBrie agedBrie = new AgedBrie(5, 30);
        Assert.assertEquals(35, agedBrie.getQuality());
        agedBrie.increaseStay();
        Assert.assertEquals(36, agedBrie.getQuality());
        agedBrie.increaseStay();
        Assert.assertEquals(37, agedBrie.getQuality());
    }

    @Test
    public void getQuality_givenKeepLongerEnough_qualityWillNeverMoreThan50() {
        AgedBrie agedBrie = new AgedBrie(50, 30);
        Assert.assertEquals(50, agedBrie.getQuality());
    }
}
