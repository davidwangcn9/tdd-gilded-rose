package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.product.ProductBase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GildedRoseShop {
    private ArrayList<ProductBase> products = new ArrayList<>();

    public void addProduct(ProductBase product) {
        products.add(product);
    }

    public List<ProductDto> queryAllProduct() {
        return products.stream().map(i -> new ProductDto(i.getName(), i.getQuality())).collect(Collectors.toList());
    }

}
