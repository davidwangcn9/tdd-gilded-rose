package cn.xpbootcamp.gildedrose.product;

import static cn.xpbootcamp.gildedrose.product.ProductConst.SULFURAS;

public class Sulfuras extends ProductBase {
    public Sulfuras(int stay, int initialQuality) {
        super(SULFURAS, stay, 0, initialQuality);
    }

    @Override
    protected int getCalculatedQuality() {
        return getInitialQuality();
    }
}
