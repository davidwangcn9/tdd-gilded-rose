package cn.xpbootcamp.gildedrose.product;

import static cn.xpbootcamp.gildedrose.product.ProductConst.AGED_BRIE;

public class AgedBrie extends ProductBase {
    public AgedBrie(int stay, int initialQuality) {
        super(AGED_BRIE, stay, 0, initialQuality);
    }

    @Override
    protected int getCalculatedQuality() {
        return getInitialQuality() + getStay();
    }
}
