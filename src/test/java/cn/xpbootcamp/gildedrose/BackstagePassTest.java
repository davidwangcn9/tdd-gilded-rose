package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.product.BackstagePass;
import org.junit.Assert;
import org.junit.Test;

public class BackstagePassTest {
    @Test
    public void getQuality_givenReachingSellInDate_qualityRise() {
        BackstagePass backstagePass = new BackstagePass(1, 15, 10);
        Assert.assertEquals(11, backstagePass.getQuality());
        backstagePass.increaseStay();
        Assert.assertEquals(12, backstagePass.getQuality());
    }

    @Test
    public void getQuality_givenReachingSellInDateLessThan10Days_qualityRise2PointPerDay() {
        BackstagePass backstagePass = new BackstagePass(6, 15, 10);
        Assert.assertEquals(17, backstagePass.getQuality());
        backstagePass.increaseStay();
        Assert.assertEquals(19, backstagePass.getQuality());
    }

    @Test
    public void getQuality_givenReachingSellInDateLessThan5Days_qualityRise3PointPerDay() {
        BackstagePass backstagePass = new BackstagePass(11, 15, 10);
        Assert.assertEquals(28, backstagePass.getQuality());
        backstagePass.increaseStay();
        Assert.assertEquals(31, backstagePass.getQuality());
    }

    @Test
    public void getQuality_givenPassedSellInDate_qualityDropTo0() {
        BackstagePass backstagePass = new BackstagePass(16, 15, 10);
        Assert.assertEquals(0, backstagePass.getQuality());
    }
}
