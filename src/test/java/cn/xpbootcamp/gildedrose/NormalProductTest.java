package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.product.NormalProduct;
import org.junit.Assert;
import org.junit.Test;

public class NormalProductTest {
    @Test
    public void getQuality_givenProductApproachingSellInDay_qualityShouldDrop() {
        NormalProduct normalProduct = new NormalProduct("normalProduct", 1, 5, 40);
        Assert.assertEquals(39, normalProduct.getQuality());
        normalProduct.increaseStay();
        Assert.assertEquals(38, normalProduct.getQuality());
    }

    @Test
    public void getQuality_givenProductBeyondSellInDay_qualityShouldDropWithTwiceSpeed() {
        NormalProduct normalProduct = new NormalProduct("normalProduct", 5, 5, 40);
        Assert.assertEquals(35, normalProduct.getQuality());
        normalProduct.increaseStay();
        Assert.assertEquals(33, normalProduct.getQuality());
    }

    @Test
    public void getQuality_givenProductQualityKeepDropping_qualityShouldLessThanZero() {
        NormalProduct normalProduct = new NormalProduct("normalProduct", 6, 5, 5);
        Assert.assertEquals(0, normalProduct.getQuality());
    }

    @Test
    public void getQuality_givenQueryQuality_qualityShouldBetween0To50() {
        NormalProduct normalProduct = new NormalProduct("normalProduct", 6, 5, -5);
        Assert.assertEquals(0, normalProduct.getQuality());
        NormalProduct normalProduct_1 = new NormalProduct("normalProduct", 0, 5, 55);
        Assert.assertEquals(50, normalProduct_1.getQuality());
    }
}
