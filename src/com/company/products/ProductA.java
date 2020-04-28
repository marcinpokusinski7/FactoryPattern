package com.company.products;

public class ProductA implements Product {

    @Override
    public void sumA() {


        double[] tab = {1, 2, 7.2, 5, 8.3, 5};
        double wynik = 0;
        int i;
        int n = 6;
        for (i = 0; i < n; i++) {
            wynik = wynik + tab[i];

        }
        System.out.println("Wartość sumy elementów tablicy: " + wynik);
    }

}
