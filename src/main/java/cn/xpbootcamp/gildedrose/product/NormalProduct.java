package cn.xpbootcamp.gildedrose.product;

public class NormalProduct extends ProductBase {
    public NormalProduct(String name, int stay, int sellInDay, int initialQuality) {
        super(name, stay, sellInDay, initialQuality);
    }

    @Override
    protected int getCalculatedQuality() {
        if (getStay() <= getSellInDay()) {
            return getInitialQuality() - getStay();
        } else {
            return getInitialQuality() - getSellInDay() - (getStay() - getSellInDay()) * 2;
        }
    }
}
