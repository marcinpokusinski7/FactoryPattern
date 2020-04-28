package com.company.factory;

import com.company.products.Product;
import com.company.products.ProductB;

public class ProductBDialog extends Creator {

    @Override
    public Product calculate() {
        return new ProductB();
    }
}
