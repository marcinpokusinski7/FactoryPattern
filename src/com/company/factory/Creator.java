package com.company.factory;

import com.company.products.Product;

public abstract class Creator {

    public void doMath() {
        Product one = calculate();
        one.sumA();
    }

    public abstract Product calculate();
}
