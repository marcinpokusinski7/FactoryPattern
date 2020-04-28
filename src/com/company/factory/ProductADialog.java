package com.company.factory;

import com.company.products.Product;
import com.company.products.ProductA;

public class ProductADialog extends Creator {

    @Override
    public Product calculate() {
        return new ProductA();
    }
}
