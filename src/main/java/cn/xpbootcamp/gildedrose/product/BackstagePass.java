package cn.xpbootcamp.gildedrose.product;

import static cn.xpbootcamp.gildedrose.product.ProductConst.BACKSTAGE_PASS;

public class BackstagePass extends ProductBase {
    public BackstagePass(int stay, int sellInDay, int initialQuality) {
        super(BACKSTAGE_PASS, stay, sellInDay, initialQuality);
    }

    @Override
    protected int getCalculatedQuality() {
        if (getStay() <= getSellInDay()) {
            int daysInNormal = getSellInDay() - 10;
            int qualityIncreased = daysInNormal;
            if (getStay() <= daysInNormal) {
                return getInitialQuality() + getStay();
            } else if (getStay() > daysInNormal && getStay() <= (getSellInDay() - 5)) {
                return getInitialQuality() + qualityIncreased + (getStay() - daysInNormal) * 2;
            } else if (getStay() > (getSellInDay() - 5)) {
                return getInitialQuality() + qualityIncreased + 10 + (getStay() - (getSellInDay() - 5)) * 3;
            }
        }
        return 0;
    }
}
