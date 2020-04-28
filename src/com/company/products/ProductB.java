package com.company.products;

import static java.lang.Math.abs;

public class ProductB implements Product {

    @Override
    public void sumA() {

        double[] tab = {1, -2, 7.2, 5, -8, 5};
        double wynik = 0;
        int i;
        int n = 6;
        for (i = 0; i < n; i++) {
            wynik = wynik + tab[i];




        }
        System.out.println("Wartość sumy wartości bezwzględnych elementów tablicy: "+abs(wynik));
    }
}
