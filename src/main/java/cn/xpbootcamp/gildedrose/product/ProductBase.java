package cn.xpbootcamp.gildedrose.product;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class ProductBase {
    private String name;
    private int stay;
    private int sellInDay;
    private int initialQuality;

    protected abstract int getCalculatedQuality();

    public int getQuality() {
        int calculatedQuality = getCalculatedQuality();
        if (calculatedQuality > 50) {
            calculatedQuality = 50;
        } else if (calculatedQuality < 0) {
            calculatedQuality = 0;
        }
        return calculatedQuality;
    }

    public void increaseStay() {
        stay = stay + 1;
    }
}
